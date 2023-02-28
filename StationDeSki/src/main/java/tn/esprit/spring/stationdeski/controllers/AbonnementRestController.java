package tn.esprit.spring.stationdeski.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.stationdeski.entities.Abonnement;
import tn.esprit.spring.stationdeski.services.IAbonnementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/abonnement")
public class AbonnementRestController {
    IAbonnementService abonnementService;

    // http://localhost:8089/stationSki/abonnement/retrieve-all-abonnements
    @GetMapping("/retrieve-all-abonnements")
    public List<Abonnement> getAbonnements(){
        List<Abonnement> listAbonnements = abonnementService.retrieveAllAbonnements();
        return listAbonnements;
    }

    // http://localhost:8089/stationSki/abonnement/retrieve-abonnement/8
    @GetMapping("/retrieve-abonnement/{abonnement-id}")
    public Abonnement retrieveAbonnement(@PathVariable("abonnement-id") Integer abonnementId) {
        return abonnementService.retrieveAbonnement(abonnementId);
    }

    // http://localhost:8089/stationSki/abonnement/add-abonnement
    @PostMapping("/add-abonnement")
    public Abonnement addAbonnement(@RequestBody Abonnement a) {
        Abonnement abonnement = abonnementService.addAbonnement(a);
        return abonnement;
    }

    // http://localhost:8089/stationSki/abonnement/remove-abonnement/1
    @DeleteMapping("/remove-abonnement/{abonnement-id}")
    public void removeAbonnement(@PathVariable("abonnement-id") Integer abonnementId) {
        abonnementService.deleteAbonnement(abonnementId);
    }

    // http://localhost:8089/stationSki/abonnement/update-abonnement
    @PutMapping("/update-abonnement")
    public Abonnement updateAbonnement(@RequestBody Abonnement a) {
        Abonnement abonnement= abonnementService.updateAbonnement(a);
        return abonnement;
    }
}
