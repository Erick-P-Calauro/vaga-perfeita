package com.erick.vaga_perfeita.Vagas;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial.FaixaSalarial;
import com.erick.vaga_perfeita.ModelosCarregados.Local.Local;
import com.erick.vaga_perfeita.ModelosCarregados.Modalidade.Modalidade;

public interface VagaRepositorio extends JpaRepository<Vaga, UUID> {
    List<Vaga> findAllByFaixaSalarialOrLocalOrModalidade(FaixaSalarial faixaSalarial, Local loca, Modalidade modalidade);
    
}
