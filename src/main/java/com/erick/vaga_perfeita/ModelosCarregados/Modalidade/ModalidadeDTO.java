package com.erick.vaga_perfeita.ModelosCarregados.Modalidade;

import jakarta.persistence.Id;

public class ModalidadeDTO {
    
    @Id
    private Long id;
    
    private String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
