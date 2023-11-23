package tn.esprit.testjallouiyassine4twin7.services;

import tn.esprit.testjallouiyassine4twin7.models.Assurance;
import tn.esprit.testjallouiyassine4twin7.models.Beneficiaire;
import tn.esprit.testjallouiyassine4twin7.models.TypeContrat;

import java.util.List;
import java.util.Set;

public interface IBeneficaireService {

    public Beneficiaire ajouterBeneficiaire(Beneficiaire bf);

    public Set<Beneficiaire> getBeneficairesByType (TypeContrat typeContrat);
    public float getMontantBf (int cinBf);

    public void statistiques ();



}
