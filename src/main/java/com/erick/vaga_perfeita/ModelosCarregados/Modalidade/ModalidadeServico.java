package com.erick.vaga_perfeita.ModelosCarregados.Modalidade;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModalidadeServico {
    
    @Autowired
    ModalidadeRepositorio repositorio;

    @Autowired
    ModelMapper mapper;

    public void salvar(Modalidade modalidade) {
        repositorio.save(modalidade);
        System.out.println("Modalidade " + modalidade.getId() + " cadastrada com sucesso.");
    }

    public List<Modalidade> listar() {
        return repositorio.findAll();
    }

    public Modalidade buscar(Long id) {
        Optional<Modalidade> modalidade = repositorio.findById(id);

        if(modalidade.isEmpty()) {
            // Mudar para erro personalizado
            return null;
        }

        return modalidade.get();
    }

    public Boolean verificar(Long id) {
        Optional<Modalidade> faixa = repositorio.findById(id);

        if(faixa.isPresent()) {
            return true;
        }

        return false;
    }

    public List<ModalidadeDTO> listarDTO() {
        return repositorio.findAll()
            .stream()
            .map(modalidade -> mapper.map(modalidade, ModalidadeDTO.class))
            .collect(Collectors.toList());
    }

}
