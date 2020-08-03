package com.mastertech.Fatura.client;

import com.mastertech.Fatura.model.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="cliente", configuration = ClientsConfiguration.class)
public interface ClienteClient {

    @GetMapping("/v1/cliente/{id}")
    Cliente getClientePorId(@PathVariable String id);

}
