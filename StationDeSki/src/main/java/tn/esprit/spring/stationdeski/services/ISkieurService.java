package tn.esprit.spring.stationdeski.services;

import tn.esprit.spring.stationdeski.entities.Skieur;

import java.util.List;

public interface ISkieurService {

    List<Skieur> retrieveAllSkieurs();

    Skieur addSkieur(Skieur e);

    Skieur updateSkieur (Skieur e);

    Skieur retrieveSkieur (Integer idSkieur);

    void deleteSkieur( Integer idSkieur);
}
