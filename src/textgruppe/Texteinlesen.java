package textgruppe;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Texteinlesen {
    public boolean eingabePositiv;
    private String tupelGanz;
    private String[] tupelTeile;
    public ArrayList<String> EA;   //Eingabealphabet
    public ArrayList<String> Z;    //Zustandsmenge
    public ArrayList<String> BA;   //Bandalphabet
    public ArrayList<String> UF;   //partielle Überführungsfunktion
    public ArrayList<String> AZ;   //Anfangszustand
    public ArrayList<String> BZ;   //Bandvorbelegungszeichen
    public ArrayList<String> EZ;   //Menge der Endzustände
    public ArrayList<String> EW;   //Eingabewort
    
    public Texteinlesen(){
        eingabePositiv = false;
        EA = new ArrayList();
        Z = new ArrayList();
        BA = new ArrayList();
        UF = new ArrayList();
        AZ = new ArrayList();
        BZ = new ArrayList();
        EZ = new ArrayList();
        EW = new ArrayList();
    }
    
    public void dateiEinlesen(String dateipfad) throws IOException{
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(dateipfad));
            tupelGanz = reader.readLine();
            reader.close(); 
            System.out.println(tupelGanz);
            }
        catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
    
    public void angabenInArraySpeichern(){
        tupelTeile = tupelGanz.split("/.../");    //tupelTeile ist ein Array in dem der ganze Tupel steht, aber die Angaben in jeweils einem Feld sind(Die 7 angaben sind noch nicht weiter unterteilt)
        String[] ufTeile = tupelTeile[3].split("/./");
        for(int z=0; z<ufTeile.length; z++){
            UF.add(ufTeile[z]);
        }
        for(int teile=0; teile<7; teile++){                
            String[] einzelAngabe = tupelTeile[teile].split(",");//die Angaben werden in einzelteile Unterteilt
            for (int i=0; i<einzelAngabe.length; i++){           //die Angaben werden in die jeweiligen Arrays "gepackt"
                switch (teile) {
                    case 0:
                        //sobald Problem geöst können die Verzweigungen in switch umgewandelt werden können
                        EA.add(einzelAngabe[i]);
                        break;
                        
                    case 1:
                        Z.add(einzelAngabe[i]);
                        break;
                        
                    case 2:
                        BA.add(einzelAngabe[i]);
                        break;
                        
                   case 3:
                      break;
                        
                    case 4:
                        AZ.add(einzelAngabe[i]);
                        break;
                        
                    case 5:
                        BZ.add(einzelAngabe[i]);
                        break;
                        
                    case 6:
                        EZ.add(einzelAngabe[i]);
                        break; 
                        
                    default:
                        System.out.println("FEHLER!!!!!!!!");
                        break;
                }
            }
        }
        
    }
    
    public void wortUeberpruefen(String eingabewort, turingband.Turingband t){
        boolean x = true;
        for (int i=0; i<eingabewort.length(); i++){
            boolean y = false;
            for(int z=0; z<EA.size(); z++){
                if(eingabewort.charAt(i) == EA.get(z).charAt(0) ){
                    y = true;
                    t.zeichenHinzufuegen(String.valueOf(eingabewort.charAt(i)));
                }
            }
            if(y == false){
                x = false;
            }
        }
        if(x == true){
            eingabePositiv = true;   
        }
    }

}
