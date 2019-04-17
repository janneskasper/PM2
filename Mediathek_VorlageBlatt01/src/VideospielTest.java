import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VideospielTest 
{	
	private static final String KOMMENTAR = "B2";
	
	private static final String TITEL = "Ballermann 2";
	
	private static final String PLATTFORM = "XBOX";
	
	private Videospiel _spiel1;
	private Videospiel _spiel2;
	
	
	/**
	 * Spiel initialisieren
	 */
	public VideospielTest()
	{
		_spiel1 = new Videospiel(TITEL, KOMMENTAR, PLATTFORM);
		_spiel2 = new Videospiel(TITEL, KOMMENTAR, PLATTFORM);
	}

	@Test
	public void testEquals()
	{
		assertFalse(_spiel1.equals(_spiel2));
		assertTrue(_spiel1.equals(_spiel1));
	}
	
	@Test
	public void richtigInitialisiert()
	{
		assertEquals(KOMMENTAR, _spiel1.getKommentar());
		assertEquals(TITEL, _spiel1.getTitel());
		assertEquals(PLATTFORM, _spiel1.getMedienBezeichnung());
	}
	

	
	
}
