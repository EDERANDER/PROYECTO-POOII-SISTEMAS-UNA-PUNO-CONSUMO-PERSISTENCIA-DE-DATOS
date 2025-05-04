package pe.sistemas.series.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Consumo {

    private String Json;
    private final static String URL_BASE = "https://www.omdbapi.com/?t=";
    private final static String API_KEY = "&apikey=2abf946d";

    public String consumir(String nombreSerie) throws IOException {
        nombreSerie = nombreSerie.replace(" ","+");
        URL url = new URL (URL_BASE + nombreSerie + API_KEY);
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        conn.setRequestMethod("GET");
        conn.connect();
        StringBuilder informacion = new StringBuilder();
        Scanner scanner = new Scanner(url.openStream());

        while (scanner.hasNext()){
            informacion.append(scanner.nextLine());
        }

        Json = informacion.toString();
        return Json;
    }
}
