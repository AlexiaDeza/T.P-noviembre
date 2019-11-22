package com.company;

public class Pez extends Mascota{
    private int vida;

    public Pez(String nombree, String animalito, String dueñox) {
        super(nombree, animalito, dueñox);
        vida=10;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public void saludar(String nombree, String nombremascota) {
        if(nombremascota==super.getNombre()) {
            if (nombree == super.getDueño()) {
                vida=vida-1;
            }
            else {
                vida=0;
            }
        }
    }

    @Override
    public void alimentar(String nombremascota) {
        if(nombremascota==super.getNombre()) {
            vida = vida + 1;
        }
    }

}
