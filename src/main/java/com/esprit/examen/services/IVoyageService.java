package com.esprit.examen.services;

import java.util.List;

import com.esprit.examen.entities.Voyage;

public interface IVoyageService {

	 void ajouterVoyage(Voyage v);
	 void modifierVoyage(Voyage v);
	 //public void affecterTrainAVoyage(Long idTrain, String gareDepart, String  gareArrivee);
	 void affecterTrainAVoyage(Long idTrain, Long idVoyage);
	 List<Voyage> recupererAll();
	 Voyage recupererVoyageParId(long idVoyage);
	 void supprimerVoyage(Voyage v);

	
}
