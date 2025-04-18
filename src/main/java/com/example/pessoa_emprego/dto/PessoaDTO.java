package com.example.pessoa_emprego.dto;

public class PessoaDTO {

    private Long id;
    private String nome;
    private Long cpf;  // Alterado para Long
    private String cargo;
    private Double salario;

    public PessoaDTO(Long id, String nome, Long cpf, String cargo, Double salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;  // Alterado para Long
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

    public Long getCpf() {  // Alterado para Long
        return cpf;
    }

    public void setCpf(Long cpf) {  // Alterado para Long
        this.cpf = cpf;
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
