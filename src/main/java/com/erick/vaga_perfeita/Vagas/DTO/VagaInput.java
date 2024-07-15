package com.erick.vaga_perfeita.Vagas.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VagaInput {

    private String nomeEmpresa;

    private String nomeVaga;

    private double salario;

    private int diasDecorridos;

    private String descricao;

    private Long faixaSalarial;

    private Long local;

    private Long modalidade;

}
