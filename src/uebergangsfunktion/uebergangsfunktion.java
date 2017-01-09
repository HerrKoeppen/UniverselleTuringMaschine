/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebergangsfunktion;

//import textgruppe.Texteinlesen;

import java.util.HashMap;
import java.util.Iterator;


/**
 *
 * @author henrik.kirchmann
 */
public class uebergangsfunktion {
    public String aktuellerZustand;
    private final HashMap hashUebergang = new HashMap();
    private boolean laufen; 
public uebergangsfunktion()
{
    aktuellerZustand = textgruppe.Texteinlesen.AZ.get();
    laufen = true;
}
private void erzeugeHashmap()
    {
        Iterator<String> it = textgruppe.Texteinlesen.UF.iterator();
        while(it.hasNext())
        {
            String uebergangsfunktion = it.next();
            String[] parts = uebergangsfunktion.split("|");
            String part1 = parts[0];
            String part2 = parts[1];
            hashUebergang.put(part1,part2);
        }
    }
private void uebergang(HashMap hashUebergang)
    {
    	while(laufen)
	{
                String schluessel = aktuellerZustand + "," + turingband.Turingband.bandLesen();
		String uebergangAlleInformationen = hashUebergang.get(schluessel);
		String[] uebergang = uebergangAlleInformationen.split(,);
		String eingabe = uebergang[0];
                turingband.Turingband.zeichenHinzufuegen(String eingabe);
		String richtung = uebergang[1];
                turingband.Turingband.schreibkopfBewegen(String richtung);
		String neuerZustand = uebergang[2];
                uebergangZustand(neuerZustand);
	}	    
    }
private  void uebergangZustand(String neuerZustand){
aktuellerZustand = neuerZustand;}
 
}
