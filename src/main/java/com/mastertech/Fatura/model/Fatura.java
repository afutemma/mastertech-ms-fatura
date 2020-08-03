package com.mastertech.Fatura.model;

import javax.persistence.*;

@Entity
@Table
public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFatura;
    private int idCartao;
    private double valor;
    private Enum<Status> status;

    public int getIdFatura() {
        return idFatura;
    }

    public void setIdFatura(int idFatura) {
        this.idFatura = idFatura;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Enum<Status> getStatus() {
        return status;
    }

    public void setStatus(Enum<Status> status) {
        this.status = status;
    }
}
