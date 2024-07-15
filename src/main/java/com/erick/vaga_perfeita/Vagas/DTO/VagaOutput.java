package com.erick.vaga_perfeita.Vagas.DTO;

import java.util.UUID;

import com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial.FaixaDTO;
import com.erick.vaga_perfeita.ModelosCarregados.Local.LocalDTO;
import com.erick.vaga_perfeita.ModelosCarregados.Modalidade.ModalidadeDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VagaOutput {
    
    private UUID id;

    private String nomeEmpresa;

    private String nomeVaga;

    private double salario;

    private String descricao;

    private FaixaDTO faixaSalarial;

    private LocalDTO local;

    private ModalidadeDTO modalidade;
}
