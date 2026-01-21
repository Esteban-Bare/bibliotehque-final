package com.biblio.bibliotehque_final.repository;

import com.biblio.bibliotehque_final.model.Livre;
import com.biblio.bibliotehque_final.model.Membre;
import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembreRepository extends JpaRepository<Membre,Integer> {
    public Membre findMembreByNom(String nom);
}
