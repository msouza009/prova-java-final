package com.example.pessoa_emprego.services;

import com.example.pessoa_emprego.dto.PessoaCreateDTO;
import com.example.pessoa_emprego.dto.PessoaDTO;
import com.example.pessoa_emprego.model.Pessoa;
import com.example.pessoa_emprego.model.Emprego;
import com.example.pessoa_emprego.repository.PessoaRepository;
import com.example.pessoa_emprego.repository.EmpregoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepo;

    @Autowired
    private EmpregoRepository empregoRepo;

    public PessoaDTO create(PessoaCreateDTO dto) {
        Emprego emprego = empregoRepo.findById(dto.getEmpregoId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Emprego não encontrado"));

        Pessoa pessoa = new Pessoa(dto.getNome(), dto.getCpf(), emprego);
        pessoa = pessoaRepo.save(pessoa);
        return toDTO(pessoa);
    }

    public PessoaDTO atualizar(Long id, PessoaCreateDTO dto) {
        Pessoa pessoa = pessoaRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrada"));

        Emprego emprego = empregoRepo.findById(dto.getEmpregoId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Emprego não encontrado"));

        pessoa.setNome(dto.getNome());
        pessoa.setCpf(dto.getCpf());
        pessoa.setEmprego(emprego);

        pessoa = pessoaRepo.save(pessoa);

        return toDTO(pessoa);
    }

    public List<PessoaDTO> listar() {
        return pessoaRepo.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public PessoaDTO buscar(Long id) {
        return pessoaRepo.findById(id).map(this::toDTO).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrada"));
    }

    public void deletar(Long id) {
        if (!pessoaRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrada");
        }
        pessoaRepo.deleteById(id);
    }

    private PessoaDTO toDTO(Pessoa p) {
        return new PessoaDTO(p.getId(), p.getNome(), p.getCpf(), p.getEmprego().getEndereco());
    }
}
