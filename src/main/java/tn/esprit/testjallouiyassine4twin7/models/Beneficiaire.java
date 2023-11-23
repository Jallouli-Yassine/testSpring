package tn.esprit.testjallouiyassine4twin7.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Beneficiaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBenef;

    private int cin;

    private String nom;

    private String prenom;

    private String profession;

    private float salaire;

    @JsonIgnore
    @OneToMany(mappedBy = "beneficiaire",fetch = FetchType.EAGER)
    List<Assurance> assurances;


}
