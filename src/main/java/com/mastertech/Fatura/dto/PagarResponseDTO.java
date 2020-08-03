package com.mastertech.Fatura.dto;

import java.util.Calendar;

public class PagarResponseDTO {

    private int id;
    private double valorPago;
    private Calendar pagoEm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public Calendar getPagoEm() {
        return pagoEm;
    }

    public void setPagoEm(Calendar pagoEm) {
        this.pagoEm = pagoEm;
    }
}
