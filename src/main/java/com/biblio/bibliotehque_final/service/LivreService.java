package com.biblio.bibliotehque_final.service;

import com.biblio.bibliotehque_final.dto.EmpruntsAvecLivreMembre;
import com.biblio.bibliotehque_final.model.Livre;
import com.biblio.bibliotehque_final.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;

    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    public List<Livre> getLivreDisponible() {
        // Recuperation des tous les livres depuis le repository dans une variable
        List<Livre> livres = livreRepository.findAll();
        // Creation de une liste vide pour stocker les livres disponible
        List<Livre> livresDispo = new ArrayList<>();
        // Iteration avec un For Each dans la liste de tous les livres ons mets la
        // valeur dans une variable de type Livre en respectant le type de la
        // collection
        for (Livre livre : livres) {
            // Condition pour verifier si il y a au moins un livres
             if (livre.getExemplaireDisponible() > 0) {
                 // Si la condition est vrai ons ajoute le livre actuel de la
                 // iteration a la liste des livre disponible
                livresDispo.add(livre);
            }
        }
        // Valeur de retour la liste des livre disponible
        return livresDispo;
    }

    public Livre getLivreById(Integer livreId) {
        return livreRepository.getReferenceById(Long.valueOf(livreId));
    }
}
