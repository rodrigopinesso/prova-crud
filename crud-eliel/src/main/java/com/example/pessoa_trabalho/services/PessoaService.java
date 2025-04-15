package com.example.pessoa_trabalho.services;

import com.example.pessoa_trabalho.dto.PessoaCreateDTO;
import com.example.pessoa_trabalho.dto.PessoaDTO;
import com.example.pessoa_trabalho.model.Pessoa;
import com.example.pessoa_trabalho.model.Trabalho;
import com.example.pessoa_trabalho.repository.PessoaRepository;
import com.example.pessoa_trabalho.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepo;

    @Autowired
    private TrabalhoRepository trabalhoRepo;

    public PessoaDTO criar(PessoaCreateDTO dto) {
        Trabalho trabalho = trabalhoRepo.findById(dto.getTrabalhoId()).orElseThrow();
        Pessoa pessoa = new Pessoa(dto.getNome(), dto.getIdade(), trabalho);
        pessoa = pessoaRepo.save(pessoa);
        return toDTO(pessoa);
    }

    public List<PessoaDTO> listar() {
        return pessoaRepo.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public PessoaDTO buscar(Long id) {
        return pessoaRepo.findById(id).map(this::toDTO).orElse(null);
    }

    public void deletar(Long id) {
        pessoaRepo.deleteById(id);
    }

    private PessoaDTO toDTO(Pessoa p) {
        return new PessoaDTO(p.getId(), p.getNome(), p.getIdade(), p.getTrabalho().getCargo(), p.getTrabalho().getSalario());
    }
}
