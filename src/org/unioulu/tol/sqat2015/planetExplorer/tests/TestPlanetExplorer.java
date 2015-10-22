package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	

	@Test
	public void testLandingPos00() {
		PlanetExplorer explorer = new PlanetExplorer(100,100,"");
		assertEquals("0,0,N", explorer.executeCommand(""));
	}
	
//	@Test
//	public void testTurningRNewFacingE() {
//		PlanetExplorer explorer = new PlanetExplorer(100,100,"");
//		assertEquals("0,0,E", explorer.executeCommand("r"));
//	}
	
	@Test
	public void testTurningRRNewFacingS() {
		PlanetExplorer explorer = new PlanetExplorer(100,100,"");
		assertEquals("0,0,S", explorer.executeCommand("r "));
	}
}
