/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.UUID;
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
public class AdapterAluguelTest {
    
    public AdapterAluguel a;
    
    public AdapterAluguelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        a = new AdapterAluguel();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gerarPassagem method, of class AdapterAluguel.
     */
    @Test
    public void testGerarPassagem() {
        System.out.println("gerarPassagem");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
      
        Passagem expResult = null;
        Passagem result = a.gerarPassagem(empresa, destino, nome, cpf);
        assertNotEquals(expResult, result);
    }

    
    @Test
    public void testCalcularPreco() {
        int empresa = 1;
        
        a.calcularPreco(1, empresa);
        assertTrue(a.getPreco()==222f);
        /*a.calcularPreco(2, empresa);
        assertTrue(a.getPreco()==0);
        a.calcularPreco(3, empresa);
        assertTrue(a.getPreco()==0);
        
        empresa = 2;
        
        a.calcularPreco(1, empresa);
        assertTrue(a.getPreco()==0);
        a.calcularPreco(2, empresa);
        assertTrue(a.getPreco()==0);
        a.calcularPreco(3, empresa);
        assertTrue(a.getPreco()==0);*/
    }

    /**
     * Test of calcularDistancia method, of class AdapterAluguel.
     */
    @Test
    public void testCalcularDistancia() {
        System.out.println("calcularDistancia");
        int destino = 0;
        AdapterAluguel instance = new AdapterAluguel();
        instance.calcularDistancia(destino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTempo method, of class AdapterAluguel.
     */
    @Test
    public void testCalcularTempo() {
        System.out.println("calcularTempo");
        int destino = 0;
        AdapterAluguel instance = new AdapterAluguel();
        instance.calcularTempo(destino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarId method, of class AdapterAluguel.
     */
    @Test
    public void testGerarId() {
        System.out.println("gerarId");
        AdapterAluguel instance = new AdapterAluguel();
        UUID expResult = null;
        UUID result = instance.gerarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class AdapterAluguel.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        AdapterAluguel instance = new AdapterAluguel();
        UUID expResult = null;
        UUID result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class AdapterAluguel.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        AdapterAluguel instance = new AdapterAluguel();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class AdapterAluguel.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        AdapterAluguel instance = new AdapterAluguel();
        int expResult = 0;
        int result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempo method, of class AdapterAluguel.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        AdapterAluguel instance = new AdapterAluguel();
        int expResult = 0;
        int result = instance.getTempo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistancia method, of class AdapterAluguel.
     */
    @Test
    public void testGetDistancia() {
        System.out.println("getDistancia");
        AdapterAluguel instance = new AdapterAluguel();
        float expResult = 0.0F;
        float result = instance.getDistancia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreco method, of class AdapterAluguel.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        AdapterAluguel instance = new AdapterAluguel();
        float expResult = 0.0F;
        float result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
