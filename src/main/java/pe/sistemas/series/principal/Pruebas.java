package pe.sistemas.series.principal;

import pe.sistemas.series.service.Consumo;
import pe.sistemas.series.service.Convertidor;
import pe.sistemas.series.service.DTOSeries;
import pe.sistemas.series.service.Series;

import java.io.IOException;

public class Pruebas {
    public static void main(String[] args) throws IOException {


        Consumo consumo = new Consumo();
        Convertidor convertidor = new Convertidor();


        String datos = consumo.consumir("breaking bad");
        DTOSeries dtoSeries = convertidor.convertidor(datos, DTOSeries.class);
        Series series = new Series(dtoSeries);
        System.out.println(series);




    }
}
