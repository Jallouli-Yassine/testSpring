package tn.esprit.testjallouiyassine4twin7.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Assurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAssurance;

    private String designation;

    private float montant;

    @ManyToOne()
    private Contrat contrat;

    @ManyToOne()
    private Beneficiaire beneficiaire;



}
