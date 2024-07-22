package com.erick.vaga_perfeita.ModelosCarregados.Estado;

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
public class Estado {
    
    @Id
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "estado")
    private List<Vaga> local_vagas;
}
