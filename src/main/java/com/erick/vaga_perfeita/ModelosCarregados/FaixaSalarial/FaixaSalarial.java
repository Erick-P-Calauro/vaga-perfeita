package com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial;

import java.util.List;

import com.erick.vaga_perfeita.Vagas.Vaga;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class FaixaSalarial {
    
    @Id
    private Long id;

    @NotNull
    private int menorValor;

    @NotNull
    private int maiorValor;

    @OneToMany(mappedBy = "faixaSalarial")
    private List<Vaga> faixaSalarial_vagas;

    public FaixaSalarial() {

    }

    public FaixaSalarial(Long id, int menor, int maior, List<Vaga> lista) {
        this.id = id;
        this.menorValor = menor;
        this.maiorValor = maior;
        this.faixaSalarial_vagas = lista;
    }

    public String retornarFaixaSalarial() {
        String faixa = menorValor + " - " + maiorValor;
        if(menorValor == 10000) {
            faixa = "Acima de R$10.000";
        }

        return faixa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<Vaga> getFaixaSalarial_vagas() {
        return faixaSalarial_vagas;
    }

    public void setFaixaSalarial_vagas(List<Vaga> faixaSalarial_vagas) {
        this.faixaSalarial_vagas = faixaSalarial_vagas;
    }

}
