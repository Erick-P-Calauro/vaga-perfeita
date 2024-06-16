package com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class FaixaDTO {

    @Id
    private Long id;

    @NotNull
    private int menorValor;

    @NotNull
    private int maiorValor;

    
    public int getMenorValor() {
        return menorValor;
    }

    public void setMenorValor(int menorValor) {
        this.menorValor = menorValor;
    }

    public int getMaiorValor() {
        return maiorValor;
    }

    public void setMaiorValor(int maiorValor) {
        this.maiorValor = maiorValor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
