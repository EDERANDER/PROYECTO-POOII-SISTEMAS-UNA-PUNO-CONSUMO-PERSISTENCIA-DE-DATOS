package pe.sistemas.series.service;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DTOSeries(
    @JsonAlias("Title") String nombreSerie,
    @JsonAlias("Year") String añoLanzamiento,
    @JsonAlias("Genre") String genero,
    @JsonAlias("Plot") String resumen,
    @JsonAlias("imdbRating") String ratting,
    @JsonAlias("totalSeasons") String numeroTemporadas
)
{
    @Override
    public String toString() {
        return "DTOSeries{" +
                "nombreSerie='" + nombreSerie + '\'' +
                ", añoLanzamiento='" + añoLanzamiento + '\'' +
                ", genero='" + genero + '\'' +
                ", resumen='" + resumen + '\'' +
                ", ratting='" + ratting + '\'' +
                ", numeroTemporadas='" + numeroTemporadas + '\'' +
                '}';
    }
}
