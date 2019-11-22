package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Persona> Personas;

    public Persona mejorHidratado(){
        Persona p=Personas.get(0);
        for(int i=0;i<Personas.size();i++){
            if( Personas.get(i).TotalHidratacion()>p.TotalHidratacion()){
                p=Personas.get(i);
            }
        }
        return p;
    }

    public Persona peorHidratado(){
        Persona j=Personas.get(0);
        for(int i=0;i<Personas.size();i++){
            if( Personas.get(i).TotalHidratacion()<j.TotalHidratacion()){
                j=Personas.get(i);
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Main menu = new Main();

        Scanner entrada = new Scanner(System.in);
        System.out.println("elija una opciion");
        System.out.println("a- mejor hodratado");
        System.out.println("b- peor hidratado");
        System.out.println("c- total hidratacion de x persona");

        String opcion=entrada.nextLine();
        switch(opcion) {

            case "a":
                menu.mejorHidratado();

            case "b":
                menu.peorHidratado();

            case "c":
                System.out.println("ingrese el nombre de la persona de la cual desea saber el total de hidratacion");
                String nombre=entrada.next();
                for(int i=0;i<menu.Personas.size();i++){
                    if(nombre == menu.Personas.get(i).getNombre()){
                        menu.Personas.get(i).TotalHidratacion();
                    }
                    else{
                        System.out.println("esa persona no existe");
                    }
                }
        }
    }
}
