package com.esprit.examen.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.Train;





@Repository
public interface TrainRepository extends CrudRepository<Train, Long> {
	

	
//    @Query("select AVG(tr.nbPlaceLibre) from Train tr where tr.GareDepart.idGare=:idgd")
//    public int TrainPlacesLibres(@Param("idgd")Long idGareDepart);

}
