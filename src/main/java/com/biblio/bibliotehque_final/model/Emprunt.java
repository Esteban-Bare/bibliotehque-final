package com.biblio.bibliotehque_final.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "emprunt")
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_emprunt")
    private LocalDate dateEmprunt;

    @Column(name = "date_retour_prevue")
    private LocalDate dateRetourPrevue;

    @Column(name = "date_retour_effective")
    private LocalDate dateRetourEffective;

    @ManyToOne
    @JoinColumn(name = "membre_id")
    @JsonBackReference(value = "emprunt-membre")
    private Membre membre;

    @ManyToOne
    @JoinColumn(name = "livre_id")
    @JsonBackReference(value = "emprunt-livre")
    private Livre livre;

    public Emprunt(final Long id, final LocalDate dateEmprunt, final LocalDate dateRetourPrevue, final LocalDate dateRetourEffective, final Membre membre, final Livre livre) {
        this.id = id;
        this.dateEmprunt = dateEmprunt;
        this.dateRetourPrevue = dateRetourPrevue;
        this.dateRetourEffective = dateRetourEffective;
        this.membre = membre;
        this.livre = livre;
    }

    public Emprunt(final LocalDate dateEmprunt, final LocalDate dateRetourPrevue, final LocalDate dateRetourEffective, final Membre membre, final Livre livre) {
        this.dateEmprunt = dateEmprunt;
        this.dateRetourPrevue = dateRetourPrevue;
        this.dateRetourEffective = dateRetourEffective;
        this.membre = membre;
        this.livre = livre;
    }

    public Emprunt() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public LocalDate getDateEmprunt() {
        return this.dateEmprunt;
    }

    public void setDateEmprunt(final LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public LocalDate getDateRetourPrevue() {
        return this.dateRetourPrevue;
    }

    public void setDateRetourPrevue(final LocalDate dateRetourPrevue) {
        this.dateRetourPrevue = dateRetourPrevue;
    }

    public LocalDate getDateRetourEffective() {
        return this.dateRetourEffective;
    }

    public void setDateRetourEffective(final LocalDate dateRetourEffective) {
        this.dateRetourEffective = dateRetourEffective;
    }

    public Membre getMembre() {
        return this.membre;
    }

    public void setMembre(final Membre membre) {
        this.membre = membre;
    }

    public Livre getLivre() {
        return this.livre;
    }

    public void setLivre(final Livre livre) {
        this.livre = livre;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", dateEmprunt=" + dateEmprunt +
                ", dateRetourPrevue=" + dateRetourPrevue +
                ", dateRetourEffective=" + dateRetourEffective +
                ", membre=" + membre +
                ", livre=" + livre +
                '}';
    }
}
