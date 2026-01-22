package com.biblio.bibliotehque_final.service;

import com.biblio.bibliotehque_final.dto.EmpruntCreateDto;
import com.biblio.bibliotehque_final.dto.EmpruntsAvecLivreMembre;
import com.biblio.bibliotehque_final.model.Emprunt;
import com.biblio.bibliotehque_final.model.Livre;
import com.biblio.bibliotehque_final.model.Membre;
import com.biblio.bibliotehque_final.repository.EmpruntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpruntService {

    @Autowired
    private EmpruntRepository empruntRepository;

    @Autowired
    private MembreService membreService;

    @Autowired
    private LivreService livreService;

    public List<EmpruntsAvecLivreMembre> getAll() {
        List<EmpruntsAvecLivreMembre> listDto = new ArrayList<>();

        for (Emprunt emprunt : empruntRepository.findAll()) {
            listDto.add(new EmpruntsAvecLivreMembre(emprunt));
        }

        return listDto;
    }

    public Emprunt getById(Long id) {
        return empruntRepository.getReferenceById(id);
    }

    public void create(EmpruntCreateDto empruntDto) {
        Membre membre = membreService.getMembreById(empruntDto.getMembre_id());
        Livre livre = livreService.getLivreById(empruntDto.getLivre_id());
        Emprunt newEmprunt = new Emprunt(empruntDto.getDateEmprunt(),empruntDto.getDateRetourPrevue(),empruntDto.getDateRetourEffective(),membre,livre);
        empruntRepository.save(newEmprunt);
    }

    public void modify(EmpruntCreateDto dto, Long id) {

        Emprunt empruntAModifier = empruntRepository.getReferenceById(id);
        if (dto.getMembre_id() != null) {
            Membre membre = membreService.getMembreById(dto.getMembre_id());
            empruntAModifier.setMembre(membre);
        }
    }
}
