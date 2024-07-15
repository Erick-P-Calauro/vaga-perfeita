package com.erick.vaga_perfeita.ModelosCarregados.Local;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalServico {
    
    @Autowired
    LocalRepositorio repositorio;

    @Autowired
    ModelMapper mapper;

    public void salvar(Local local) {
        repositorio.save(local);
        System.out.println("Local " + local.getId() + " cadastrado com sucesso.");
    }

    public List<Local> listar() {
        return repositorio.findAll();
    }

    public Local buscar(Long id) {
        Optional<Local> local = repositorio.findById(id);

        if(local.isEmpty()) {
            return null;
        }

        return local.get();
    }

    public Boolean verificar(Long id) {
        Optional<Local> faixa = repositorio.findById(id);

        if(faixa.isPresent()) {
            return true;
        }

        return false;
    }

    public List<LocalDTO> listarDTO() {
        return repositorio.findAll()
            .stream()
            .map(local -> mapper.map(local, LocalDTO.class))
            .collect(Collectors.toList());
    }
}
