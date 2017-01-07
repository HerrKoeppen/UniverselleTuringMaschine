
package turingband;

import java.util.ArrayList;
import java.io.*;
import textgruppe.Texteinlesen;

public class Turingband 
{
    private ArrayList<String> band;
    private String kellerzeichen= "#";
    private String eingabe;
    private int index = 0;
    
            
    public Turingband()
    {
        band = new ArrayList<String>();
        band.set(index, kellerzeichen);
    }

    public void zeichenHinzufuegen(String eingabe)
    {        
        for (String dateien : platzhalter.BA)
        {
            if (eingabe.equals(dateien))
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
        }
        else if (richtung.toUpperCase().equals("L")) 
        {
            index = index - 1; 
        }
    }
    
    public String lesen()
    {
        return band.get(index);
    }
}

