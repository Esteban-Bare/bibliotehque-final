package com.biblio.bibliotehque_final.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "membre")
public class Membre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "date_inscription")
    private LocalDate dateInscription;

    @Column(name = "actif")
    private boolean actif;

    @OneToMany(mappedBy = "membre", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "emprunt-membre")
    private List<Emprunt> emprunts;

    @Override
    public String toString() {
        return "Membre{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", dateInscription=" + dateInscription +
                ", actif=" + actif +
                ", emprunts=" + emprunts +
                '}';
    }

    public Membre() {
    }

    public Membre(final Long id, final String nom, final String prenom, final String email, final String telephone, final LocalDate dateInscription, final boolean actif) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.dateInscription = dateInscription;
        this.actif = actif;
    }

    public Membre(final String nom, final String prenom, final String email, final String telephone, final LocalDate dateInscription, final boolean actif) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.dateInscription = dateInscription;
        this.actif = actif;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(final String telephone) {
        this.telephone = telephone;
    }

    public LocalDate getDateInscription() {
        return this.dateInscription;
    }

    public void setDateInscription(final LocalDate dateInscription) {
        this.dateInscription = dateInscription;
    }

    public boolean isActif() {
        return this.actif;
    }

    public void setActif(final boolean actif) {
        this.actif = actif;
    }
}
