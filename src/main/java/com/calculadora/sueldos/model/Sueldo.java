package com.calculadora.sueldos.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Sueldo {
    private int diasTrabajados;
    private double valorDia;

    public Sueldo() {}

    public Sueldo(int diasTrabajados, double valorDia) {
        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
    }

    public double calcularTotal() {
        return diasTrabajados * valorDia;
    }

//    public int getDiasTrabajados() {
//        return diasTrabajados;
//    }
//
//    public void setDiasTrabajados(int diasTrabajados) {
//        this.diasTrabajados = diasTrabajados;
//    }
//
//    public double getValorDia() {
//        return valorDia;
//    }
//
//    public void setValorDia(double valorDia) {
//        this.valorDia = valorDia;
//    }
}
