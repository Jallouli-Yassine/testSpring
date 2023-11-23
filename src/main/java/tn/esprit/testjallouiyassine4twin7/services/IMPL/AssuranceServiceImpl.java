package tn.esprit.testjallouiyassine4twin7.services.IMPL;

import jakarta.transaction.Transactional;
import tn.esprit.testjallouiyassine4twin7.models.Assurance;
import tn.esprit.testjallouiyassine4twin7.models.Beneficiaire;
import tn.esprit.testjallouiyassine4twin7.models.Contrat;
import tn.esprit.testjallouiyassine4twin7.repository.IBeneficaireRepo;
import tn.esprit.testjallouiyassine4twin7.repository.IContratRepo;
import tn.esprit.testjallouiyassine4twin7.services.IAssuranceService;

public class AssuranceServiceImpl implements IAssuranceService {
    IBeneficaireRepo beneficaireRepo;
    IContratRepo contratRepo;
    @Override
    @Transactional
    public Assurance ajouterAssurance(Assurance a, int cinBf, String matricule) {
        Beneficiaire b = this.beneficaireRepo.findByCin(cinBf);
        Contrat c = this.contratRepo.findByMatricule(matricule);
        a.setBeneficiaire(b);
        a.setContrat(c);
        return a;
    }
}
