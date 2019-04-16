import java.util.List;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2019
 */
class MedienDetailAnzeigerWerkzeug
{
    private MedienDetailAnzeigerUI _ui;

    /**
     * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
     */
    public MedienDetailAnzeigerWerkzeug()
    {
        _ui = new MedienDetailAnzeigerUI();
    }

//    /**
//     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
//     * 
//     * @param medien Eine Liste von Medien.
//     * 
//     * @require (medien != null)
//     */
//    public void setMedien(List<Medium> medien)
//    {
//        assert medien != null : "Vorbedingung verletzt: (medien != null)";
//        String ausgabe = "";
//        
//        for(Medium medium :medien)
//        {
//        	if(medium instanceof DVD)
//        	{
//        		DVD dvd = (DVD)medium;
//        		ausgabe += dvd.getTitel() + " " + dvd.getKommentar() + " " + dvd.getRegisseur() + " " + dvd.getLaufzeit() + "\n";
//        	}
//        	else if(medium instanceof CD)
//        	{
//        		CD cd = (CD)medium;
//        		ausgabe += cd.getTitel() + " " + cd.getKommentar() + " " + cd.getInterpret() + " " + cd.getSpiellaenge() + "\n";
//        	}
//        	else if(medium instanceof Videospiel)
//        	{
//        		Videospiel spiel = (Videospiel)medium;
//        		ausgabe += spiel.getTitel() + " " + spiel.getKommentar() + " " + spiel.getMedienBezeichnung() + "\n";
//        	}
//        }
//        TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
//        selectedMedienTextArea.setText(ausgabe);
//    }
    /**
     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
     * 
     * @param medien Eine Liste von Medien.
     * 
     * @require (medien != null)
     */
    public void setMedien(List<Medium> medien)
    {
        assert medien != null : "Vorbedingung verletzt: (medien != null)";
        String ausgabe = "";
        
        for(Medium medium :medien)
        {
        	ausgabe += medium.getFormatiertenString();
        }
        
        TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
        selectedMedienTextArea.setText(ausgabe);
    }

    /**
     * Gibt das Panel dieses Subwerkzeugs zurück.
     * 
     * @ensure result != null
     */
    public Pane getUIPane()
    {
        return _ui.getUIPane();
    }
}
