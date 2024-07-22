package com.erick.vaga_perfeita.Vagas.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VagaFiltros {
    
    private Long[] faixasSalariais;
    
    private Long[] estados;

    private Long[] modalidades;
}
