package com.esprit.examen.services;

import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.Voyageur;

import java.util.List;


public interface IVoyageurService {
    void ajouterVoyageur(Voyageur Voyageur);
    //Modifier le voyageur
    void modifierVoyageur(Voyageur voyageur);
    List<Voyageur> recupererAll();
    Voyageur recupererVoyageParId(long idVoyageur);
    void supprimerVoyageur(Voyageur v);
}
