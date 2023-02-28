package tn.esprit.spring.stationdeski.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.stationdeski.entities.Abonnement;
import tn.esprit.spring.stationdeski.entities.Skieur;
import tn.esprit.spring.stationdeski.services.IAbonnementService;
import tn.esprit.spring.stationdeski.services.ISkieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurRestController {
    ISkieurService skieurService;

    // http://localhost:8089/stationSki/skieur/retrieve-all-skieurs
    @GetMapping("/retrieve-all-skieurs")
    public List<Skieur> getskieurs(){
        List<Skieur> listskieurs = skieurService.retrieveAllSkieurs();
        return listskieurs;
    }

    // http://localhost:8089/stationSki/skieur/retrieve-skieur/8
    @GetMapping("/retrieve-skieur/{skieur-id}")
    public Skieur retrieveskieur(@PathVariable("skieur-id") Integer skieurId) {
        return skieurService.retrieveSkieur(skieurId);
    }

    // http://localhost:8089/stationSki/skieur/add-skieur
    @PostMapping("/add-skieur")
    public Skieur addskieur(@RequestBody Skieur s) {
        Skieur skieur = skieurService.addSkieur(s);
        return skieur;
    }

    // http://localhost:8089/stationSki/skieur/remove-skieur/1
    @DeleteMapping("/remove-skieur/{skieur-id}")
    public void removeskieur(@PathVariable("skieur-id") Integer skieurId) {
        skieurService.deleteSkieur(skieurId);
    }

    // http://localhost:8089/stationSki/skieur/update-skieur
    @PutMapping("/update-skieur")
    public Skieur updateskieur(@RequestBody Skieur p) {
        Skieur skieur= skieurService.updateSkieur(p);
        return skieur;
    }

}
