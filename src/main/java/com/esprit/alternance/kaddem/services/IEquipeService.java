package com.esprit.alternance.kaddem.services;


import com.esprit.alternance.kaddem.entites.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);

    void deleteEquipe(Equipe equipe);
}
