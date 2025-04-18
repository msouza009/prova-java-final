package com.example.pessoa_emprego.repository;

import com.example.pessoa_emprego.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {}
