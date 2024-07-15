package com.erick.vaga_perfeita.ModelosCarregados.Modalidade;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ModalidadeDTO {
    
    @Id
    private Long id;
    
    private String nome;
}
