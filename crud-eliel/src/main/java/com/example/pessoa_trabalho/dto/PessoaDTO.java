package com.example.pessoa_trabalho.dto;

public class PessoaDTO {
    private Long id;
    private String nome;
    private int idade;
    private String cargo;
    private Double salario;

    public PessoaDTO(Long id, String nome, int idade, String cargo, Double salario) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}