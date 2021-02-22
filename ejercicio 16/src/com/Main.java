package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        Persona persona1;
        Persona persona2;
        Persona persona3;
        String nombre="";
        int edad=0;
        double peso=0;
        char sexo='H';
        double altura=0;
        System.out.println("Ingrese el nombre de la persona numero 1");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            nombre = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ingrese la edad de la persona numero 1");
         in = new InputStreamReader(System.in);
         buffer = new BufferedReader(in);
        try {
            edad = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ingrese el peso de la persona numero 1");
        in = new InputStreamReader(System.in);
        buffer = new BufferedReader(in);
        try {
            peso = Double.parseDouble(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ingrese la altura de la persona numero 1");
        in = new InputStreamReader(System.in);
        buffer = new BufferedReader(in);
        try {
            altura = Double.parseDouble(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ingrese el sexo de la persona numero 1");
        in = new InputStreamReader(System.in);
        buffer = new BufferedReader(in);
        try {
            sexo = buffer.readLine().charAt(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        persona1 = new Persona( nombre,  edad,  sexo,  peso,  altura);
        persona2 = new Persona( nombre,  sexo,  edad );
        persona3 = new Persona();
        persona3.setNombre("Sebastian");
        persona3.setAltura(1.82);
        persona3.setPeso(2);
        persona3.setEdad(21);
        persona3.setSexo('H');

        if(persona1.calcularIMC()==-1)
        {
            System.out.println("la persona 1 esta por debajo del peso ideal");
        }
        else if (persona1.calcularIMC()==0)
        {
            System.out.println("la persona 1 esta con un peso ideal");
        }
        else if (persona1.calcularIMC()==1)
        {
            System.out.println("la persona 1 tiene sobrepeso");
        }

        if(persona2.calcularIMC()==-1)
        {
            System.out.println("la persona 2 esta por debajo del peso ideal");
        }
        else if (persona2.calcularIMC()==0)
        {
            System.out.println("la persona 2 esta con un peso ideal");
        }
        else if (persona2.calcularIMC()==1)
        {
            System.out.println("la persona 2 tiene sobrepeso");
        }

        if(persona3.calcularIMC()==-1)
        {
            System.out.println("la persona 3 esta por debajo del peso ideal");
        }
        else if (persona3.calcularIMC()==0)
        {
            System.out.println("la persona 3 esta con un peso ideal");
        }
        else if (persona3.calcularIMC()==1)
        {
            System.out.println("la persona 3 tiene sobrepeso");
        }

        if(persona1.EsMayorDeEdad())
        {
            System.out.println("Persona 1 es mayor de edad");
        }
        else
        {System.out.println("Persona 1 es menor de edad");}

        if(persona2.EsMayorDeEdad())
        {
            System.out.println("Persona 2 es mayor de edad");
        }
        else
        {System.out.println("Persona 2 es menor de edad");}

        if(persona3.EsMayorDeEdad())
        {
            System.out.println("Persona 3 es mayor de edad");
        }
        else
        {System.out.println("Persona 3 es menor de edad");}

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
}
