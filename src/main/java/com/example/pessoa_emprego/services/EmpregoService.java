package com.example.pessoa_emprego.services;

import com.example.pessoa_emprego.dto.EmpregoCreateDTO;
import com.example.pessoa_emprego.dto.EmpregoDTO;
import com.example.pessoa_emprego.model.Emprego;
import com.example.pessoa_emprego.repository.EmpregoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpregoService {

    @Autowired
    private EmpregoRepository repo;

    public EmpregoDTO create(EmpregoCreateDTO dto) {
        Emprego emprego = new Emprego(dto.getCargo(), dto.getSalario());
        emprego = repo.save(emprego);
        return new EmpregoDTO(emprego.getId(), emprego.getCargo(), emprego.getSalario());
    }

    public List<EmpregoDTO> listar() {
        return repo.findAll().stream().map(e -> new EmpregoDTO(e.getId(), e.getCargo(), e.getSalario())).collect(Collectors.toList());
    }

    public EmpregoDTO buscar(Long id) {
        return repo.findById(id).map(e -> new EmpregoDTO(e.getId(), e.getCargo(), e.getSalario())).orElse(null);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
