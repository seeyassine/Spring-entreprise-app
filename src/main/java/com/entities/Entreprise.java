package com.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Entreprise {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = false, length = 25)
    private String nom;
    @Basic
    @Column(name = "ville", nullable = false, length = 25)
    private String ville;
    @Basic
    @Column(name = "tel", nullable = false, length = 25)
    private String tel;
    @OneToMany(mappedBy = "entreprise")
    private Collection<Employe> employesById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Collection<Employe> getEmployesById() {
        return employesById;
    }

    public void setEmployesById(Collection<Employe> employesById) {
        this.employesById = employesById;
    }
}
