package com.mastertech.Fatura.client;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class ClientsConfiguration {

    @Bean
    public ErrorDecoder getErrorDecoder(){
        return new ClientsDecoder();
    }
}
