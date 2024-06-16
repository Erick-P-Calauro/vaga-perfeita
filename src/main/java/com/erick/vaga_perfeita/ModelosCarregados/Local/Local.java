package com.erick.vaga_perfeita.ModelosCarregados.Local;

import java.util.List;

import com.erick.vaga_perfeita.Vagas.Vaga;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Local {
    
    @Id
    private Long id;

    @NotBlank
    private String nome;

    @OneToMany(mappedBy = "local")
    private List<Vaga> local_vagas;

    public Local() {

    }

    public Local(Long id, String nome, List<Vaga> lista) {
        this.id = id;
        this.nome = nome;
        this.local_vagas = lista;
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

    public List<Vaga> getLocal_vagas() {
        return local_vagas;
    }

    public void setLocal_vagas(List<Vaga> local_vagas) {
        this.local_vagas = local_vagas;
    }

    

}
