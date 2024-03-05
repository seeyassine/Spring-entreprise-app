package com.service.impl;

import com.dao.EntrepriseDAO;
import com.entities.Entreprise;
import com.service.EntrepriseServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Component
public class EntrepriseServiceImpl implements EntrepriseServise {
    @Autowired
    private EntrepriseDAO entrepriseDAO;
    @Override
    @Transactional
    public void saveOrUpdate(Entreprise f) {
        this.entrepriseDAO.saveOrUpdate(f);
    }

    @Override
    @Transactional
    public void delete(Entreprise f) {
        this.entrepriseDAO.delete(f);
    }

    @Override
    public Entreprise getById(int id) {
        return this.entrepriseDAO.getById(id);
    }

    @Override
    public List<Entreprise> getAll() {
        return this.entrepriseDAO.getAll();
    }
}
