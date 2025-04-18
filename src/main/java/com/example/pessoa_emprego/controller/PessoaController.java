package com.example.pessoa_emprego.controller;

import com.example.pessoa_emprego.dto.PessoaCreateDTO;
import com.example.pessoa_emprego.dto.PessoaDTO;
import com.example.pessoa_emprego.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public PessoaDTO create(@RequestBody PessoaCreateDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<PessoaDTO> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public PessoaDTO buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public PessoaDTO atualizar(@PathVariable Long id, @RequestBody PessoaCreateDTO dto) {
        return service.atualizar(id, dto);
    }
}
