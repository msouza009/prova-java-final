package com.example.pessoa_emprego.dto;

public class EmpregoDTO {

    private Long id;
    private String endereco;

    public EmpregoDTO(Long id, String endereco) {
        this.id = id;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
