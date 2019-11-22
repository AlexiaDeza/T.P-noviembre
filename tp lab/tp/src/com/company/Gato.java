package com.company;

public class Gato extends Mascotafelizquesaluda{

    public Gato(String nombree, String animalito, String dueñox) {
        super(nombree, animalito, dueñox);
    }

    @Override
    public void saludar(String nombree, String nombremascota) {
        if(nombremascota==super.getNombre()) {
            if (nombree == super.getDueño()) {
                for (int i = 0; i < super.getAlegria(); i++){
                System.out.println("miau");
                 }
                if(super.getAlegria()>1){
                    super.setAlegria(super.getAlegria()-1);
                }
            }
            else {
                    System.out.println("MIAU!");
            }
        }
    }

    @Override
    public void alimentar(String nombremascota) {
        if(nombremascota==super.getNombre()) {
            super.setAlegria(super.getAlegria() + 1);
        }
    }
}
