package com.biblio.bibliotehque_final.controller;

import com.biblio.bibliotehque_final.model.Membre;
import com.biblio.bibliotehque_final.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/membre")
@CrossOrigin(origins = "*")
public class MembreController {
    @Autowired
    private MembreService membreService;

    @GetMapping("/all")
    public List<Membre> getAllMembre() {
        return membreService.findAllMembre();
    }

    @PostMapping("/create")
    public ResponseEntity<String> createMembre(@RequestBody Membre membre) {
        return membreService.createMembre(membre);
    }
}
