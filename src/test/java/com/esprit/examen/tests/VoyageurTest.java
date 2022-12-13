package com.esprit.examen.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.Voyageur;
import com.esprit.examen.repositories.VoyageurRepository;
import com.esprit.examen.services.VoyageurServiceImpl;

import lombok.extern.slf4j.Slf4j;

@ExtendWith(MockitoExtension.class)
	@SpringBootTest
	@Slf4j
	public class VoyageurTest {
	    @Mock
	    VoyageurRepository VoyageurRepository;
	    @InjectMocks
	    VoyageurServiceImpl VoyageurService;
	    
	    Voyageur voyageur = Voyageur.builder().nomVoyageur("iheb").build();

	    @Test
	    public void addVoyageur() {
	        Mockito.when(VoyageurRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(voyageur));
	        Mockito.when(VoyageurRepository.save(Mockito.any(Voyageur.class))).thenReturn(voyageur);
	         VoyageurService.ajouterVoyageur(voyageur);
	        
	         Voyageur v = VoyageurService.recupererVoyageParId(1L);
	        		 assertEquals("iheb", v.getNomVoyageur());
	     
	        
	        verify(VoyageurRepository, times(1)).save(Mockito.any(Voyageur.class));
	        verify(VoyageurRepository, times(2)).findById(Mockito.anyLong());
	        log.info("ajouterVoyageur test passed");
	    }
	}