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
    static String tupelGanz;
    static String[] tupelTeile;
    static ArrayList<String> EA;   //Eingabealphabet
    static ArrayList<String> Z;    //Zustandsmenge
    static ArrayList<String> BA;   //Bandalphabet
    static ArrayList<String> UF;    //partielle Überführungsfunktion
    static ArrayList<String> AZ;   //Anfangszustand
    static ArrayList<String> BZ;   //Bandvorbelegungszeichen
    static ArrayList<String> EZ;   //Menge der Endzustände
    
    public Texteinlesen(){
        EA = new ArrayList();
        Z = new ArrayList();
        BA = new ArrayList();
        UF = new ArrayList();
        AZ = new ArrayList();
        BZ = new ArrayList();
        EZ = new ArrayList();
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
                if(teile==0){                                    //sobald Problem geöst können die Verzweigungen in switch umgewandelt werden können                 
                    EA.add(einzelAngabe[i]);
                } 
                else if(teile==1){
                    Z.add(einzelAngabe[i]);
                }
                else if(teile==2){
                    BA.add(einzelAngabe[i]);
                }
                else if(teile==3){
                    UF.add(einzelAngabe[i]);
                }
                else if(teile==4){
                     AZ.add(einzelAngabe[i]);
                }
                else if(teile==5){
                    BZ.add(einzelAngabe[i]);
                }
                else if(teile==6){
                     EZ.add(einzelAngabe[i]);
                }
                else{
                    System.out.println("FEHLER!!!!!!!!");    
                }
            }
        }
    }

public static void main(String[] args) throws IOException{
    Texteinlesen texteinlesen = new Texteinlesen();
    texteinlesen.dateiEinlesen("C:\\Users\\Jonathan\\Desktop\\test.txt");    //muss mit korrektem Dateipfad übergeben werden
    texteinlesen.angabenInArraySpeichern();
    System.out.println(EA);
    System.out.println(Z);
    System.out.println(BA);
    System.out.println(UF);
    System.out.println(AZ);
    System.out.println(BZ);
    System.out.println(EZ);
}
}
