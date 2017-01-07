
package turingband;

import java.util.ArrayList;
import java.io.*;
import textgruppe.Texteinlesen;

public class Turingband 
{
    private ArrayList<String> band;
    private String kellerzeichen;
    private String eingabe;
    private int index = 0;
    
            
    public Turingband(String bandvorbelegungszeichen)
    {
        band = new ArrayList<String>();
        band.set(index, bandvorbelegungszeichen);
        kellerzeichen = bandvorbelegungszeichen;
    }

    public void zeichenHinzufuegen(String eingabe)
    {        
        for (String zeichen : platzhalter.BA)
        {
            if (eingabe.equals(zeichen))
            {
                band.set(index, eingabe);
            }
        }
    }

    public void schreibkopfBewegen(String richtung)
    {
        if (richtung.toUpperCase().equals("R"))
        {
            index = index + 1;
            if (index == band.size())
            {
                band.add(kellerzeichen);
            }
        }
        else if (richtung.toUpperCase().equals("L")) 
        {
            index = index - 1;
            if (index == -1)
            {
                new ArrayList<String> neuesBand;
                neuesBand.add(kellerzeichen);
                for (String zeichen : band)
                {
                    neuesBand.add(zeichen);
                }
                index = 0;
                band = neuesBand;
            }
        }
    }
    
    public String lesen()
    {
        return band.get(index);
    }
}

