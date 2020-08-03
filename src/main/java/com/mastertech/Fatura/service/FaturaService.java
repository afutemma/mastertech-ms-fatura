package com.mastertech.Fatura.service;

import com.mastertech.Fatura.client.CartaoClient;
import com.mastertech.Fatura.client.PagamentoClient;
import com.mastertech.Fatura.dto.ExpirarRequestDTO;
import com.mastertech.Fatura.dto.ExpirarResponseDTO;
import com.mastertech.Fatura.dto.PagarResponseDTO;
import com.mastertech.Fatura.model.Cartao;
import com.mastertech.Fatura.model.Fatura;
import com.mastertech.Fatura.model.Pagamento;
import com.mastertech.Fatura.repository.FaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class FaturaService {

    @Autowired
    private FaturaRepository repository;
    @Autowired
    private CartaoClient cartaoClient;
    @Autowired
    private PagamentoClient pagamentoClient;

    public List<Pagamento> buscaFatura(int clienteId, int cartaoId){
        Cartao cartao = cartaoClient.getCartaoPorCartaoCliente(cartaoId, clienteId);
        return pagamentoClient.listarByNumero(cartaoId);
    }

    public PagarResponseDTO pagar(int clienteId, int cartaoId){
        PagarResponseDTO pagarResponseDTO = new PagarResponseDTO();
        Fatura fatura = new Fatura();
        Cartao cartao = cartaoClient.getCartaoPorCartaoCliente(cartaoId, clienteId);
        List<Pagamento> pagamentos = pagamentoClient.listarByNumero(cartaoId);
        double valorPago = 0;

        for(Pagamento pg : pagamentos){
            valorPago += pg.getValor();
        }

        int ok = pagamentoClient.pagar(cartaoId);

        fatura.setIdCartao(cartaoId);
        fatura.setPagoEm(Calendar.getInstance());
        fatura.setValorPago(valorPago);
        fatura = repository.save(fatura);

        pagarResponseDTO.setId(fatura.getIdFatura());
        pagarResponseDTO.setPagoEm(Calendar.getInstance());
        pagarResponseDTO.setValorPago(valorPago);

        return pagarResponseDTO;
    }

    public ExpirarResponseDTO expirar(int clienteId, int cartaoId){
        ExpirarResponseDTO expirarResponseDTO = new ExpirarResponseDTO();
        ExpirarRequestDTO expirarRequestDTO = new ExpirarRequestDTO();
        Cartao cartao = cartaoClient.getCartaoPorCartaoCliente(cartaoId, clienteId);

        expirarRequestDTO.setAtivar(false);
        expirarResponseDTO.setStatus("ok");

        cartaoClient.setStatus(cartao.getNumero(), expirarRequestDTO);

        return expirarResponseDTO;
    }

}
