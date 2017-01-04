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
    String tupelGanz;
    String[] pueTeile;
    String[] tupelTeile;
    ArrayList<String> EA;   //Eingabealphabet
    ArrayList<String> Z;    //Zustandsmenge
    ArrayList<String> BA;   //Bandalphabet
    ArrayList<String[]> UF;    //partielle Überführungsfunktion
    ArrayList<String> AZ;   //Anfangszustand
    ArrayList<String> BZ;   //Bandvorbelegungszeichen
    ArrayList<String> EZ;   //Menge der Endzustände
    
    public Texteinlesen(){
        EA = new ArrayList();
        Z = new ArrayList();
        BA = new ArrayList();
        UF = new ArrayList();
        AZ = new ArrayList();
        BZ = new ArrayList();
        EZ = new ArrayList();
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
    
    public void AngabenInFinalenArraySpeichern(){
        tupelTeile = tupelGanz.split("/.../");    //tupelTeile ist ein Array in dem der ganze Tupel steht, aber die Angaben in jeweils einem Feld sind(Die 7 angaben sind noch nicht weiter unterteilt)
        for(int teile=0; teile<8; teile++){                
            String[] einzelAngabe = tupelTeile[teile].split(",");//die Angaben werden in einzelteile Unterteilt
            for (int i=0; i<einzelAngabe.length; i++){           //die Angaben werden in die jeweiligen Arrays "gepackt"
                if(teile==0){                                    //sobald Problem geöst können die Verzweigungen in switch umgewandelt werden können
                    EZ.add(einzelAngabe[i]);
                } 
                else if(teile==1){
                    Z.add(einzelAngabe[i]);
                }
                else if(teile==2){
                    BA.add(einzelAngabe[i]);
                }
                else if(teile==4){
                    for (int b = 0; b<einzelAngabe.length; b++) {
                        pueTeile[b] = einzelAngabe[i];
                    }
                }
                else if(teile==5){
                     AZ.add(einzelAngabe[i]);
                }
                else if(teile==6){
                    BZ.add(einzelAngabe[i]);
                }
                else if(teile==7){
                     EZ.add(einzelAngabe[i]);
                }
                else{
                    System.out.println("FEHLER!!!!!!!!");    
                }
            }
        }
    }

//public static void main(String[] args) throws IOException{
//    dateiEinlesen("C:\\Users\\jonathan.brandt\\Desktop\\TEST.txt");
//}
}
