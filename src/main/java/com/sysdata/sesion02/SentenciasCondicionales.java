package com.sysdata.sesion02;

public class SentenciasCondicionales {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        // comparación igualdad
        if(i == j){
            System.out.println("son iguales");

        }
        //comparación desigualdad
         i = 0;
         j = 1;
        if(i != j){
            System.out.println("son diferentes");

        }

        // comparación de objetos
        // cadenas

        String cadena1 = "";
        String cadena2 = "";
        if(cadena1.equals(cadena2))
        {
            System.out.println("las cadenas son iguales");
        }
        // comparamos las referencias a los objetos
        if(cadena1 == cadena2)
        {
            System.out.println("las cadenas son iguales");
        }
        else{
            System.out.println("las cadenas son diferentes");
        }
    }

}
