package tn.esprit.spring.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.stationdeski.entities.Inscription;
import tn.esprit.spring.stationdeski.repositories.InscriptionRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionService implements IInscriptionService {
    InscriptionRepository inscriptionRepository;
    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return (List<Inscription>) inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription i) {
        inscriptionRepository.save(i);
        return i;
    }

    @Override
    public Inscription updateInscription(Inscription i) {
        inscriptionRepository.save(i);
        return i;
    }

    @Override
    public Inscription retrieveInscription(Integer idInscription) {
        return inscriptionRepository.findById(idInscription).get();
    }

    @Override
    public void deleteInscription(Integer idInscription) {
        inscriptionRepository.deleteById(idInscription);

    }
}
