package tn.esprit.spring.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.stationdeski.entities.Cours;
import tn.esprit.spring.stationdeski.repositories.CoursRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursService implements ICoursService{
    CoursRepository coursRepository;

    @Override
    public List<Cours> retrieveAllCours() {
        return (List<Cours>) coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours c) {
        coursRepository.save(c);
        return c;
    }

    @Override
    public Cours updateCours(Cours c) {
        coursRepository.save(c);
        return c;
    }

    @Override
    public Cours retrieveCours(Integer idCours) {
        return coursRepository.findById(idCours).get();
    }

    @Override
    public void deleteCours(Integer idCours) {
        coursRepository.deleteById(idCours);

    }
}
