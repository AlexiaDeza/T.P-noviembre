package com.company;

public abstract class Mascotafelizquesaluda extends Mascota{

    private int alegria;

    public Mascotafelizquesaluda(String nombree, String animalito, String dueñox) {
        super(nombree, animalito, dueñox);
        alegria=1;
    }


    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getAlegria() {
        return alegria;
    }



}
