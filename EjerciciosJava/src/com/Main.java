package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//punto 1
        /*
        int valor1;
        int valor2;
        valor1 = 2;
        valor2 = 1;
        if (valor1 < valor2)
            System.out.println("la variable valor2 es mayor a valor1: "+valor2+" > "+valor1);
        else if(valor1>valor2)
            System.out.println("la variable valor1 es mayor a valor2: "+valor1+" > "+valor2);
        else
            System.out.println("la variable valor2 es igual a valor1: "+valor2+" = "+valor1);
        */
//punto 2
        /*
        int valor1=0;
        int valor2=0;

        System.out.println("Ingrese valor 1");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            valor1 = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ingrese valor 2");
        in = new InputStreamReader(System.in);
        buffer = new BufferedReader(in);

        try {
            valor2 = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (valor1 < valor2)
            System.out.println("la variable valor2 es mayor a valor1: "+valor2+" > "+valor1);
        else if(valor1>valor2)
            System.out.println("la variable valor1 es mayor a valor2: "+valor1+" > "+valor2);
        else
            System.out.println("la variable valor2 es igual a valor1: "+valor2+" = "+valor1);

         */
//punto 3
        /*
        double radio=0;
        double pi = Math.PI;
        double area=0;
        System.out.println("Ingrese el valor del radio");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            radio = Double.parseDouble(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        area = pi * Math.pow(radio, 2);
        System.out.println("el area del circulo es: "+area);

         */
//punto 4
        /*
        double valor1 = 0;
        double total = 0;
        double AumentarIva =1.21;
        System.out.println("Ingrese valor del producto");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            valor1 = Double.parseDouble(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        total = valor1 * AumentarIva;
        System.out.println(total);
        */
//punto 5
        /*
        int i=1;
        System.out.println("Numeros pares");
        while(i<=100)
        {
            if(i%2 == 0)
                System.out.println(i);
            i++;
        }
        i=1;
        System.out.println("Numeros impares");
        while(i<=100)
        {
            if(i%2 == 1)
                System.out.println(i);
            i++;
        }
        */
//punto 6
        /*
        System.out.println("Numeros pares");
        for(int i=1;i<=100;i++)
        {
            if(i%2 == 0)
                System.out.println(i);
        }
        System.out.println("Numeros impares");
        for(int i=1;i<=100;i++)
        {
            if(i%2 == 1)
                System.out.println(i);
            i++;
        }

         */
//punto 7
        /*
        int valor1 = 0;
        do {


            System.out.println("Ingrese un numero");
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(in);
            try {
                valor1 = Integer.parseInt(buffer.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }while (valor1 <0);

         */
//punto 8
        /*
        String dia = "";
        System.out.println("Ingrese un numero");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            dia = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (dia)
        {
            case "lunes":
                System.out.println("Es un dia laboral");
                break;
            case "martes":
                System.out.println("Es un dia laboral");
                break;
            case "miercoles":
                System.out.println("Es un dia laboral");
                break;
            case "jueves":
                System.out.println("Es un dia laboral");
                break;
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
                System.out.println("No es un dia laboral");
                break;
            case "domingo":
                System.out.println("No es un dia laboral");
                break;
            default:
                System.out.println("ingrese un dia correcto");
        }

         */
//punto 9
        /*
        String cadena = "la sonrisa sera la mejor arma contra la tristeza";
        cadena = cadena.replace("a", "e");
        System.out.println(cadena);
        String fraseNueva = "";
        System.out.println("Ingrese una frase");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            fraseNueva = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        fraseNueva = cadena.concat(fraseNueva);
        System.out.println(fraseNueva);

         */
//punto 10
        /*
        String cadena = "";

        System.out.println("Ingrese una frase");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            cadena = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    cadena = cadena.replace(" ","");
        System.out.println(cadena);

         */
//punto 11
        /*
        String cadena = "";
        System.out.println("Ingrese una frase");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            cadena = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("La longitud de la frase es: "+cadena.length());
        int CantidadA = 0;
        int CantidadE = 0;
        int CantidadI = 0;
        int CantidadO = 0;
        int CantidadU = 0;
        for (int i=0; i<cadena.length();i++)
        {
            if (cadena.charAt(i) == 'a')
            {
                CantidadA++;
            }
            else if (cadena.charAt(i) == 'e')
            {
                CantidadE++;
            }
            else if (cadena.charAt(i) == 'i')
            {
                CantidadI++;
            }
            else if (cadena.charAt(i) == 'o')
            {
                CantidadO++;
            }
            else if (cadena.charAt(i) == 'u')
            {
                CantidadU++;
            }

        }
        System.out.println("la cantidad de A es: "+CantidadA);
        System.out.println("la cantidad de E es: "+CantidadE);
        System.out.println("la cantidad de I es: "+CantidadI);
        System.out.println("la cantidad de O es: "+CantidadO);
        System.out.println("la cantidad de U es: "+CantidadU);

         */
//punto 12
        /*
        String palabraUno ="";
        String palabraDos ="";
        List<Character> palabra1 = new ArrayList<>();
        List<Character> palabra2 = new ArrayList<>();

        System.out.println("Ingrese la primera palabra");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            palabraUno = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ingrese la segunda palabra");
        in = new InputStreamReader(System.in);
        buffer = new BufferedReader(in);
        try {
            palabraDos = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i=0; i<palabraUno.length();i++)
        {
            palabra1.add(palabraUno.charAt(i));
        }
        for (int i=0; i<palabraDos.length();i++)
        {
            palabra2.add(palabraDos.charAt(i));
        }
        if (palabraUno.equals(palabraDos))
        {
            System.out.println("son iguales");
        }
        else{

            int palabraMayor = 0;
            if (palabra1.size()>palabra2.size()){
                palabraMayor = palabra1.size();
            }
            else {
                palabraMayor = palabra2.size();
            }
            for ( int i = 0; i < palabraMayor; i ++){
                if (i< palabra1.size() && i<palabra2.size()){
                    if (!palabra1.get(i).equals(palabra2.get(i))){
                        System.out.println(palabra1.get(i)+" es diferente a: "+ palabra2.get(i));
                    }
                }
            }

        }

         */
//punto 13
        /*
    Date fecha = new Date();
        System.out.println("("+(fecha.getYear()+1900)+"/"+(fecha.getMonth()+1)+"/"+fecha.getDay()+")"+
                "("+(fecha.getHours())+":"+(fecha.getMinutes())+":"+fecha.getSeconds()+")");


         */
//punto 14
        /*
        int numero=0;

        System.out.println("Ingrese el numero");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            numero = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = numero; i<=1000; i+=2)
        {
            System.out.println(i);
        }

         */

//punto 15
        int i =0;
        while(i!=8) {
            System.out.println("****** GESTION CINEMATOGRÁFICA ********" + "\n" +
                    "1-NUEVO ACTOR" + "\n" +
                    "2-BUSCAR ACTOR" + "\n" +
                    "3-ELIMINAR ACTOR" + "\n" +
                    "4-MODIFICAR ACTOR" + "\n" +
                    "5-VER TODOS LOS ACTORES" + "\n" +
                    "6-VER PELICULAS DE LOS ACTORES" + "\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" + "\n" +
                    "8-SALIR");

            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(in);
            try {
                i = Integer.parseInt(buffer.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (i)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }
        }
    }
}
