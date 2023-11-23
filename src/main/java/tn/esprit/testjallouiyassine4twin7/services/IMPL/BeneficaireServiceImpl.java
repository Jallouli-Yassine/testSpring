package tn.esprit.testjallouiyassine4twin7.services.IMPL;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.testjallouiyassine4twin7.models.Assurance;
import tn.esprit.testjallouiyassine4twin7.models.Beneficiaire;
import tn.esprit.testjallouiyassine4twin7.models.TypeContrat;
import tn.esprit.testjallouiyassine4twin7.repository.IBeneficaireRepo;
import tn.esprit.testjallouiyassine4twin7.services.IBeneficaireService;

import java.util.*;

@Primary
@AllArgsConstructor
@Service
public class BeneficaireServiceImpl implements IBeneficaireService {

    IBeneficaireRepo beneficaireRepo;

    @Override
    public Beneficiaire ajouterBeneficiaire(Beneficiaire bf) {
        return beneficaireRepo.save(bf);
    }

    @Override
    public Set<Beneficiaire> getBeneficairesByType(TypeContrat typeContrat) {
        Set<Beneficiaire> list = new HashSet<>();

        for (Beneficiaire b : beneficaireRepo.findAll()) {
            for (Assurance a : b.getAssurances()) {
                if (a.getContrat().getTypeContrat() == typeContrat) {
                    list.add(b);
                }
            }
        }
        return list;
    }

    @Override
    public float getMontantBf(int cinBf) {
        float montant = 0;
        Beneficiaire b = beneficaireRepo.findByCin(cinBf);
        for (Assurance a : b.getAssurances()) {
            if (a.getContrat().getTypeContrat() == TypeContrat.Annuel) {
                montant += a.getMontant();
            } else if (a.getContrat().getTypeContrat() == TypeContrat.Mensuel) {
                montant += a.getMontant() * 12;
            } else if (a.getContrat().getTypeContrat() == TypeContrat.Semestriel) {
                montant += a.getMontant() * 2;
            }
        }
        return montant;
    }

    @Override
    @Scheduled(fixedRate = 60000) // Scheduled to run every 60 seconds
    public void statistiques() {
        Map<Integer, Integer> statisticsMap = new HashMap<>();

        List<Beneficiaire> beneficiaries = beneficaireRepo.findAll();
        int numberOfAssurances = 0;


        for (Beneficiaire b : beneficiaries) {
            numberOfAssurances = b.getAssurances().size();
            Integer cin = b.getCin();

            statisticsMap.put(numberOfAssurances, cin);
        }

        Map<Integer, Integer> sortedStatisticsMap = new TreeMap<>(Collections.reverseOrder());
        sortedStatisticsMap.putAll(statisticsMap);

        for (Map.Entry<Integer, Integer> entry : sortedStatisticsMap.entrySet()) {
            System.out.println("Number of assurances: " + entry.getKey() + ", Beneficiary Cin: " + entry.getValue());
        }
    }
}