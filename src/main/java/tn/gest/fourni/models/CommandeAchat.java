package tn.gest.fourni.models;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class CommandeAchat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    
    @ManyToOne
    private Fournisseur fournisseur;
    
    private LocalDate date;
    private String statut;
    private double montant;
}

