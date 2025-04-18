package com.example.pessoa_emprego.repository;

import com.example.pessoa_emprego.model.Emprego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpregoRepository extends JpaRepository<Emprego, Long> {}
