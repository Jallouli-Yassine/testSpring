package tn.esprit.testjallouiyassine4twin7.services.IMPL;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.testjallouiyassine4twin7.models.Amodifier;
import tn.esprit.testjallouiyassine4twin7.services.IAmodifierService;

import java.util.List;

@Primary
@AllArgsConstructor
@Service
public class AmodifierServiceImpl implements IAmodifierService {
    @Override
    public void ajouterAmodifier(Amodifier amodifier) {

    }

    @Override
    public void supprimerAmodifier(Amodifier amodifier) {

    }

    @Override
    public void modifierAmodifier(Amodifier amodifier) {

    }

    @Override
    public Amodifier getAmodifier(int id) {
        return null;
    }

    @Override
    public List<Amodifier> getAllAmodifier() {
        return null;
    }
}
