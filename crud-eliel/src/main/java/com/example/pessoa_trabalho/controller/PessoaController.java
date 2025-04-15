package com.example.pessoa_trabalho.controller;

import com.example.pessoa_trabalho.dto.PessoaCreateDTO;
import com.example.pessoa_trabalho.dto.PessoaDTO;
import com.example.pessoa_trabalho.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public PessoaDTO criar(@RequestBody PessoaCreateDTO dto) {
        return service.criar(dto);
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
}
