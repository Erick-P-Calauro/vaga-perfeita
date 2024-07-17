package com.erick.vaga_perfeita.Vagas;

import java.util.UUID;
import com.erick.vaga_perfeita.ModelosCarregados.Estado.Estado;
import com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial.FaixaSalarial;
import com.erick.vaga_perfeita.ModelosCarregados.Modalidade.Modalidade;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nomeEmpresa;

    @Column(nullable = false)
    private String nomeVaga;

    @Column(nullable = false)
    private double salario;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private int tempoDecorrido;

    @Column(nullable = false, columnDefinition = "text")
    private String descricao;

    @ManyToOne
    private FaixaSalarial faixaSalarial;

    @ManyToOne
    private Estado local;

    @ManyToOne
    private Modalidade modalidade;
}
