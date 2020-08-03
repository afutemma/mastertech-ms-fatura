package com.mastertech.Fatura.client;

import com.mastertech.Fatura.model.Pagamento;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name="pagamento", configuration = ClientsConfiguration.class)
public interface PagamentoClient {

    @PostMapping("/v1/pagamento/pagar/{id}/")
    int pagar(@PathVariable int id);

    @GetMapping("/v1/pagamentos/{id}/")
    List<Pagamento> listarByNumero(@PathVariable int id);
}
