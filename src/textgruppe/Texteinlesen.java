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
    
    public static void tupelTeilen(){
        if(tupelGanz != null) {
            String[] einzelneAngaben = tupelGanz.split("/.../"); //einzelneAngaben ist nur local
        }
    }
    
    public static void inEinzelangabenTeilen(){
    }

//public static void main(String[] args) throws IOException{
//    dateiEinlesen("C:\\Users\\jonathan.brandt\\Desktop\\TEST.txt");
//}
}
