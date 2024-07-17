package com.erick.vaga_perfeita.Utilidades.AtualizadorTempoDecorrido;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.erick.vaga_perfeita.Vagas.Vaga;
import com.erick.vaga_perfeita.Vagas.VagaServico;
import jakarta.transaction.Transactional;

@Transactional
@Component
public class AtualizadorTempoDecorrido implements CommandLineRunner {
    
    @Autowired
    VagaServico servico;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("[COMMANDLINERUNNER] => ATUALIZADOR DE TEMPO DECORRIDO RODANDO...");
        
        Timer timer = new Timer();
        List<Vaga> vagas = servico.listar();

        timer.schedule(new TimerTask() {
            
            @Override
            public void run() {
                vagas.forEach((vaga) -> {
                    vaga.setTempoDecorrido(vaga.getTempoDecorrido() + 1);
                });

                System.out.println("Tempo decorrido atualizado.");
            }

        }, 3600 * 24);
    }
}
