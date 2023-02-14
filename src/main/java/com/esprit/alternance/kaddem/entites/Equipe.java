package com.esprit.alternance.kaddem.entites;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Equipe implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe", nullable = false)
    private Long idEquipe;

    private String nameEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @ManyToMany()
    private List<Etudiant> etudiants;
    @OneToOne(mappedBy = "equipe")
    private DetailEquipe detailEquipe;

}
