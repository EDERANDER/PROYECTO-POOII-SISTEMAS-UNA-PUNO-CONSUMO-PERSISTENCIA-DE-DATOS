package pe.sistemas.series.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pe.sistemas.series.interfaces.IConvertidor;

public class Convertidor implements IConvertidor {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T convertidor(String Json, Class<T> clase){
        try {
            return mapper.readValue(Json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}