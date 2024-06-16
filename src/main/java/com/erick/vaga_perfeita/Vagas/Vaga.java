package com.erick.vaga_perfeita.Vagas;

import org.springframework.beans.factory.annotation.Value;

import com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial.FaixaSalarial;
import com.erick.vaga_perfeita.ModelosCarregados.Local.Local;
import com.erick.vaga_perfeita.ModelosCarregados.Modalidade.Modalidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 25)
    private String nomeEmpresa;

    @NotBlank
    @Size(min = 8, max = 40)
    private String nomeVaga;

    @NotNull
    private double Salario;

    @NotNull
    @Value(value = "0")
    private int diasDecorridos;

    @ManyToOne
    private FaixaSalarial faixaSalarial;

    @ManyToOne
    private Local local;

    @ManyToOne
    private Modalidade modalidade;

    @NotBlank
    @Size(min = 20, max = 70)
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeVaga() {
        return nomeVaga;
    }

    public void setNomeVaga(String nomeVaga) {
        this.nomeVaga = nomeVaga;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public FaixaSalarial getFaixaSalarial() {
        return faixaSalarial;
    }

    public void setFaixaSalarial(FaixaSalarial faixaSalarial) {
        this.faixaSalarial = faixaSalarial;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public int getDiasDecorridos() {
        return diasDecorridos;
    }

    public void setDiasDecorridos(int diasDecorridos) {
        this.diasDecorridos = diasDecorridos;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    
}
