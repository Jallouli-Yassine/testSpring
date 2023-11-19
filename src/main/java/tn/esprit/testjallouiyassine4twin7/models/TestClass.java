package tn.esprit.testjallouiyassine4twin7.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TestClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTestClass;

    private String nameTestClass;



}
