package com;

public class Main {

    public static void main(String[] args) {
        Serie arregloSeries[] = new Serie[5];
        Videojuego arregloVideojuegos[] = new Videojuego[5];
        int juegosEntregados = 0;
        int seriesEntregados = 0;
        Serie mayorSerie;
        Videojuego mayorVideojuego;

        arregloSeries[0] = new Serie( "S.w.a.t",  3,  "Criminalista",  "yo mismito");
        arregloSeries[1] = new Serie( "9-1-1",  4,  "Criminalista",  "yo Tambien");
        arregloSeries[2] = new Serie( "Principe del rap",  6,  "Comedia",  "yo otra vez");
        arregloSeries[3] = new Serie( "La casa de papel",  4,  "Accion",  "yo ");
        arregloSeries[4] = new Serie( "Elite",  3,  "Accion",  "yo Tambien");

        arregloVideojuegos[0] = new Videojuego( "God of war",  6,  "accion",  "Sony");
        arregloVideojuegos[1] = new Videojuego( "GTA san andreas",  30,  "accion",  "rock star");
        arregloVideojuegos[2] = new Videojuego( "need for speed most wanted",  15,  "carreras",  "Electronic Arts ");
        arregloVideojuegos[3] = new Videojuego( "Watch Dogs",  10,  "accion",  " Ubisoft");
        arregloVideojuegos[4] = new Videojuego( "GTA III",  20,  "accion",  "rock star");

        arregloSeries[2].entregar();
        arregloSeries[4].entregar();
        arregloVideojuegos[0].entregar();
        arregloVideojuegos[3].entregar();

        for(int i = 0; i < arregloSeries.length; i++)
        {
            seriesEntregados += arregloSeries[i].isEntregado() ? 1 : 0;
            juegosEntregados += arregloVideojuegos[i].isEntregado() ? 1 : 0;
            arregloVideojuegos[i].devolver();
            arregloSeries[i].devolver();
        }
        System.out.println();
        System.out.println();

        mayorSerie = arregloSeries[0];
        mayorVideojuego = arregloVideojuegos[0];

        for(int i = 0; i < arregloSeries.length; i++)
        {
            mayorSerie = mayorSerie.compareTo(arregloSeries[i]) ? mayorSerie : arregloSeries[i];
            mayorVideojuego = mayorVideojuego.compareTo(arregloVideojuegos[i]) ? mayorVideojuego :arregloVideojuegos[i];
        }
        System.out.println(mayorSerie.toString());
        System.out.println(mayorVideojuego.toString());
    }
}
