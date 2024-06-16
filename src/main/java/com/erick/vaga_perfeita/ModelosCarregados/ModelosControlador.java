package com.erick.vaga_perfeita.ModelosCarregados;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial.FaixaServico;
import com.erick.vaga_perfeita.ModelosCarregados.Local.LocalServico;
import com.erick.vaga_perfeita.ModelosCarregados.Modalidade.ModalidadeServico;

@RestController
@RequestMapping("/preload")
public class ModelosControlador {
    
    @Autowired
    FaixaServico fServico;

    @Autowired
    LocalServico lServico;

    @Autowired
    ModalidadeServico mServico;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getModelosCarregados() {
        Map<String, Object> modelos = new HashMap<String, Object>();
        
        modelos.put("Faixas", fServico.listarDTO());
        modelos.put("Locais", lServico.listarDTO());
        modelos.put("Modalidades", mServico.listarDTO());

        return ResponseEntity.ok().body(modelos);
    }

}
