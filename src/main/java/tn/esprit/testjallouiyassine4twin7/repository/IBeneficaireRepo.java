package tn.esprit.testjallouiyassine4twin7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testjallouiyassine4twin7.models.Assurance;
import tn.esprit.testjallouiyassine4twin7.models.Beneficiaire;

public interface IBeneficaireRepo extends JpaRepository<Beneficiaire,Integer> {//DOA

    Beneficiaire findByCin(Integer cin);

}
