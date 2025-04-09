package com.controlador.carga.repository;

import com.controlador.carga.model.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {
    List<Exercicio> findByNomeOrderByDataDesc(String nome);
}