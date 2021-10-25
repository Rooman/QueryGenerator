package com.luxoft.querygenerator.api;

public interface QueryGenerator {
    //
    String findAll(Class<?> clazz);

    String findById(Object id);

    String insert(Object value);

    String remove(Object id);

    String update(Object value);
}
