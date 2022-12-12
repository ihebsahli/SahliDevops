package com.esprit.examen.services;
import java.util.ArrayList;
import java.util.List;

import com.esprit.examen.entities.Train;
import com.esprit.examen.entities.Ville;

public interface ITrainService {
     void ajouterTrain(Train t);
     void affecterTainAVoyageur(Long   idVoyageur, Ville nomGareDepart, Ville nomGareArrivee,  double heureDepart);
     int TrainPlacesLibres(Ville nomGareDepart);
     List<Train> ListerTrainsIndirects(Ville nomGareDepart, Ville nomGareArrivee);
     void DesaffecterVoyageursTrain(Ville nomGareDepart, Ville nomGareArrivee, double heureDepart);
     void TrainsEnGare();
}
