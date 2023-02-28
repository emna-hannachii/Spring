package tn.esprit.spring.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.stationdeski.entities.Moniteur;
import tn.esprit.spring.stationdeski.repositories.MoniteurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MoniteurService implements IMoniteurService{
    MoniteurRepository moniteurRepository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
       return (List<Moniteur>) moniteurRepository.findAll();

    }

    @Override
    public Moniteur addMoniteur(Moniteur e) {
        moniteurRepository.save(e);
        return e;
    }

    @Override
    public Moniteur updateMoniteur(Moniteur e) {
        moniteurRepository.save(e);
        return e;
    }

    @Override
    public Moniteur retrieveMoniteur(Integer idMoniteur) {
        return moniteurRepository.findById(idMoniteur).get();
    }

    @Override
    public void deleteMoniteur(Integer idMoniteur) {
        moniteurRepository.deleteById(idMoniteur);
    }
}
