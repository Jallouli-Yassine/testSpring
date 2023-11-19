package tn.esprit.testjallouiyassine4twin7.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.testjallouiyassine4twin7.services.IAmodifierService;

@RequiredArgsConstructor
@RequestMapping("amodifier")
@RestController
public class AmodiferRestController {

    private final IAmodifierService aModifierService;


}
