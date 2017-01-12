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
public class Uebergangsfunktion {
    public String aktuellerZustand;
    public final HashMap hashUebergang = new HashMap();
    private boolean laufen; 
public Uebergangsfunktion()
{
    aktuellerZustand = textgruppe.Texteinlesen.AZ.get(0);
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
public boolean uebergang(HashMap hashUebergang, turingband.Turingband t, textgruppe.Texteinlesen e)
    {
    	while(laufen)
	{
                
                String schluessel = aktuellerZustand + "," + t.glSymbol;
		String uebergangAlleInformationen = (String) hashUebergang.get(schluessel);
                String[] uebergang = uebergangAlleInformationen.split(",");
		String eingabe = uebergang[0];
                t.zeichenHinzufuegen(eingabe);
		String richtung = uebergang[1];
                t.schreibkopfBewegen(richtung);
		String neuerZustand = uebergang[2];
                aktuellerZustand = neuerZustand;
                if(t.finish){
                    laufen=false;
                }
	}
        if(aktuellerZustand.equals(e.EZ.get(0))){
            return true;}
        else{
             return false;}
        }
    }
 