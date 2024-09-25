package com.aluracursos.literalura.service;

public interface IDataConverter {
<T> T obtainData(String json, Class<T> clas);
}
