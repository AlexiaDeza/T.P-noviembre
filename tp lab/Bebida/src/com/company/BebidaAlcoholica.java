package com.company;

import com.company.Bebida;

public class BebidaAlcoholica extends Bebida {
    private int cantidadAlcohol;

    public void setCantidadAlcohol(int cantidadAlcohol) {
        this.cantidadAlcohol = cantidadAlcohol;
    }
    public int getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public BebidaAlcoholica(String nombrex,int cantidad){
        super(nombrex,0,cantidad*20);
        cantidadAlcohol=cantidad;

    }

    @Override
    public int getresultante() {
        return getPositividad()-getNegatividad();
    }
}
