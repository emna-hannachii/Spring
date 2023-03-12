package tn.esprit.spring.stationdeski.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.stationdeski.entities.Abonnement;
import tn.esprit.spring.stationdeski.entities.Cours;
import tn.esprit.spring.stationdeski.entities.TypeAbonnement;

public interface AbonnementRepository extends CrudRepository<Abonnement, Integer> {

    Abonnement findByTypeAbonnement(TypeAbonnement typeAbon);

}
