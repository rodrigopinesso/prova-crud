package com.example.pessoa_trabalho.services;


import com.example.pessoa_trabalho.dto.TrabalhoCreateDTO;
import com.example.pessoa_trabalho.dto.TrabalhoDTO;
import com.example.pessoa_trabalho.model.Trabalho;
import com.example.pessoa_trabalho.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository repo;

    public TrabalhoDTO criar(TrabalhoCreateDTO dto) {
        Trabalho trabalho = new Trabalho(dto.getCargo(), dto.getSalario());
        trabalho = repo.save(trabalho);
        return new TrabalhoDTO(trabalho.getId(), trabalho.getCargo(), trabalho.getSalario());
    }

    public List<TrabalhoDTO> listar() {
        return repo.findAll().stream().map(t -> new TrabalhoDTO(t.getId(), t.getCargo(), t.getSalario())).collect(Collectors.toList());
    }

    public TrabalhoDTO buscar(Long id) {
        return repo.findById(id).map(t -> new TrabalhoDTO(t.getId(), t.getCargo(), t.getSalario())).orElse(null);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
