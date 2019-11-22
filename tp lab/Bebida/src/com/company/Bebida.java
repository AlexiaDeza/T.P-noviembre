package com.company;

public abstract class Bebida{
    private String nombre;
    private int positividad;
    private int negatividad;
    private int resultante;

    //setters
    public void setNegatividad(int negatividad) {
        this.negatividad = negatividad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPositividad(int positividad) {
        this.positividad = positividad;
    }
    public void setResultante(int resultante) {
        this.resultante = resultante;
    }

    //getters
    public int getNegatividad() {
        return negatividad;
    }
    public int getPositividad() {
        return positividad;
    }
    public String getNombre() {
        return nombre;
    }

    public Bebida(String nombrex, int positividadx, int negatividadx){
        nombre=nombrex;
        positividad=positividadx;
        negatividad=negatividadx;
        resultante=positividad-negatividad;
    }

    public abstract int getresultante();
}
