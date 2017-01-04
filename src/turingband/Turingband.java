
package turingband;

import java.util.ArrayList;
import java.io.*;

public class Turingband 
{
    private ArrayList<String> zeichen;
    private String kellerzeichen= "#";
    private String eingabe;
    public Turingband tb = new Turingband();
    
    public static void main(String[] args)
    {

    }
            
    public Turingband()
    {
        zeichen = new ArrayList<String>();
        zeichen.add(kellerzeichen);
    }

    public void zeichenHinzufuegen(String eingabe)
    {        
        zeichen.add(eingabe);
    }

//    public void test(String eingabe)
//    {
//        String[] result = eingabe.split(eingabe);
//        for (int x=0; x<result.length; x++)
//            System.out.println(result[x]);
//    }
}

