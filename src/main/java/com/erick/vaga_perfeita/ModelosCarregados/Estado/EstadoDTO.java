package com.erick.vaga_perfeita.ModelosCarregados.Estado;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstadoDTO {
    
    @Id
    private Long id;
    
    private String nome;
}
