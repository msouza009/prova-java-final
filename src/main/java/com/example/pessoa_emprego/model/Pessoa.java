package com.example.pessoa_emprego.model;

import jakarta.persistence.*;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private long cpf;

    @ManyToOne
    @JoinColumn(name = "emprego_id")
    private Emprego emprego;

    public Pessoa() {
    }

    public Pessoa(String nome, long cpf, Emprego emprego) {
        this.nome = nome;
        this.cpf = cpf;
        this.emprego = emprego;
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

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Emprego getEmprego() {
        return emprego;
    }

    public void setEmprego(Emprego emprego) {
        this.emprego = emprego;
    }
}
