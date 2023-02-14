package com.esprit.alternance.kaddem.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniv", nullable = false)
    private Long idUnive;
    private String nomUniversite;
    @OneToMany()
    private List<Department> departments;



}
