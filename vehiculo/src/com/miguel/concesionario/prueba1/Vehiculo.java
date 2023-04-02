package com.miguel.concesionario.prueba1;

import java.util.AbstractList;

public abstract class  Vehiculo  {
    protected String numeroRuedas;
    protected String numeroPuertas;
    protected String marca;
    protected String modelo;

    public String getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(String numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
