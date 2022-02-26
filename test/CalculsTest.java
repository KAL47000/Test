import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CalculsTest {

	private Calculs c1 = null;
	private Calculs c2 = null;
	private Calculs c3 = null;
	
	//pour la division
	private Calculs c4_pour_division = null;
	private Calculs c5_pour_division = null;
	
	/**
	 * Initialise les valeurs avant chaque test 
	 */
	@BeforeEach // Déclencher cette méthode avant l'ex�cution
	void setUp() throws Exception 
	{
		c1 = new Calculs(1,2);
		c2 = new Calculs(10,20);
		c3 = new Calculs(100,200);
		//pour la division
		c4_pour_division = new Calculs(4,2);
		c5_pour_division = new Calculs (8,2);
	}
	

	/**
	 * Test method for {@link Calculs#multiplier()}.
	 */
	@Test
	void testMultiplier() 
	{
		if (c1.multiplier() != 2)
		{
			fail("Methode multiplier conforme 2*1=2 ne fonctionne pas.");
		}
		if (c2.multiplier() != 200)
		{
			fail("Methode multiplier conforme 10*20=200 ne fonctionne pas.");			
		}
		if (c3.multiplier() != 20000)
		{
			fail("Methode multiplier conforme 100*200=20000 ne fonctionne pas.");			
		}

		
		// Est ce que (1*2 == 2) ? 
		assertEquals(c1.multiplier(), 2, "Methode multiplier conforme 2*1=2 fonctionne.");

	}

	/**
	 * Test method for {@link Calculs#additionner()}.
	 */
	@Test
	void testAdditionner() {
		
		if(c1.additionner() != 3) {
			
			fail("Methode additionner non conforme 2+1=3");
		}
		
		if (c2.additionner() != 30)
		{
			fail("Methode additionner non conforme 10+20=30 ne fonctionne pas.");			
		}
		if (c3.additionner() != 300)
		{
			fail("Methode additionner non conforme 100+200=300 ne fonctionne pas.");			
		}
		
		// Est ce que (2+1 == 3) ? non donc : test en Erreur
		assertEquals(c1.additionner(), 3, "Methode additionner conforme 2+1=3 fonctionne.");
	}

	
	/**
	 * Test method for {@link Calculs#soustraire()}.
	 */
	@Test
	void testSoustraire() {
		
		if(c1.soustraire() != -1) {
			
			fail("Methode soustraire non conforme 1-2=-1");
		}
		
		if (c2.soustraire() != -10)
		{
			fail("Methode soustraire non conforme 10-20=-10 ne fonctionne pas.");			
		}
		if (c3.soustraire() != -100)
		{
			fail("Methode soustraire non conforme 100-200=-100 ne fonctionne pas.");			
		}
		
		// Est ce que (1-2 == -1) ? 
		assertEquals(c1.soustraire(),-1, "Methode soustraire conforme 1-2=-1 fonctionne");
	}
	
	
	/**
	 * Test method for {@link Calculs#diviser()}.
	 */
	 @Test 
	 void testDiviser() {
	 
		 if(c4_pour_division.diviser() != 2) { fail("Methode diviser non conforme 4/2=2"); }
		 
		 if (c5_pour_division.diviser() != 4) {
			 fail("Methode diviser non conforme 8/2=4 ne fonctionne pas.");
		 } 
		  
		  // Est ce que (4/2 == 2) ? non donc : test en Erreur
		  assertEquals(c4_pour_division.diviser(), 2, "Methode diviser conforme 4/2=2 fonctionne"); 
	 }
	
}
