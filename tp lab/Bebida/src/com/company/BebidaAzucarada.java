package com.company;

import com.company.Bebida;

public class BebidaAzucarada extends Bebida {
    private int cantidadAzucar;

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }
    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public BebidaAzucarada(String nombrex,int cantidad){
        super(nombrex,1,cantidad*10);
        cantidadAzucar=cantidad;
    }

    @Override
    public int getresultante() {
        return getPositividad()-getNegatividad();
    }
}