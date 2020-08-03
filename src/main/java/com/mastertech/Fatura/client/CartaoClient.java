package com.mastertech.Fatura.client;

import com.mastertech.Fatura.dto.ExpirarRequestDTO;
import com.mastertech.Fatura.model.Cartao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="cartao")
public interface CartaoClient {

    @GetMapping("v1/cartao/byId/{id}")
    Cartao getCartaoPorId(@PathVariable int id);

    @GetMapping("v1/cartao/{idCartao}/cliente/{idCliente}")
    Cartao getCartaoPorCartaoCliente(@PathVariable int idCartao, @PathVariable int idCliente);

    @PatchMapping("v1/cartao/{numero}")
    Cartao setStatus(@PathVariable String numero, @RequestBody ExpirarRequestDTO status);

}
