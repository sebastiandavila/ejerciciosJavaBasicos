package com;

public class Videojuego implements  Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    public Videojuego(){
         titulo = "";
         horasEstimadas = 10;
         entregado = false;
         genero  = "";
         compañia = "";
    }
    public Videojuego(String titulo, int horasEstimadas){
        titulo = "";
        horasEstimadas = 10;
        entregado = false;
        genero  = "";
        compañia = "";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
        entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
    public String toString()
    {
        return "Titulo: "+titulo+
                "\nhoras estimadas: "+horasEstimadas+
                "\nEntregado: "+entregado+
                "\nGenero: "+genero+
                "\nCompañia: "+compañia;
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


    public boolean compareTo(Videojuego  a)
    {
        return horasEstimadas > a.getHorasEstimadas();
    }
}
