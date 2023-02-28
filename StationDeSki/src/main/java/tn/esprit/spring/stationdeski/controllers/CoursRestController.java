package tn.esprit.spring.stationdeski.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.stationdeski.entities.Cours;
import tn.esprit.spring.stationdeski.services.ICoursService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cours")
public class CoursRestController {
    ICoursService coursService;

    // http://localhost:8089/stationSki/cours/retrieve-all-cours
    @GetMapping("/retrieve-all-cours")
    public List<Cours> getCours(){
        List<Cours> listCours = coursService.retrieveAllCours();
        return listCours;
    }

    // http://localhost:8089/stationSki/cours/retrieve-cours/8
    @GetMapping("/retrieve-cours/{cours-id}")
    public Cours retrieveCours(@PathVariable("cours-id") Integer coursId) {
        return coursService.retrieveCours(coursId);
    }

    // http://localhost:8089/stationSki/abonnement/add-abonnement
    @PostMapping("/add-abonnement")
    public Cours addCours(@RequestBody Cours c) {
        Cours cours = coursService.addCours(c);
        return cours;
    }

    // http://localhost:8089/stationSki/cours/remove-cours/1
    @DeleteMapping("/remove-cours/{cours-id}")
    public void removeCours(@PathVariable("cours-id") Integer coursId) {
        coursService.deleteCours(coursId);
    }

    // http://localhost:8089/stationSki/cours/update-cours
    @PutMapping("/update-cours")
    public Cours updateCours(@RequestBody Cours c) {
        Cours cours= coursService.updateCours(c);
        return cours;
    }

}
