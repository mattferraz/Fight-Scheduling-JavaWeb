package com.ifpe.tads.mhsf.streetfighters.model.business;

public class Aposta {
    private int id;
    private double valor;
    private boolean lutador1;

    private Usuario apostador;
    private Luta briga;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isLutador1() {
        return lutador1;
    }

    public void setLutador1(boolean lutador1) {
        this.lutador1 = lutador1;
    }

    public Usuario getApostador() {
        return apostador;
    }

    public void setApostador(Usuario apostador) {
        this.apostador = apostador;
    }

    public Luta getBriga() {
        return briga;
    }

    public void setBriga(Luta briga) {
        this.briga = briga;
    }


}
