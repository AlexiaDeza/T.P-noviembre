package com.company;

public class Pajarito extends Mascotafelizquesaluda{
    private String saludo;
    private boolean cantor;

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    public String getSaludo() {
        return saludo;
    }
    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }
    public boolean isCantor() {
        return cantor;
    }

    public Pajarito(String nombree, String animalito, String dueñox, boolean cantorr) {
        super(nombree, animalito, dueñox);
        cantor=cantorr;
        saludo="pio";
    }

    public void cambiarcanto(String canto){
        if(cantor==true){
            saludo=canto;
        }
        else{
            System.out.println("no se puede cambiar el saludo porque el pajarito no es cantor");
        }
    }

    @Override
    public void saludar(String nombree,String nombremascota) {
        if(nombremascota==super.getNombre()) {
            if (nombree == super.getDueño()) {
                for (int i = 0; i < super.getAlegria(); i++) {
                    System.out.println(getSaludo());
                }
                if(super.getAlegria()>1){
                    super.setAlegria(super.getAlegria()-1);
                }
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
