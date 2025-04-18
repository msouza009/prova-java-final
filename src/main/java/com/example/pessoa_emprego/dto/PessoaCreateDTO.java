package com.example.pessoa_emprego.dto;

public class PessoaCreateDTO {

    private String nome;
    private long cpf;
    private Long empregoId;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {  // Alterado de int para long
        return cpf;
    }

    public void setCpf(long cpf) {  // Alterado de int para long
        this.cpf = cpf;
    }

    public Long getEmpregoId() {
        return empregoId;
    }

    public void setEmpregoId(Long empregoId) {
        this.empregoId = empregoId;
    }
}
