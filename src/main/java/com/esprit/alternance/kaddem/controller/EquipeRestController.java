package com.esprit.alternance.kaddem.controller;

import com.esprit.alternance.kaddem.entites.Equipe;
import com.esprit.alternance.kaddem.services.IEquipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeRestController {
    IEquipeService equipeService;
    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getEquipes() {
        List<Equipe> listEquipes = equipeService.retrieveAllEquipes();
        return listEquipes;
    }
    @GetMapping("/retrive-equipe/{equipe-id}")
    public Equipe retriveEquipe(@PathVariable("equipe-id")Integer equipeId){
        return  equipeService.retrieveEquipe(equipeId);
    }
    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe e) {
        Equipe equipe = equipeService.addEquipe(e);
        return equipe;
    }
}
