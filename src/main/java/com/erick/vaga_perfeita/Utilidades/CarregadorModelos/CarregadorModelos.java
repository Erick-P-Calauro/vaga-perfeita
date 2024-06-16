package com.erick.vaga_perfeita.Utilidades.CarregadorModelos;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial.FaixaSalarial;
import com.erick.vaga_perfeita.ModelosCarregados.FaixaSalarial.FaixaServico;
import com.erick.vaga_perfeita.ModelosCarregados.Local.Local;
import com.erick.vaga_perfeita.ModelosCarregados.Local.LocalServico;
import com.erick.vaga_perfeita.ModelosCarregados.Modalidade.Modalidade;
import com.erick.vaga_perfeita.ModelosCarregados.Modalidade.ModalidadeServico;
import com.erick.vaga_perfeita.Utilidades.CarregadorModelos.Valores.FaixasSalariais;
import com.erick.vaga_perfeita.Utilidades.CarregadorModelos.Valores.Locais;
import com.erick.vaga_perfeita.Utilidades.CarregadorModelos.Valores.Modalidades;
import com.erick.vaga_perfeita.Vagas.Vaga;
import jakarta.transaction.Transactional;

@Component
@Transactional
public class CarregadorModelos implements CommandLineRunner{

    @Autowired
    FaixaServico fServico;

    @Autowired
    LocalServico lServico;

    @Autowired
    ModalidadeServico mServico;

    @Override
    public void run(String... args) throws Exception {  
        Long id = (long) 0;

        for(int[] faixa : FaixasSalariais.retornar()) {
            if(fServico.verificar(id) == false) {
                fServico.salvar(new FaixaSalarial(id, faixa[0], faixa[1], new ArrayList<Vaga>()));
                id++;
            }
        }
        id = (long) 0;

        for(String local : Locais.retornar()) {
            if(lServico.verificar(id) == false) {
                lServico.salvar(new Local(id, local, new ArrayList<Vaga>()));
                id++;
            }
        }
        id = (long) 0;

        for(String modalidade : Modalidades.retornar()) {
            if(mServico.verificar(id) == false) {
                mServico.salvar(new Modalidade(id, modalidade, new ArrayList<Vaga>()));
                id++;
            }
        }

    }
}
