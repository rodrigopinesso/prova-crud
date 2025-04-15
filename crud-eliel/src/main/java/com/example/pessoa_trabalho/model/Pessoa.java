package com.example.pessoa_trabalho.model;

import jakarta.persistence.*;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;

    @OneToOne
    @JoinColumn(name = "trabalho_id", nullable = false)
    private Trabalho trabalho;

    public Pessoa () {}

    public Pessoa(String nome, int idade, Trabalho trabalho) {
        this.nome = nome;
        this.idade = idade;
        this.trabalho = trabalho;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }
}
