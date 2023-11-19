package tn.esprit.testjallouiyassine4twin7.services;

import tn.esprit.testjallouiyassine4twin7.models.Amodifier;

import java.util.List;

public interface IAmodifierService {
    public void ajouterAmodifier(Amodifier amodifier);

    public void supprimerAmodifier(Amodifier amodifier);

    public void modifierAmodifier(Amodifier amodifier);

    public Amodifier getAmodifier(int id);

    public List<Amodifier> getAllAmodifier();


}
