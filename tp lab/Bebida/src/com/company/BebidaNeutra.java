package com.company;

import com.company.Bebida;

public class BebidaNeutra extends Bebida {
    public BebidaNeutra(String nombrex,int positividadx,int negatividadx){
        super(nombrex,positividadx,negatividadx);
    }

    @Override
    public int getresultante() {
        return getPositividad()-getNegatividad();
    }
}
