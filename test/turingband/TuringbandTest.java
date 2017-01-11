/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turingband;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author K
 */
public class TuringbandTest {
    
    public TuringbandTest() {
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
     * Test of zeichenHinzufuegen method, of class Turingband.
     */
    @Test
    public void testZeichenHinzufuegen() {
        System.out.println("zeichenHinzufuegen");
        String eingabe = "";
        Turingband instance = null;
        instance.zeichenHinzufuegen(eingabe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of schreibkopfBewegen method, of class Turingband.
     */
    @Test
    public void testSchreibkopfBewegen() {
        System.out.println("schreibkopfBewegen");
        String richtung = "";
        Turingband instance = null;
        instance.schreibkopfBewegen(richtung);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bandLesen method, of class Turingband.
     */
    @Test
    public void testBandLesen() {
        System.out.println("bandLesen");
        Turingband instance = null;
        String expResult = "";
        String result = instance.bandLesen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
