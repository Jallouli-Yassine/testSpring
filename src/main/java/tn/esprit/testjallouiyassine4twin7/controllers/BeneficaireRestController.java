package tn.esprit.testjallouiyassine4twin7.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testjallouiyassine4twin7.models.Beneficiaire;
import tn.esprit.testjallouiyassine4twin7.models.TypeContrat;
import tn.esprit.testjallouiyassine4twin7.services.IBeneficaireService;

import java.util.Collections;
import java.util.Set;

@RequiredArgsConstructor
@RequestMapping("benificiaire")
@RestController
public class BeneficaireRestController {

    private final IBeneficaireService beneficaireService;

    @PostMapping("/addB")
    public Beneficiaire addBen(@RequestBody Beneficiaire b){
        return beneficaireService.ajouterBeneficiaire(b);
    }

    @GetMapping("/getBenef/{type}")
    public Set<Beneficiaire> getBeneficairesByTypeApi(@PathVariable String type){
            return beneficaireService.getBeneficairesByType(TypeContrat.valueOf(type));
    }

    @GetMapping("/getMontantBf/{cinBf}")
    public float getMontantBfApi(@PathVariable Integer cinBf){
            return beneficaireService.getMontantBf(cinBf);
    }
    @GetMapping("/statistiques")
    public void statistiquesApi(){
        beneficaireService.statistiques();
    }




}
