/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package computemethods.java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mehra
 */
public class ComputeMethodsJavaTest {
    
    public ComputeMethodsJavaTest() {
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
     * Test of fToC method, of class ComputeMethodsJava.
     */
    @Test
    public void testFToC() {
        System.out.println("fToC");
        double degreesF = 0.0;
        ComputeMethodsJava instance = new ComputeMethodsJava();
        double expResult = 0.0;
        double result = instance.fToC(degreesF);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hypotenuse method, of class ComputeMethodsJava.
     */
    @Test
    public void testHypotenuse() {
        System.out.println("hypotenuse");
        int a = 0;
        int b = 0;
        ComputeMethodsJava instance = new ComputeMethodsJava();
        double expResult = 0.0;
        double result = instance.hypotenuse(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of roll method, of class ComputeMethodsJava.
     */
    @Test
    public void testRoll() {
        System.out.println("roll");
        ComputeMethodsJava instance = new ComputeMethodsJava();
        int expResult = 0;
        int result = instance.roll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
