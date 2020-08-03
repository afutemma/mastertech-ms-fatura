package com.mastertech.Fatura.service;

import com.mastertech.Fatura.client.CartaoClient;
import com.mastertech.Fatura.client.ClienteClient;
import com.mastertech.Fatura.model.Fatura;
import com.mastertech.Fatura.repository.FaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class FaturaService {

    @Autowired
    private FaturaRepository repository;
    @Autowired
    private CartaoClient cartaoClient;
    @Autowired
    private ClienteClient clienteClient;

    public Fatura buscaFatura(int clienteId, int cartaoId){
        Fatura fatura = new Fatura();

        return fatura;
    }

    public Fatura pagar(int clienteId, int cartaoId){
        Fatura fatura = new Fatura();

        return fatura;
    }

    public Fatura expirar(int clienteId, int cartaoId){
        Fatura fatura = new Fatura();

        return fatura;
    }

}
