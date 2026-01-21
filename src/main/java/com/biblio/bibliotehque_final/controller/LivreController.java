package com.biblio.bibliotehque_final.controller;

import com.biblio.bibliotehque_final.dto.EmpruntsAvecLivreMembre;
import com.biblio.bibliotehque_final.model.Livre;
import com.biblio.bibliotehque_final.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livres")
@CrossOrigin(origins = "*")
public class LivreController {

    @Autowired
    private LivreService livreService;

//    @GetMapping("/all")
//    public List<Livre> getAllLivres() {
//        return livreService.getAllLivres();
//    }

    @GetMapping("/all")
    public List<Livre> getAllEmprunts() {
        return livreService.getAllLivres();
    }
}
