package com.example.pessoa_emprego.dto;

public class PessoaCreateDTO {

    private String nome;
    private long cpf;
    private Long empregoId;  // ID do emprego associado

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

    public Long getEmpregoId() {
        return empregoId;
    }

    public void setEmpregoId(Long empregoId) {
        this.empregoId = empregoId;
    }
}
