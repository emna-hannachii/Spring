package tn.esprit.spring.stationdeski.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.stationdeski.entities.Inscription;

public interface InscriptionRepository extends CrudRepository<Inscription, Integer> {
}
