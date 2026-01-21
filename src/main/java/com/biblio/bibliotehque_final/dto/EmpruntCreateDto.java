package com.biblio.bibliotehque_final.dto;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class EmpruntCreateDto {
//    "livre_id": 1,
//            "membre_id": 1,
//            "dateEmprunt": "2026-01-20",
//            "dateRetourPrevue": "2026-02-20",
//            "dateRetourEffective": null
    private Integer livre_id;
    private Integer membre_id;
    private LocalDate dateEmprunt;
    private LocalDate dateRetourPrevue;
    private LocalDate dateRetourEffective;

    @Override
    public String toString() {
        return "EmpruntCreateDto{" +
                "livre_id=" + livre_id +
                ", membre_id=" + membre_id +
                ", dateEmprunt=" + dateEmprunt +
                ", dateRetourPrevue=" + dateRetourPrevue +
                ", dateRetourEffective=" + dateRetourEffective +
                '}';
    }

    public Integer getLivre_id() {
        return this.livre_id;
    }

    public void setLivre_id(final Integer livre_id) {
        this.livre_id = livre_id;
    }

    public Integer getMembre_id() {
        return this.membre_id;
    }

    public void setMembre_id(final Integer membre_id) {
        this.membre_id = membre_id;
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
}
