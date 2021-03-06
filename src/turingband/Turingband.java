
package turingband;

import java.util.ArrayList;
import textgruppe.Texteinlesen;

public class Turingband 
{
    private ArrayList<String> neuesBand;
    private ArrayList<String> band;
    public boolean finish = false;
    private String kellerzeichen;
    private String eingabe;
    private int index = 0;
    private textgruppe.Texteinlesen e;
    
    
            
    public Turingband(textgruppe.Texteinlesen e)   //Konstruktor
    {
        band = new ArrayList<String>();                 //Erstellt eine ArrayList die das Turingband simuliert
        kellerzeichen = e.BZ.get(0);
        this.e=e;
    }

    public void zeichenSetzen(String eingabe)      //Speichert Zeichen gemäß dem Bandalphabeten ins Band an der Stelle "index"
    {
        boolean accepted = false;
        for (String zeichen : e.BA)
        {
            if (eingabe.equals(zeichen))
            {
                band.set(this.index, eingabe);
                accepted=true;
            }
        }
        if(!accepted)
        {
            System.out.println("Error: Zeichen nicht im Bandalphabeten vorhanden!");
        }
    }
    
    public void zeichenHinzufuegen(String eingabe)
    {
        boolean accepted = false;
        for (String zeichen : e.BA)
        {
            if (eingabe.equals(zeichen))
            {
                band.add(eingabe);
                accepted=true;
            }
        }
        if(!accepted)
        {
            System.out.println("Error: Zeichen nicht im Bandalphabeten vorhanden!");
        }
    }

    public void schreibkopfBewegen(String richtung)     //Bewegt den Schreib-/Lesekopfkopf
    {
        if (richtung.toUpperCase().equals("R"))         //Kopf wird nach rechts bzw. oben bewegt
        {
            index = index + 1;
            if (index == band.size())
            {
                band.add(kellerzeichen);
            }
        }
        else if (richtung.toUpperCase().equals("L"))    //Kopf wird nach links bzw. unten bewegt 
        {
            index = index - 1;
            if (index == -1)                            //Verhindert ein OutOfBounce error durch das Erstellen einer neuen ArrayList, die 
            {                                           //die nötige Größe hat und befüllt diese mit den Werten aus dem alten Band
                neuesBand = new ArrayList<String>();
                neuesBand.add(kellerzeichen);
                for (String zeichen : band)
                {
                    neuesBand.add(zeichen);
                }
                index = 0;
                band = neuesBand;
            }
        }
        finish = true;
        for (String bandsymbole : band)
        {
            if (!bandsymbole.equals(kellerzeichen))
            {
                finish = false;
            }
        }
    }
    
    public String bandLesen()                       //Liest Zeichen aus dem Band an der Stelle "index" und übergibt diese weiter
    {
        return band.get(index);
    }
}