package com.biblio.bibliotehque_final.dto;


import com.biblio.bibliotehque_final.model.Emprunt;
import com.biblio.bibliotehque_final.model.Livre;
import com.biblio.bibliotehque_final.model.Membre;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class EmpruntsAvecLivreMembre {
    private Long id;
    private LocalDate dateEmprunt;
    private LocalDate dateRetourPrevue;
    private LocalDate dateRetourEffective;
    private Membre membre;
    private Livre livre;

    public EmpruntsAvecLivreMembre(Emprunt emprunt) {
        this.id = emprunt.getId();
        this.dateEmprunt = emprunt.getDateEmprunt();
        this.dateRetourPrevue = emprunt.getDateRetourPrevue();
        this.dateRetourEffective = emprunt.getDateRetourEffective();
        this.membre = emprunt.getMembre();
        this.livre = emprunt.getLivre();
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
}
