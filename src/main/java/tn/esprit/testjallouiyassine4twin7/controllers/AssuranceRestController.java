package tn.esprit.testjallouiyassine4twin7.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testjallouiyassine4twin7.models.Assurance;
import tn.esprit.testjallouiyassine4twin7.models.Beneficiaire;
import tn.esprit.testjallouiyassine4twin7.services.IAssuranceService;

@RequiredArgsConstructor
@RequestMapping("assurance")
@RestController
public class AssuranceRestController {
    IAssuranceService assuranceService;
    @PostMapping("/addAss/{cinBf}/{matricule}")
    public Assurance addAssurance(@RequestBody Assurance a, @PathVariable int cinBf, @PathVariable String matricule){
        return assuranceService.ajouterAssurance(a, cinBf, matricule);
    }


}
