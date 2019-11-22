package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ABM {

    private ArrayList<Mascota> mascotas;

    public void agregarmascota(Mascota mascotita){
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotita.getNombre() == mascotas.get(i).getNombre()) {
                System.out.println("este nombre no esta disponible, elija otro");
            } else {
                this.mascotas.add(mascotita);
            }
        }

    }
    public void eliminarmascota(String nombree){
        for(int i=0;i<mascotas.size();i++){
            if(nombree==mascotas.get(i).getNombre()){
                mascotas.remove(i);
            }
        }
    }
    public void modificarmascota(String nombrem,String nombrednuevo,String nombremnuevo){
        for(int i=0;i<mascotas.size();i++){
            if(nombrem==mascotas.get(i).getNombre()){
                mascotas.get(i).setNombre(nombremnuevo);
                mascotas.get(i).setDueño(nombrednuevo);
            }
        }
    }

    public void chequearPeces(){
        for(int i=0;i<mascotas.size();i++){
            if (mascotas.get(i).getAnimal() == "pez") {
                Pez pez = (Pez)mascotas.get(i);
                if(pez.getVida()==0){
                    eliminarmascota(mascotas.get(i).getNombre());
                    System.out.println("se elimno correctamente el pez ");
                    System.out.println(mascotas.get(i).getNombre());
                }

            }
        }
    }

    public static void main(String[] args) {
        ABM abm = new ABM();

        Scanner entrada = new Scanner(System.in);
        System.out.println("elija una opciion");
        System.out.println("a- agregar mascota");
        System.out.println("b- eliminar mascota");
        System.out.println("c- modificar mascota");
        System.out.println("d- chequear peces");
        System.out.println("e- saludar mascota");
        System.out.println("f- alimentar");
        System.out.println("g- cambiar canto");
        String opcion=entrada.nextLine();
        switch(opcion) {
            case "a":
                System.out.println("ingrese el nombre de la mascota");
                String nombre = entrada.nextLine();
                System.out.println("ingrese el tipo de mascota");
                String animall = entrada.nextLine();
                System.out.println("ingrese el nombre del dueño");
                String dueñito = entrada.nextLine();
                if (animall == "perro") {
                    Perro p3= new Perro(nombre,animall,dueñito);
                    abm.agregarmascota(p3);
                }
                if (animall == "gato") {
                    Gato g3= new Gato(nombre,animall,dueñito);
                    abm.agregarmascota(g3);
                }
                if (animall == "pajarito") {
                    System.out.println("su pajarito es cantor?");
                    boolean cantarin= Boolean.parseBoolean(entrada.nextLine());
                    Pajarito paj3= new Pajarito(nombre,animall,dueñito,cantarin);
                    abm.agregarmascota(paj3);
                }
                if (animall == "pez") {
                    Pez pez3= new Pez(nombre,animall,dueñito);
                    abm.agregarmascota(pez3);
                }

            case "b":
                System.out.println("ingrese el nombre de la mascota que desea eliminar");
                String nombreee=entrada.nextLine();
                abm.eliminarmascota(nombreee);

            case "c":
                System.out.println("ingrese el nombre de la mascota que desea modificar");
                String nombreeee=entrada.nextLine();
                System.out.println("ingrese el nuevo nombre de la mascota");
                String nombreeenuevo=entrada.nextLine();
                System.out.println("ingrese el nuevo nombre del dueño");
                String nombreeedueño=entrada.nextLine();

                abm.modificarmascota(nombreeee,nombreeedueño,nombreeenuevo);
            case "d":
                abm.chequearPeces();
            case "e":
                System.out.println("ingrese el nombre de la mascota que desea saludar");
                String mascotini=entrada.nextLine();
                System.out.println("que tipo de animal es?");
                String animalll=entrada.nextLine();
                System.out.println("ingrese su nombre");
                String minombre=entrada.nextLine();
                if (animalll == "perro") {
                    for(int j=0;j<abm.mascotas.size();j++){
                        if(mascotini==abm.mascotas.get(j).getNombre()){
                            Perro pr =(Perro)abm.mascotas.get(j);
                            pr.saludar(minombre,mascotini);
                        }
                    }

                }
                if (animalll == "gato") {
                    for(int j=0;j<abm.mascotas.size();j++){
                        if(mascotini==abm.mascotas.get(j).getNombre()) {
                            Gato gr=(Gato)abm.mascotas.get(j);
                            gr.saludar(minombre, mascotini);
                        }
                    }
                }
                if (animalll == "pajarito") {
                    for(int j=0;j<abm.mascotas.size();j++){
                        if(mascotini==abm.mascotas.get(j).getNombre()){
                            Pajarito paji=(Pajarito)abm.mascotas.get(j);
                            paji.saludar(minombre,mascotini);
                        }
                    }
                }
                if (animalll == "pez") {
                    for(int j=0;j<abm.mascotas.size();j++){
                        if(mascotini==abm.mascotas.get(j).getNombre()){
                            Pez pezi=(Pez)abm.mascotas.get(j);
                            pezi.saludar(minombre,mascotini);
                        }
                    }
                }
            case "f":
                System.out.println("ingrese el nombre de la mascota que desea alimentar");
                String mascotinii=entrada.nextLine();
                System.out.println("que tipo de animal es?");
                String animallll=entrada.nextLine();
                if (animallll == "perro") {
                    for(int j=0;j<abm.mascotas.size();j++){
                        if(mascotinii==abm.mascotas.get(j).getNombre()){
                            Perro pr =(Perro)abm.mascotas.get(j);
                            pr.alimentar(mascotinii);
                        }
                    }

                }
                if (animallll == "gato") {
                    for(int j=0;j<abm.mascotas.size();j++){
                        if(mascotinii==abm.mascotas.get(j).getNombre()) {
                            Gato gr=(Gato)abm.mascotas.get(j);
                            gr.alimentar( mascotinii);
                        }
                    }
                }
                if (animallll == "pajarito") {
                    for(int j=0;j<abm.mascotas.size();j++){
                        if(mascotinii==abm.mascotas.get(j).getNombre()){
                            Pajarito paji=(Pajarito)abm.mascotas.get(j);
                            paji.alimentar(mascotinii);
                        }
                    }
                }
                if (animallll == "pez") {
                    for(int j=0;j<abm.mascotas.size();j++){
                        if(mascotinii==abm.mascotas.get(j).getNombre()){
                            Pez pezi=(Pez)abm.mascotas.get(j);
                            pezi.alimentar(mascotinii);
                        }
                    }
                }
            case "g":
                System.out.println("ingrese el nombre de la mascota a la que desea cambiarle el canto");
                String mascotinita=entrada.nextLine();
                System.out.println("que tipo de animal es?");
                String animalxito=entrada.nextLine();
                if(animalxito=="Pajarito"){
                    for(int j=0;j<abm.mascotas.size();j++){
                        if(mascotinita==abm.mascotas.get(j).getNombre()){
                            Pajarito pajajarito =(Pajarito) abm.mascotas.get(j);
                            System.out.println("ingrese el canto que quiere que tenga su Pajarito");
                            String cantito=entrada.nextLine();
                            pajajarito.cambiarcanto(cantito);
                        }
                    }
                }
                else{
                    System.out.println("solo se puede cambiar el canto en Pajaritos");
                }
        }






    }
}
