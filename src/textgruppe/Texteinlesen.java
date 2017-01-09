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
    private static String tupelGanz;
    private static String[] tupelTeile;
    public static ArrayList<String> EA;   //Eingabealphabet
    public static ArrayList<String> Z;    //Zustandsmenge
    public static ArrayList<String> BA;   //Bandalphabet
    public static ArrayList<String> UF;   //partielle Überführungsfunktion
    public static ArrayList<String> AZ;   //Anfangszustand
    public static ArrayList<String> BZ;   //Bandvorbelegungszeichen
    public static ArrayList<String> EZ;   //Menge der Endzustände
    public static ArrayList<String> EW;   //Eingabewort
    
    public Texteinlesen(){
        EA = new ArrayList();
        Z = new ArrayList();
        BA = new ArrayList();
        UF = new ArrayList();
        AZ = new ArrayList();
        BZ = new ArrayList();
        EZ = new ArrayList();
        EW = new ArrayList();
    }
    
    public static void dateiEinlesen(String dateipfad) throws IOException{
        
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
    
    public static void angabenInArraySpeichern(){
        tupelTeile = tupelGanz.split("/.../");    //tupelTeile ist ein Array in dem der ganze Tupel steht, aber die Angaben in jeweils einem Feld sind(Die 7 angaben sind noch nicht weiter unterteilt)
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
                        UF.add(einzelAngabe[i]);
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
    
    public boolean wortUeberpruefen(String eingabewort){
        boolean x = false;
        for (int i=0; i<eingabewort.length(); i++){
            for(int z=0; z<EA.size(); z++){
                if(eingabewort.charAt(i) == EA.get(z).charAt(0) ){
                    x = true;
                    EW.add(String.valueOf(eingabewort.charAt(i)));
                    break;
                }
            }
            if(x == false){
                System.out.println("Das Wort und das Eingabealphabet stimmen nicht überein.");
            }
        }
        return x;
    }

public static void main(String[] args) throws IOException{
    Texteinlesen texteinlesen = new Texteinlesen();
    texteinlesen.dateiEinlesen("C:\\Users\\jonathan.brandt\\Desktop\\test.txt");    //muss mit korrektem Dateipfad übergeben werden
    texteinlesen.angabenInArraySpeichern();
    System.out.println(EA);
    System.out.println(Z);
    System.out.println(BA);
    System.out.println(UF);
    System.out.println(AZ);
    System.out.println(BZ);
    System.out.println(EZ);
    texteinlesen.wortUeberpruefen("abce");
}
}
