package com.esprit.examen.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.Voyageur;
import com.esprit.examen.repositories.VoyageurRepository;
import com.esprit.examen.services.VoyageurServiceImpl;


@RunWith(SpringRunner.class)
public class VoyageurTest {
	@InjectMocks
	static VoyageurServiceImpl voyageurServiceImpl;
	@Mock
	static VoyageurRepository voyageurRepository;
	static List<Voyageur> voyageurs;
	
	
	@BeforeEach
	 void init() {
		MockitoAnnotations.openMocks(this);
		voyageurs =  new ArrayList<>();
		when(voyageurRepository.findAll()).thenReturn(voyageurs);
	}
	
	@Test
	void testRetrieveAllVoyageurs(){
		assertTrue(voyageurServiceImpl.recupererAll().isEmpty());
		
		voyageurs.add(mock(Voyageur.class));
		
		assertFalse(voyageurServiceImpl.recupererAll().isEmpty());
		
	}
	
	@Test
	void testAddVoyageur(){
		//assertTrue(stockServiceImpl.addStock().isEmpty());
		voyageurServiceImpl.ajouterVoyageur(mock(Voyageur.class));

		verify(voyageurRepository).save(any());
		

		
	}
	
	@Test
	void testUpdateVoyageur(){
		//assertTrue(stockServiceImpl.addStock().isEmpty());
		voyageurServiceImpl.modifierVoyageur(mock(Voyageur.class));
		verify(voyageurRepository).save(any());
		
	}

}