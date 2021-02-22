package com;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){
        nombre = "";
        edad = 0;
        DNI = "";
        sexo = 'H';
        peso = 0;
        altura = 0;
        generarDNI();
    }
        public Persona(String nombre, char sexo, int edad ){
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
            DNI = "";
            peso = 0;
            altura = 0;
            generarDNI();
        }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generarDNI();
    }

    public int calcularIMC(){
        double operacion = peso/(Math.pow(altura, 2));
        if(operacion < 20){
            return -1;
        }
        else if(operacion >= 20 && operacion <= 25)
        {
            return 0;
        }
        else {
            return 1;
        }
    }
    public boolean EsMayorDeEdad()
    {
        if(edad >=18){
            return true;
        }
        else{
            return false;
        }
    }
    private void comprobarsexo()
    {
        if(sexo!='H' && sexo!='M')
        {
            sexo = 'H';
        }
    }

    public String toString(){
        String informacion;
        informacion = "Nombre: "+nombre;

        return "Nombre: "+nombre+"\n"+
                "Edad: "+edad+"\n"+
                "Dni: "+DNI+"\n"+
                "Sexo: "+sexo+"\n"+
                "Peso: "+peso+"\n"+
                "Altura: "+altura+"\n";
    }

    private void generarDNI(){
        int dni = (int)(Math.random()*(99999999-10000000+1)+10000000);
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        long modulo= dni % 23;
        char letra = juegoCaracteres.charAt((int) modulo);
        DNI = String.valueOf(dni)+letra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
