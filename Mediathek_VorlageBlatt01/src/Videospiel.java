
class Videospiel implements Medium
{
	private String _kommentar;
	private String _titel;
	private String _plattform;
	//private String _bezeichner;
	
	/**
	 * @require bezeichner != null
	 * @require titel != null
	 * @require plattfrom != null
	 * 
	 * @ensure getMedienBezeichner() == bezeichner
	 * @ensure getKommentar() == kommentar
	 * @ensure getTitel() == titel
	 * @ensure getPlattform() == plattform
	 */
	public Videospiel(String titel, String kommentar, String plattform)
	{
		assert plattform != null : "Vorbedingung verletzt: plattform != null";
		assert titel != null : "Vorbedingung verletzt: titel != null";
		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
		
		_plattform = plattform;
		_kommentar = kommentar;
		_titel = titel;
	}
	
//	/**
//	 * @require bezeichner != null
//	 * @require titel != null
//	 * @require plattfrom != null
//	 * @require kommentar != null
//	 * 
//	 * @ensure getMedienBezeichner() == bezeichner
//	 * @ensure getKommentar() == kommentar
//	 * @ensure getTitel() == titel
//	 * @ensure getPlattform() == plattform
//	 */
//	public Videospiel(String titel, String kommentar, String plattform, String bezeichner)
//	{
//		this(titel, kommentar, plattform);
//		
//		assert plattform != null : "Vorbedingung verletzt: plattform != null";
//		assert titel != null : "Vorbedingung verletzt: titel != null";
//		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
//		assert bezeichner != null : "Vorbedingung verletzt: bezeichner != null";
//		
//		_bezeichner = bezeichner;
//	}
	
	/**
	 * Gibt die Plattform des Spiels aus
	 */
	public String getPlattform()
	{
		return _plattform;
	}
	
    /**
     * Gibt den Kommentar zu diesem Medium zurück.
     * 
     * @return Den Kommentar zu diesem Medium.
     * 
     * @ensure result != null
     */
    public String getKommentar()
    {
    	return _kommentar;
    }
    
    /**
     * Gibt die Bezeichnung für die Medienart zurück.
     * 
     * @return Die Bezeichnung für die Medienart.
     * 
     * @ensure result != null
     */
    public String getMedienBezeichnung()
    {
    	return "Videospiel";
    }
    
    /**
     * Gibt den Titel des Mediums zurück.
     * 
     * @return Den Titel des Mediums
     * 
     * @ensure result != null
     */
    public String getTitel()
    {
    	return _titel;
    }
 
    /**
     * Gibt die Merkmale eine Mediums in einem zusammengef�gtem String zur�ck
     * 
     * @return sind die Merkmale in einem String
     * 
     * @ensure result != null
     */
    @Override
    public String getFormatiertenString()
    {
    	return getTitel() + "; " + getKommentar() + "; " + getMedienBezeichnung() + "\n";
    }

}


