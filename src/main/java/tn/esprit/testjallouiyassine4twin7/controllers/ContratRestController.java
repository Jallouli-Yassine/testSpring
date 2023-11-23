package tn.esprit.testjallouiyassine4twin7.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testjallouiyassine4twin7.models.Beneficiaire;
import tn.esprit.testjallouiyassine4twin7.models.Contrat;
import tn.esprit.testjallouiyassine4twin7.services.IBeneficaireService;
import tn.esprit.testjallouiyassine4twin7.services.IContratService;

@RequiredArgsConstructor
@RequestMapping("contrat")
@RestController
public class ContratRestController {
    private final IContratService contratService;


    @PostMapping("/addC")
    public Contrat addContrat(@RequestBody Contrat c){
        return contratService.ajouterContrat(c);
    }

    @GetMapping("/getContrat/{idBnfc}")
    public Contrat getContrat(@PathVariable Integer idBnfc){
        return contratService.getContratBf(idBnfc);
    }
}
