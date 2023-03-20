package com.sysdata.sesion03;
import static com.sysdata.sesion03.funciones01Estaticas.*;

public class funciones01EstaticasAPP {
    public static void main(String[] args) {
        // invocación del procedimiento
        nombreFuncion();

        // invocar a función que devuelve un valor entero

        int i =  devuelveEntero();
        System.out.println("valor de i: "+ i);

        // invocar a la función que suma

        i= suma(2,3);
        System.out.println("la suma de i+j es; "+ i);

    }

}
