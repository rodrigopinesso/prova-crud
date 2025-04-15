package com.example.pessoa_trabalho.repository;

import com.example.pessoa_trabalho.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {}