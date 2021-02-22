package com;

public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        precioBase = 100;
        color = "Blanco";
        consumoEnergetico = 'F';
        peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        color = "Blanco";
        consumoEnergetico = 'F';
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico() {
        consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        if (consumoEnergetico != 'A' &&
                consumoEnergetico != 'B' &&
                consumoEnergetico != 'C' &&
                consumoEnergetico != 'D' &&
                consumoEnergetico != 'E' &&
                consumoEnergetico != 'F') {
            consumoEnergetico = 'F';
        }
    }

    private void comprobarColor() {

        if (!color.equalsIgnoreCase("BLANCO") &&
                !color.equalsIgnoreCase("NEGRO") &&
                !color.equalsIgnoreCase("ROJO") &&
                !color.equalsIgnoreCase("AZUL") &&
                !color.equalsIgnoreCase("GRIS")) {
            color = "Blanco";
        }
    }

    public double precioFinal() {
        double precio = precioBase;
        switch (consumoEnergetico) {
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
                break;
            case 'D':
                precio += 50;
                break;
            case 'E':
                precio += 30;
                break;
            case 'F':
                precio += 10;
                break;

        }

        if (peso >= 0 && peso <= 19) {
            precio += 10;
        } else if (peso >= 20 && peso <= 49) {
            precio += 50;
        } else if (peso >= 50 && peso <= 79) {
            precio += 80;
        } else if (peso >= 80) {
            precio += 100;
        }
        return precio;
    }

}
