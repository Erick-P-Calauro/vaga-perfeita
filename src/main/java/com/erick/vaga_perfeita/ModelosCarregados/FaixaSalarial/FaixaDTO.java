package com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FaixaDTO {

    @Id
    private Long id;

    private int menorValor;

    private int maiorValor;  
}
