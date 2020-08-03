package com.mastertech.Fatura.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table
public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFatura;
    private int idCartao;
    private Calendar pagoEm;
    private double valorPago;

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

    public Calendar getPagoEm() {
        return pagoEm;
    }

    public void setPagoEm(Calendar pagoEm) {
        this.pagoEm = pagoEm;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
}
