package com.controlador.carga.controller;

import com.controlador.carga.model.Exercicio;
import com.controlador.carga.service.ExercicioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicios")  // Plural é mais comum em APIs REST
public class ExercicioController {

    private final ExercicioService exercicioService;

    public ExercicioController(ExercicioService exercicioService) {
        this.exercicioService = exercicioService;
    }

    @PostMapping
    public ResponseEntity<String> adicionarExercicio(@RequestBody Exercicio exercicio) {
        try {
            String resultado = exercicioService.adicionarExercicio(exercicio);
            return ResponseEntity.ok(resultado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao adicionar exercício");
        }
    }

    @GetMapping("/historico/{nome}")
    public ResponseEntity<List<Exercicio>> listarHistorico(@PathVariable String nome) {
        try {
            return ResponseEntity.ok(exercicioService.listarPorNome(nome));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}