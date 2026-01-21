package com.biblio.bibliotehque_final.service;

import com.biblio.bibliotehque_final.model.Membre;
import com.biblio.bibliotehque_final.repository.MembreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembreService {
    private static final Logger log = LoggerFactory.getLogger(MembreService.class);
    @Autowired
    private MembreRepository membreRepository ;

    public List<Membre> findAllMembre() {
        return membreRepository.findAll();
    }

    public ResponseEntity<String> createMembre(Membre membre) {
        try {
            Membre saved = membreRepository.save(membre);
            return new ResponseEntity<>("Created",HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Error saving membre ", e.getMessage());
            return new ResponseEntity<>("Error creating membre " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Membre getMembreById(Integer membreId) {
        return membreRepository.getReferenceById(membreId);
    }
}
