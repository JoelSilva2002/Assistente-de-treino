package com.controlador.carga.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Exercicio")  // Singular é mais comum em bancos de dados
public class Exercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double peso;
    private int repeticoes;
    private LocalDateTime data;

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }
}
