package com.esprit.alternance.kaddem.entites;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;
@Entity
@Table(name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private Integer idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option op;
// Constructeur et accesseurs (getters) et mutateurs (setters)
    @OneToMany (mappedBy = "etudiant")
    private List <Contrat> contrat;
    @ManyToOne()
    private Department department;
    @ManyToMany(mappedBy = "etudiants")
    private List<Equipe> equipes;

}
