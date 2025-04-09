package com.controlador.carga.service;

import com.controlador.carga.model.Exercicio;
import com.controlador.carga.repository.ExercicioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ExercicioService {

    private final ExercicioRepository repository;

    public ExercicioService(ExercicioRepository repository) {
        this.repository = repository;
    }

    public String adicionarExercicio(Exercicio exercicio) {
        exercicio.setData(LocalDateTime.now());
        repository.save(exercicio);
        return avaliar(exercicio);
    }

    public List<Exercicio> listarPorNome(String nome) {
        return repository.findByNomeOrderByDataDesc(nome);
    }

    private String avaliar(Exercicio e) {
        if (e.getRepeticoes() >= 10) {
            return "Bom trabalho! Considere aumentar o peso até conseguir fazer apenas 6 Reps.";
        } else if (e.getRepeticoes() < 7) {
            return "Aumente as repetições até 12 com este mesmo peso, após, aumente novamente o peso até conseguir fazer no maximo 6.";
        } else {
            return "Continue aumentando gradualmente as repetições.";
        }
    }
}

