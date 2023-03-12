package tn.esprit.spring.stationdeski.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.stationdeski.entities.Moniteur;
import tn.esprit.spring.stationdeski.services.IMoniteurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/moniteur")
public class MoniteurRestController {
    IMoniteurService moniteurService;

    // http://localhost:8089/stationSki/moniteur/retrieve-all-moniteurs
    @GetMapping("/retrieve-all-moniteurs")
    public List<Moniteur> getMoniteurs(){
        List<Moniteur> listMoniteurs = moniteurService.retrieveAllMoniteurs();
        return listMoniteurs;
    }

    // http://localhost:8089/stationSki/moniteur/retrieve-moniteur/8
    @GetMapping("/retrieve-moniteur/{moniteur-id}")
    public Moniteur retrieveMoniteur(@PathVariable("moniteur-id") Integer moniteurId) {
            return moniteurService.retrieveMoniteur(moniteurId);
}

    // http://localhost:8089/stationSki/moniteur/add-moniteur
    @PostMapping("/add-moniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m) {
        Moniteur moniteur = moniteurService.addMoniteur(m);
        return moniteur;
    }

    // http://localhost:8089/stationSki/moniteur/remove-moniteur/1
    @DeleteMapping("/remove-moniteur/{moniteur-id}")
    public void removeMoniteur(@PathVariable("moniteur-id") Integer moniteurId) {
        moniteurService.deleteMoniteur(moniteurId);
    }

    // http://localhost:8089/stationSki/moniteur/update-moniteur
    @PutMapping("/update-moniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur m) {
        Moniteur moniteur= moniteurService.updateMoniteur(m);
        return moniteur;
    }

    @PostMapping("/addMoniteurToCours")
    public Moniteur addMoniteurAndAssignToCours(@RequestBody Moniteur m){
        Moniteur moniteur=moniteurService.addMoniteurAndAssignToCours(m);
        return moniteur;
    }

}



