package tn.esprit.testjallouiyassine4twin7.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContrat;

    private String matricule;

    private LocalDate dateEffet;

    @Enumerated(EnumType.STRING)
    private TypeContrat typeContrat;

}
