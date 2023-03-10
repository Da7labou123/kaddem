package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    List<Etudiant> findEtudiantByDepartment_IdDepartment(Integer departmentId);

    List<Etudiant> findByEquipes_Niveau_Expert();
}
