package com.erick.vaga_perfeita.ModelosCarregados.Estado;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoServico {
    
    @Autowired
    EstadoRepositorio repositorio;

    @Autowired
    ModelMapper mapper;

    public void salvar(Estado local) {
        repositorio.save(local);
        System.out.println("Local " + local.getId() + " cadastrado com sucesso.");
    }

    public List<Estado> listar() {
        return repositorio.findAll();
    }

    public Estado buscar(Long id) {
        Optional<Estado> local = repositorio.findById(id);

        if(local.isEmpty()) {
            // Mudar para erro personalizado
            return null;
        }

        return local.get();
    }

    public Boolean verificar(Long id) {
        Optional<Estado> faixa = repositorio.findById(id);

        if(faixa.isPresent()) {
            return true;
        }

        return false;
    }

    public List<EstadoDTO> listarDTO() {
        return repositorio.findAll()
            .stream()
            .map(local -> mapper.map(local, EstadoDTO.class))
            .collect(Collectors.toList());
    }
}
