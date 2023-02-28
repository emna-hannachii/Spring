package tn.esprit.spring.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.stationdeski.entities.Skieur;
import tn.esprit.spring.stationdeski.repositories.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SkieurService implements ISkieurService{
    SkieurRepository skieurRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return (List<Skieur>) skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur s) {
        skieurRepository.save(s);
        return s;
    }

    @Override
    public Skieur updateSkieur(Skieur s) {
        skieurRepository.save(s);
        return s;
    }

    @Override
    public Skieur retrieveSkieur(Integer idSkieur) {
        return skieurRepository.findById(idSkieur).get();
    }

    @Override
    public void deleteSkieur(Integer idSkieur) {
        skieurRepository.deleteById(idSkieur);

    }
}
