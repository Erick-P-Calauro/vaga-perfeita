package com.erick.vaga_perfeita.Utilidades.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    
    @Bean
    public ModelMapper get() {
        return new ModelMapper();
    }

}
