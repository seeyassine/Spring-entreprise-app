package com.service;

import com.entities.Entreprise;

import java.util.List;

public interface EntrepriseServise {
    void saveOrUpdate(Entreprise f);
    void delete(Entreprise f);

    Entreprise getById(int id);

    List<Entreprise> getAll();
}
