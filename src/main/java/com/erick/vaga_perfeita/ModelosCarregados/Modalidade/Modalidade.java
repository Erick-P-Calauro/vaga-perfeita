package com.erick.vaga_perfeita.ModelosCarregados.Modalidade;

import java.util.List;

import com.erick.vaga_perfeita.Vagas.Vaga;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Modalidade {
    
    @Id
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "modalidade")
    private List<Vaga> modalidade_vagas;

    public Modalidade() {

    }

    public Modalidade(Long id, String nome, List<Vaga> lista) {
        this.id = id;
        this.nome = nome;
        this.modalidade_vagas = lista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

