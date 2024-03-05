package com.dao;

import java.util.List;

public interface iDAO <T>{

    void saveOrUpdate(T f);
    void delete(T f);
    T getById(int id);
    List<T> getAll();
}
