package tn.esprit.spring.stationdeski.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.stationdeski.entities.Inscription;
import tn.esprit.spring.stationdeski.services.IInscriptionService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/inscription")
public class InscriptionRestController {
    IInscriptionService inscriptionService;

    // http://localhost:8089/stationSki/inscription/retrieve-all-inscriptions
    @GetMapping("/retrieve-all-inscriptions")
    public List<Inscription> getInscription(){
        List<Inscription> listInscriptions = inscriptionService.retrieveAllInscriptions();
        return listInscriptions;
    }

    // http://localhost:8089/stationSki/inscription/retrieve-inscription/8
    @GetMapping("/retrieve-inscription/{inscription-id}")
    public Inscription retrieveInscription(@PathVariable("inscription-id") Integer inscriptionId) {
        return inscriptionService.retrieveInscription(inscriptionId);
    }

    // http://localhost:8089/stationSki/inscription/add-inscription
    @PostMapping("/add-abonnement")
    public Inscription addInscription(@RequestBody Inscription i) {
        Inscription inscription = inscriptionService.addInscription(i);
        return inscription;
    }

    // http://localhost:8089/stationSki/inscription/remove-inscription/1
    @DeleteMapping("/remove-inscription/{inscription-id}")
    public void removeInscription(@PathVariable("inscription-id") Integer inscriptionId) {
        inscriptionService.deleteInscription(inscriptionId);
    }

    // http://localhost:8089/stationSki/inscription/update-inscription
    @PutMapping("/update-inscription")
    public Inscription updateInscription(@RequestBody Inscription i) {
        Inscription inscription= inscriptionService.updateInscription(i);
        return inscription;
    }

}
