package com.erick.vaga_perfeita.ModelosCarregados.Local;

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
public class Local {
    
    @Id
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "local")
    private List<Vaga> local_vagas;
}
