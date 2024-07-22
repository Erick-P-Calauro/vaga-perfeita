package com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaixaServico {

    @Autowired
    FaixaRepositorio repositorio;

    @Autowired
    ModelMapper mapper;

    public void salvar(FaixaSalarial faixa) {
        repositorio.save(faixa);
        System.out.println("Faixa " + faixa.getId() + " cadastrada com sucesso.");
    }

    public List<FaixaSalarial> listar() {
        return repositorio.findAll();
    }

    public FaixaSalarial buscar(Long id) {
        Optional<FaixaSalarial> faixa = repositorio.findById(id);

        if(faixa.isEmpty()) {
            // Mudar para erro personalizado
            return null;
        }

        System.out.print("FAIXA SALARIAL =>"+ faixa.get().toString());
        
        return faixa.get();
    }

    public Boolean verificar(Long id) {
        Optional<FaixaSalarial> faixa = repositorio.findById(id);

        if(faixa.isPresent()) {
            return true;
        }

        return false;
    }

    public List<FaixaDTO> listarDTO() {
        return repositorio.findAll()
                .stream()
                .map(faixa -> mapper.map(faixa, FaixaDTO.class))
                .collect(Collectors.toList());
    }

}