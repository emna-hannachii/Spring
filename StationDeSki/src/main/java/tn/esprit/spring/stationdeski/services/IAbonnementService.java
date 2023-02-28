package tn.esprit.spring.stationdeski.services;

import tn.esprit.spring.stationdeski.entities.Abonnement;

import java.util.List;

public interface IAbonnementService {

    List<Abonnement> retrieveAllAbonnements();

    Abonnement addAbonnement(Abonnement a);

    Abonnement updateAbonnement (Abonnement a);

    Abonnement retrieveAbonnement (Integer idAbonnement);

    void deleteAbonnement( Integer idAbonnement);
}
