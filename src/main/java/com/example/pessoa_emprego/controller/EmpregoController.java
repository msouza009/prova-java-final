package com.example.pessoa_emprego.controller;

import com.example.pessoa_emprego.dto.EmpregoCreateDTO;
import com.example.pessoa_emprego.dto.EmpregoDTO;
import com.example.pessoa_emprego.services.EmpregoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empregos")
public class EmpregoController {

    @Autowired
    private EmpregoService service;

    @PostMapping
    public EmpregoDTO create(@RequestBody EmpregoCreateDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<EmpregoDTO> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public EmpregoDTO buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
