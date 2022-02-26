import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author
 *
 */
@RunWith(Parameterized.class)
class CalculsTest2 {

	@Test
	void test() 
	{
		
	}

	// Fournisseur de données
    static Stream<Arguments> chargerJeuDeTestM() throws Throwable 
    {
        return Stream.of(
            Arguments.of(2,2,4), // appellera : testMultiplier(2,2,4)
            Arguments.of(6,6,36),
            Arguments.of(3,2,6)
        );
    }
    
	// Fournisseur de données
    static Stream<Arguments> chargerJeuDeTestA() throws Throwable 
    {
        return Stream.of(
            Arguments.of(2,2,4), // appellera : testMultiplier(2,2,4)
            Arguments.of(6,6,12),
            Arguments.of(3,2,5)
        );
    }
    
 // Fournisseur de données
    static Stream<Arguments> chargerJeuDeTestS() throws Throwable 
    {
        return Stream.of(
            Arguments.of(2,2,0), // appellera : testMultiplier(2,2,4)
            Arguments.of(8,6,2),
            Arguments.of(3,2,1)
        );
    }
    
 // Fournisseur de données
    static Stream<Arguments> chargerJeuDeTestD() throws Throwable 
    {
        return Stream.of(
            Arguments.of(4,2,2), // appellera : testMultiplier(2,2,4)
            Arguments.of(8,2,4),
            Arguments.of(6,2,3)
        );
    }
    
	@ParameterizedTest(name="Multiplication numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestM")
	void testMultiplier(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.multiplier(), "test réussi pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	}
	
	@ParameterizedTest(name="Addition numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestA")
	void testAdditionner(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.additionner(), "test réussi pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	}
	
	@ParameterizedTest(name="Soustraction numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestS")
	void testSoustraire(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.soustraire(), "test réussi pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	}
	
	@ParameterizedTest(name="Division numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTestD")
	void testDiviser(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.diviser(), "test réussi pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	}

}

