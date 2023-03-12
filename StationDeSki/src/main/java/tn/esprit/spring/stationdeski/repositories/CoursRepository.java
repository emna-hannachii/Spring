package tn.esprit.spring.stationdeski.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.stationdeski.entities.Cours;
import tn.esprit.spring.stationdeski.entities.Skieur;

public interface CoursRepository extends CrudRepository<Cours,Integer> {

    Cours findByNumCours(Long numCours);



}
