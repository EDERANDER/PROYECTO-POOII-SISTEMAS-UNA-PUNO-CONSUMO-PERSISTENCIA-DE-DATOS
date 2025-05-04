package pe.sistemas.series.interfaces;

import com.fasterxml.jackson.databind.ObjectMapper;

public interface IConvertidor {
    public <T> T convertidor(String Json, Class<T> clase);
}
