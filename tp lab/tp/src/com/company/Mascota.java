package com.company;

public abstract class Mascota {
    private String nombre;
    private String animal;
    private String dueño;

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }


    //getters
    public String getNombre() {
        return nombre;
    }
    public String getAnimal() {
        return animal;
    }
    public String getDueño() {
        return dueño;
    }

    public Mascota(String nombree,String animalito,String dueñox){
        nombre=nombree;
        animal=animalito;
        dueño=dueñox;
    }

    public abstract void saludar(String nombree, String nombremascota);
    public abstract void alimentar(String nombremascota);

}




