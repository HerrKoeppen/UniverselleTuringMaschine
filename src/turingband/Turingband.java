
package turingband;

import java.util.ArrayList;
import java.io.*;
import textgruppe.Texteinlesen;

public class Turingband 
{
    private ArrayList<String> keller;
    private String kellerzeichen= "#";
    private String eingabe;
    
            
    public Turingband()
    {
        keller = new ArrayList<String>();
        keller.add(kellerzeichen);
    }

    public void zeichenHinzufuegen(String eingabe)
    {        
        for (String dateien : platzhalter.BA)
        {
            if (eingabe.equals(dateien))
            {
                keller.add(eingabe);
            }
        }
    }

    public void schreibkopfBewegen(String richtung)
    {
        if (richtung.toUpperCase().equals("R"))
        {
//            keller.next();
        }
    }
}

