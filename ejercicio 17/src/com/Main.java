package com;

public class Main {

    public static void main(String[] args) {
        int TotalLavadoras = 0;
        int TotalTelevisores = 0;
        int TotalElectrodomesticos = 0;
        int Total = 0;

        Electrodomestico electrodomesticos[] = new Electrodomestico[10];
        electrodomesticos[0] = new Lavadora(70, "negro", 'D', 60, 30);
        electrodomesticos[1] = new Lavadora(120, "blanco", 'C', 80, 50);
        electrodomesticos[2] = new Television(80, "Azul", 'A', 76, 50, true);
        electrodomesticos[3] = new Lavadora(120, "Rojo", 'E', 45, 32);
        electrodomesticos[4] = new Lavadora(90, "Azul", 'F', 80, 34);
        electrodomesticos[5] = new Television(110, "Gris", 'B', 50, 45, false);
        electrodomesticos[6] = new Lavadora(120, "blanco", 'E', 45, 32);
        electrodomesticos[7] = new Television(100, "Azul", 'C', 34, 70, true);
        electrodomesticos[8] = new Lavadora(115, "Azul", 'E', 65, 76);
        electrodomesticos[9] = new Television(110, "blanco", 'B', 23, 32, false);

        for (int i = 0; i < electrodomesticos.length; i++) {
            if (electrodomesticos[i] instanceof Television) {
                TotalTelevisores += electrodomesticos[i].precioFinal();
            } else if (electrodomesticos[i] instanceof Lavadora) {
                TotalLavadoras += electrodomesticos[i].precioFinal();
            } else {
                TotalElectrodomesticos += electrodomesticos[i].precioFinal();
            }
            Total += electrodomesticos[i].precioFinal();
        }
        System.out.println("El total vendido en lavadoras es: " + TotalLavadoras +
                "\nEl total vendido en televisores es: " + TotalTelevisores +
                "\nEl total vendido en otros electrodomesticos es: " + TotalElectrodomesticos +
                "\nEl total fue: " + Total);
    }
}
