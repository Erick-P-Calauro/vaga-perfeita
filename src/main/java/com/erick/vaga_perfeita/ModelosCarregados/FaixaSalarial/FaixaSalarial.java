package com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial;

import java.util.List;
import com.erick.vaga_perfeita.Vagas.Vaga;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FaixaSalarial {
    
    @Id
    private Long id;

    private int menorValor;

    private int maiorValor;

    @OneToMany(mappedBy = "faixaSalarial")
    private List<Vaga> faixaSalarial_vagas;
}
