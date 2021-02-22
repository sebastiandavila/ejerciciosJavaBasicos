package com;

public class Serie implements  Entregable{
    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;


    public Serie() {
        titulo = "";
        numeroDeTemporadas = 3;
        entregado = false;
        genero = "";
        creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        numeroDeTemporadas = 3;
        entregado = false;
        genero = "";
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
        entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String toString() {
        return "Titulo: " + titulo +
                "\nNumero De Temporadas: " + numeroDeTemporadas +
                "\nEntregado: " + entregado +
                "\nGenero: " + genero +
                "\nCreador: " + creador;
    }
    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }


    public boolean compareTo(Serie a)
    {
       return numeroDeTemporadas > a.getNumeroDeTemporadas();
    }

}
