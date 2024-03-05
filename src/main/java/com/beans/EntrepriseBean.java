package com.beans;

import com.entities.Entreprise;
import com.service.EntrepriseServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.faces.bean.ManagedBean;
import java.util.List;

@Component
@ManagedBean
@Scope("session")
public class EntrepriseBean {
    @Autowired
    private EntrepriseServise entrepriseServise;
    private Entreprise entreprise;
    private boolean modifyContext;

    public EntrepriseBean() {
        this.entreprise = new Entreprise();
        this.modifyContext = false;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public boolean isModifyContext() {
        return modifyContext;
    }

    public void setModifyContext(boolean modifyContext) {
        this.modifyContext = modifyContext;
    }

    @Transactional
    public void save(){
        this.entrepriseServise.saveOrUpdate(this.entreprise);
        this.entreprise=new Entreprise();
        this.setModifyContext(false);
    }

    public void modify(Entreprise f){
        this.entreprise = f;
        this.setModifyContext(true);
    }
    @Transactional
    public void delete(Entreprise f){
        this.entrepriseServise.delete(f);
        this.entreprise = new Entreprise();
    }

    public List<Entreprise> getEntreprises(){
        return this.entrepriseServise.getAll();
    }
    public String getLabel() {
        return isModifyContext() ? "Modification" : "Ajout";
    }
}
