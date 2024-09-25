package com.aluracursos.literalura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConverter implements IDataConverter{
    private final ObjectMapper mapper = new ObjectMapper();
    @Override
    public <T> T obtainData(String json, Class<T> clas) {
        try{
            return mapper.readValue(json, clas);
        }catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }
}
