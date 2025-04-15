package com.example.pessoa_trabalho.controller;

import com.example.pessoa_trabalho.dto.TrabalhoCreateDTO;
import com.example.pessoa_trabalho.dto.TrabalhoDTO;
import com.example.pessoa_trabalho.services.TrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabalhos")
public class TrabalhoController {

    @Autowired
    private TrabalhoService service;

    @PostMapping
    public TrabalhoDTO criar(@RequestBody TrabalhoCreateDTO dto) {
        return service.criar(dto);
    }

    @GetMapping
    public List<TrabalhoDTO> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public TrabalhoDTO buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
