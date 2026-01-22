package com.biblio.bibliotehque_final.controller;

import com.biblio.bibliotehque_final.dto.EmpruntCreateDto;
import com.biblio.bibliotehque_final.dto.EmpruntsAvecLivreMembre;
import com.biblio.bibliotehque_final.model.Emprunt;
import com.biblio.bibliotehque_final.service.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprunts")
@CrossOrigin(origins = "*")
public class EmpruntController {

    @Autowired
    private EmpruntService empruntService;

    @GetMapping("/all")
    public List<EmpruntsAvecLivreMembre> getAllEmprunts() {
        return empruntService.getAll();
    }

    @GetMapping("/{id}")
    public Emprunt getById(@PathVariable Long id) {
        return empruntService.getById(id);

    }

    @PostMapping("/new")
    public String createEmprunt(@RequestBody EmpruntCreateDto emprunt) {
        empruntService.create(emprunt);
        return "Created";
    }
}
