package com.company;

import com.company.Bebida;

import java.util.HashMap;

public class Persona{
    private String nombre;
    private String apellido;
    private int DNI;
    private HashMap<Bebida,Integer> BebidasConsumidas;

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setBebidasConsumidas(HashMap<Bebida, Integer> bebidasConsumidas) {
        BebidasConsumidas = bebidasConsumidas;
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public int getDNI() {
        return DNI;
    }
    public String getApellido() {
        return apellido;
    }
    public HashMap<Bebida, Integer> getBebidasConsumidas() {
        return BebidasConsumidas;
    }

    public Persona(String nombrex, String apellidox, int DNIx,HashMap<Bebida,Integer> drink){
        nombre=nombrex;
        apellido=apellidox;
        DNI=DNIx;
        BebidasConsumidas=drink;
    }

    public int TotalHidratacion(){
        int total=0;
        for(Bebida key:BebidasConsumidas.keySet()){
            total=total+ (key.getresultante()*BebidasConsumidas.get(key));
        }
        System.out.println(total);
        return total;
    }
}
