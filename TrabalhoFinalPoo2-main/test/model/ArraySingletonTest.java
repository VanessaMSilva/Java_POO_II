/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vanes
 */
public class ArraySingletonTest {
    
    public ArraySingletonTest() {
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
     * Test of getInstance method, of class ArraySingleton.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ArraySingleton expResult = null;
        ArraySingleton result = ArraySingleton.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArrayList method, of class ArraySingleton.
     */
    @Test
    public void testGetArrayList() {
        System.out.println("getArrayList");
        ArraySingleton instance = null;
        ArrayList<Passagem> expResult = null;
        ArrayList<Passagem> result = instance.getArrayList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
