package com.erick.vaga_perfeita.Vagas;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial.FaixaSalarial;
import com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial.FaixaServico;
import com.erick.vaga_perfeita.ModelosCarregados.Local.Local;
import com.erick.vaga_perfeita.ModelosCarregados.Local.LocalServico;
import com.erick.vaga_perfeita.ModelosCarregados.Modalidade.Modalidade;
import com.erick.vaga_perfeita.ModelosCarregados.Modalidade.ModalidadeServico;
import com.erick.vaga_perfeita.Vagas.DTO.VagaInput;

@Service
public class VagaServico {
 
    @Autowired
    VagaRepositorio repositorio;

    @Autowired
    FaixaServico faixaServico;

    @Autowired
    LocalServico localServico;

    @Autowired
    ModalidadeServico modalidadeServico;

    @Autowired
    ModelMapper mapper;

    public Vaga mapearVaga(VagaInput dadosVaga) {
        Vaga novaVaga = mapper.map(dadosVaga, Vaga.class);
        
        FaixaSalarial faixa = faixaServico.buscar(dadosVaga.getFaixaSalarial());
        Local local = localServico.buscar(dadosVaga.getLocal());
        Modalidade modalidade = modalidadeServico.buscar(dadosVaga.getModalidade());

        novaVaga.setFaixaSalarial(faixa);
        novaVaga.setLocal(local);
        novaVaga.setModalidade(modalidade);

        return novaVaga;
    }

    public Vaga salvar(VagaInput dadosVaga) {
        return repositorio.save(mapearVaga(dadosVaga));
    }

    public List<Vaga> listar() {
        return repositorio.findAll();
    }

    public Optional<Vaga> buscar(UUID id) {
        Optional<Vaga> vaga = repositorio.findById(id);
        
        if(vaga.isEmpty()) {
            return null;
        }
        
        return repositorio.findById(id);
    }

    public List<Vaga> buscarFiltro(Long idFaixa, Long idLocal, Long idModalidade) {
        FaixaSalarial faixa = null;
        Local local = null;
        Modalidade modalidade = null;
        
        if(idFaixa != null) {
            faixa = faixaServico.buscar(idFaixa);
        }

        if(idLocal != null) {
            local = localServico.buscar(idLocal);
        }

        if(idModalidade != null) {
            modalidade = modalidadeServico.buscar(idModalidade);
        }
        
        List<Vaga> vagas = repositorio.findAllByFaixaSalarialOrLocalOrModalidade(
            faixa, 
            local, 
            modalidade);

        return vagas;
    }

    public Vaga editar(VagaInput dadosVaga, UUID id) {
        Vaga vagaEditada = mapearVaga(dadosVaga);
        vagaEditada.setId(id);

        return repositorio.save(vagaEditada);
    }

    public void deletar(Vaga vaga) {
        repositorio.delete(vaga);
    }

}
