package com.entities;

import javax.persistence.*;

@Entity
public class Employe {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = false, length = 25)
    private String nom;
    @Basic
    @Column(name = "tel", nullable = false, length = 25)
    private String tel;
    @Basic
    @Column(name = "salaire", nullable = false, precision = 0)
    private double salaire;
    @ManyToOne
    @JoinColumn(name = "entreprise", referencedColumnName = "id", nullable = false)
    private Entreprise entreprise;

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
}
