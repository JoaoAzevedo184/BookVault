package com.joaovictor.bookvault.bookvault.service;

public interface IConvertData {
    <T> T obterDados(String json, Class<T> classe);
}
