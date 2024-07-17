package com.erick.vaga_perfeita.Vagas;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.erick.vaga_perfeita.Vagas.DTO.VagaFiltros;
import com.erick.vaga_perfeita.Vagas.DTO.VagaInput;
import com.erick.vaga_perfeita.Vagas.DTO.VagaOutput;

@RestController
@RequestMapping("/vagas")
public class VagaControlador {
 
    @Autowired
    VagaServico vagaServico;

    @Autowired
    ModelMapper mapper;

    @PostMapping
    public ResponseEntity<VagaOutput> criarVaga(@RequestBody VagaInput dadosVaga, BindingResult brs) {        
        if(dadosVaga.getDescricao().length() < 100 || dadosVaga.getDescricao().length() > 400) {
            return ResponseEntity.status(400).build();
        }
        
        Vaga novaVaga = vagaServico.salvar(dadosVaga);
        
        return ResponseEntity.ok(mapper.map(novaVaga, VagaOutput.class));
    }

    @GetMapping
    public ResponseEntity<List<VagaOutput>> listarVagas() {
        List<Vaga> vagas = vagaServico.listar();

        return ResponseEntity.ok(vagas.stream().map(vaga -> mapper.map(vaga, VagaOutput.class)).toList());
    }

    @PostMapping("/filtrar")
    public ResponseEntity<List<VagaOutput>> listarVagasFiltro(@RequestBody VagaFiltros filtros) {
        List<Vaga> vagas = vagaServico.buscarFiltro(filtros.getFaixaSalarial(), filtros.getLocal(), filtros.getModalidade());

        return ResponseEntity.ok(vagas.stream().map(vaga -> mapper.map(vaga, VagaOutput.class)).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VagaOutput> buscarVaga(@PathVariable("id") UUID id) {
        Optional<Vaga> vaga = vagaServico.buscar(id);

        if(vaga.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(mapper.map(vaga.get(), VagaOutput.class));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VagaOutput> editarVaga(@PathVariable("id") UUID id, @RequestBody VagaInput dadosVaga) {
        Vaga vagaEditada = vagaServico.editar(dadosVaga, id);

        return ResponseEntity.ok(mapper.map(vagaEditada, VagaOutput.class));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deletarVaga(@PathVariable("id") UUID id) {
        vagaServico.deletar(vagaServico.buscar(id).get());

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
