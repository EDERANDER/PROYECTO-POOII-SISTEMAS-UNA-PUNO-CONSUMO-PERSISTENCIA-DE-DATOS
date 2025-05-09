package pe.sistemas.series.service;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Series {
    private String nombreSerie;
    private int añoLanzamiento;
    private String genero;
    private String resumen;
    private double ratting;
    private int numeroTemporadas;

    public Series (DTOSeries series) {
        this.nombreSerie = series.nombreSerie();
        this.añoLanzamiento = Integer.parseInt(series.añoLanzamiento().split("–")[0]);
        this.genero = series.genero();
        this.resumen = series.resumen();
        this.ratting = Double.valueOf(series.ratting());
        this.numeroTemporadas = Integer.valueOf(series.numeroTemporadas());
    }

    public String getNombreSerie() {
        return nombreSerie;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public double getRatting() {
        return ratting;
    }

    public void setRatting(double ratting) {
        this.ratting = ratting;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String toString() {
        return "Series{" +
                "nombreSerie='" + nombreSerie + '\'' +
                ", añoLanzamiento=" + añoLanzamiento +
                ", genero='" + genero + '\'' +
                ", resumen='" + resumen + '\'' +
                ", ratting=" + ratting +
                ", numeroTemporadas=" + numeroTemporadas +
                '}';
    }
}
