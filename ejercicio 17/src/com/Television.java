package com;

public class Television extends Electrodomestico {
    private int resolucion;
    private boolean tdt;

    public Television() {
        super();
        resolucion = 20;
        tdt = false;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        resolucion = 20;
        tdt = false;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 40) {
            precio = (precio * 0.3) + precio;
        }
        if (tdt) {
            precio += 50;
        }

        return precio;
    }

}
