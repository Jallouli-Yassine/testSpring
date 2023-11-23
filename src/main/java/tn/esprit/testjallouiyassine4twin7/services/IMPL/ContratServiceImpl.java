package tn.esprit.testjallouiyassine4twin7.services.IMPL;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.testjallouiyassine4twin7.models.Assurance;
import tn.esprit.testjallouiyassine4twin7.models.Beneficiaire;
import tn.esprit.testjallouiyassine4twin7.models.Contrat;
import tn.esprit.testjallouiyassine4twin7.repository.IBeneficaireRepo;
import tn.esprit.testjallouiyassine4twin7.repository.IContratRepo;
import tn.esprit.testjallouiyassine4twin7.services.IContratService;

@Primary
@AllArgsConstructor
@Service
public class ContratServiceImpl implements IContratService {

    IContratRepo contratRepo;
    IBeneficaireRepo beneficaireRepo;
    @Override
    public Contrat ajouterContrat(Contrat c) {
        return contratRepo.save(c);
    }

    @Override
    public Contrat getContratBf(int idBf) {

        Beneficiaire b = this.beneficaireRepo.findById(idBf).orElse(null);
        Contrat oldestContract = b.getAssurances().get(0).getContrat();


        for(Assurance a : b.getAssurances()) {
            if(a.getContrat().getDateEffet().isBefore(oldestContract.getDateEffet()))
                oldestContract = a.getContrat();
        }

        return oldestContract;
    }






}
