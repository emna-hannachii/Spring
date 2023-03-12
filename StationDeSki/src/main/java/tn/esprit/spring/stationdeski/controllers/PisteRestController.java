package tn.esprit.spring.stationdeski.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.stationdeski.entities.Piste;
import tn.esprit.spring.stationdeski.services.IPisteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/piste")
public class PisteRestController {
    IPisteService pisteService;

    // http://localhost:8089/stationSki/piste/retrieve-all-pistes
    @GetMapping("/retrieve-all-pistes")
    public List<Piste> getPistes(){
        List<Piste> listPistes = pisteService.retrieveAllPistes();
        return listPistes;
    }

    // http://localhost:8089/stationSki/piste/retrieve-piste/8
    @GetMapping("/retrieve-piste/{piste-id}")
    public Piste retrievePiste(@PathVariable("piste-id") Integer pisteId) {
        return pisteService.retrievePiste(pisteId);
    }

    // http://localhost:8089/stationSki/piste/add-piste
    @PostMapping("/add-piste")
    public Piste addPiste(@RequestBody Piste p) {
        Piste piste = pisteService.addPiste(p);
        return piste;
    }

    // http://localhost:8089/stationSki/piste/remove-piste/1
    @DeleteMapping("/remove-piste/{piste-id}")
    public void removePiste(@PathVariable("piste-id") Integer pisteId) {
        pisteService.deletePiste(pisteId);
    }

    // http://localhost:8089/stationSki/piste/update-piste
    @PutMapping("/update-piste")
    public Piste updatePiste(@RequestBody Piste p) {
        Piste piste= pisteService.updatePiste(p);
        return piste;
    }





}
