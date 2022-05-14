package com.ifpe.tads.mhsf.streetfighters.model.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Luta {
    private int id;
    private Date dataHora;
    private int resultado;

    private Lutador lutador1;
    private Lutador lutador2;
    private Local local;

    private List<Aposta> apostas;

    public Luta() {

        this.apostas = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public Lutador getLutador1() {
        return lutador1;
    }

    public void setLutador1(Lutador lutador1) {
        this.lutador1 = lutador1;
    }

    public Lutador getLutador2() {
        return lutador2;
    }

    public void setLutador2(Lutador lutador2) {
        this.lutador2 = lutador2;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<Aposta> getApostas() {
        return apostas;
    }

    public void setApostas(List<Aposta> apostas) {
        this.apostas = apostas;
    }

    public void addAposta(Aposta a){

        if(this.dataHora.getTime()<System.nanoTime()){
            return;
        }

        this.apostas.add(a);

    }

}
