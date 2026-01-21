package com.biblio.bibliotehque_final.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titre")
    private String titre;

    @Column(name = "auteur")
    private String auteur;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "annee_publication")
    private int annePublication;

    @Column(name = "categorie")
    private String categorie;

    @Column(name = "exemplaires_total")
    private int exemplaireTotal;

    @Column(name = "exemplaires_disponibles")
    private int exemplaireDisponible;

    @OneToMany(mappedBy = "livre", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "emprunt-livre")
    private List<Emprunt> emprunts;

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", isbn='" + isbn + '\'' +
                ", annePublication=" + annePublication +
                ", categorie='" + categorie + '\'' +
                ", exemplaireTotal=" + exemplaireTotal +
                ", exemplaireDisponible=" + exemplaireDisponible +
                ", emprunts=" + emprunts +
                '}';
    }

    public Livre() {
    }

    public Livre(final Long id, final String titre, final String auteur, final String isbn, final int annePublication, final String categorie, final int exemplaireTotal, final int exemplaireDisponible, final List<Emprunt> emprunts) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.annePublication = annePublication;
        this.categorie = categorie;
        this.exemplaireTotal = exemplaireTotal;
        this.exemplaireDisponible = exemplaireDisponible;
        this.emprunts = emprunts;
    }

    public Livre(final String titre, final String auteur, final String isbn, final int annePublication, final String categorie, final int exemplaireTotal, final int exemplaireDisponible, final List<Emprunt> emprunts) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.annePublication = annePublication;
        this.categorie = categorie;
        this.exemplaireTotal = exemplaireTotal;
        this.exemplaireDisponible = exemplaireDisponible;
        this.emprunts = emprunts;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(final String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(final String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(final String isbn) {
        this.isbn = isbn;
    }

    public int getAnnePublication() {
        return this.annePublication;
    }

    public void setAnnePublication(final int annePublication) {
        this.annePublication = annePublication;
    }

    public String getCategorie() {
        return this.categorie;
    }

    public void setCategorie(final String categorie) {
        this.categorie = categorie;
    }

    public int getExemplaireTotal() {
        return this.exemplaireTotal;
    }

    public void setExemplaireTotal(final int exemplaireTotal) {
        this.exemplaireTotal = exemplaireTotal;
    }

    public int getExemplaireDisponible() {
        return this.exemplaireDisponible;
    }

    public void setExemplaireDisponible(final int exemplaireDisponible) {
        this.exemplaireDisponible = exemplaireDisponible;
    }

    public List<Emprunt> getEmprunts() {
        return this.emprunts;
    }

    public void setEmprunts(final List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }
}
