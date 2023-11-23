package tn.esprit.testjallouiyassine4twin7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testjallouiyassine4twin7.models.Contrat;

public interface IContratRepo extends JpaRepository<Contrat,Integer> {
    Contrat findByMatricule(String matricule);
}
