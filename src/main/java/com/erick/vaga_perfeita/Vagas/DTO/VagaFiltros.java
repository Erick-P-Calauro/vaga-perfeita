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
    
    private Long faixaSalarial;
    
    private Long local;

    private Long modalidade;
}
