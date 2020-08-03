package com.mastertech.Fatura.controller;

import com.mastertech.Fatura.service.FaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FaturaController {

    @Autowired
    private FaturaService service;

    @PostMapping("/fatura/{clienteId}/{cartaoId}/expirar")
    public ResponseEntity postExpirar(@PathVariable int clienteId, @PathVariable int cartaoId) {
        return ResponseEntity.ok(service.expirar(clienteId, cartaoId));
    }

    @PostMapping("/fatura/{clienteId}/{cartaoId}/pagar")
    public ResponseEntity postPagar(@PathVariable int clienteId, @PathVariable int cartaoId) {
        return ResponseEntity.ok(service.pagar(clienteId, cartaoId));
    }


    @GetMapping("/fatura/{clienteId}/{cartaoId}")
    public ResponseEntity getFaturaPorClienteCartao(@PathVariable int clienteId, @PathVariable int cartaoId) {
        return ResponseEntity.ok(service.buscaFatura(clienteId, cartaoId));
    }
}
