package com.example.pessoa_trabalho.repository;

import com.example.pessoa_trabalho.model.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {}