/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgruppe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import turingband.Turingband;

/**
 *
 * @author K
 */
public class TexteinlesenTest {
    
    public TexteinlesenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dateiEinlesen method, of class Texteinlesen.
     */
    @Test
    public void testDateiEinlesen() throws Exception {
        System.out.println("dateiEinlesen");
        String dateipfad = "";
        Texteinlesen instance = new Texteinlesen();
        instance.dateiEinlesen(dateipfad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of angabenInArraySpeichern method, of class Texteinlesen.
     */
    @Test
    public void testAngabenInArraySpeichern() {
        System.out.println("angabenInArraySpeichern");
        Texteinlesen instance = new Texteinlesen();
        instance.angabenInArraySpeichern();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wortUeberpruefen method, of class Texteinlesen.
     */
    @Test
    public void testWortUeberpruefen() {
        System.out.println("wortUeberpruefen");
        String eingabewort = "";
        Turingband t = null;
        Texteinlesen instance = new Texteinlesen();
        instance.wortUeberpruefen(eingabewort, t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
