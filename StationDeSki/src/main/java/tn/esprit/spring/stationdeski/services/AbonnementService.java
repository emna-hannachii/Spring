package tn.esprit.spring.stationdeski.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.stationdeski.entities.Abonnement;
import tn.esprit.spring.stationdeski.entities.TypeAbonnement;
import tn.esprit.spring.stationdeski.repositories.AbonnementRepository;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class AbonnementService implements IAbonnementService{
   AbonnementRepository abonnementRepository;

    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return (List<Abonnement>) abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement a) {
        abonnementRepository.save(a);
        return a;
    }

    @Override
    public Abonnement updateAbonnement(Abonnement a) {
        abonnementRepository.save(a);
        return a;
    }

    @Override
    public Abonnement retrieveAbonnement(Integer idAbonnement) {
        return abonnementRepository.findById(idAbonnement).get();
    }

    @Override
    public void deleteAbonnement(Integer idAbonnement) {
        abonnementRepository.deleteById(idAbonnement);
    }

    @Override
    public Set<Abonnement> getAbonnementByType(TypeAbonnement typeAbonnement) {
        Set<Abonnement> ab= (Set<Abonnement>) abonnementRepository.findByTypeAbonnement(typeAbonnement);
        return ab;
    }

}
