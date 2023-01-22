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
public class PassagemBarcoTest {
    
     private PassagemBarco b;
    
    public PassagemBarcoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
          b = new PassagemBarco();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gerarPassagem method, of class PassagemBarco.
     */
    @Test
    public void testGerarPassagem() {
        System.out.println("gerarPassagem");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
        
        PassagemBarco expResult = null;
        PassagemBarco result = b.gerarPassagem(empresa, destino, nome, cpf);
        
        assertNotEquals(expResult, result);
       
    }

    /**
     * Test of calcularTempo method, of class PassagemBarco.
     */
    @Test
    public void testCalcularTempo() {
        System.out.println("calcularTempo");
        
        b.calcularTempo(1);
        assertTrue(b.getTempo()==3);
        b.calcularTempo(2);
        assertTrue(b.getTempo()==30);
        b.calcularTempo(3);
        assertTrue(b.getTempo()==18);
    }

    /**
     * Test of calcularPreco method, of class PassagemBarco.
     */
    @Test
    public void testCalcularPreco() {
        System.out.println("calcularPreco");
        
        int empresa = 1;
        
        b.calcularPreco(1, empresa);
        assertTrue(b.getPreco()==632);
        b.calcularPreco(2, empresa);
        assertTrue(b.getPreco()==952);
        b.calcularPreco(3, empresa);
        assertTrue(b.getPreco()==789);
        
        empresa = 2;
        
        b.calcularPreco(1, empresa);
        assertTrue(b.getPreco()==963);
        b.calcularPreco(2, empresa);
        assertTrue(b.getPreco()==510);
        b.calcularPreco(3, empresa);
        assertTrue(b.getPreco()==999);
    }

    /**
     * Test of calcularDistancia method, of class PassagemBarco.
     */
    @Test
    public void testCalcularDistancia() {
        System.out.println("calcularDistancia");
        b.calcularDistancia(1);
        assertTrue(b.getDistancia()==600);
        b.calcularDistancia(2);
        assertTrue(b.getDistancia()==2600);
        b.calcularDistancia(3);
        assertTrue(b.getDistancia()==1400);
        b.calcularDistancia(1);
    }

    /**
     * Test of getPassagem method, of class PassagemBarco.
     */
    @Test
    public void testGetPassagem() {
        System.out.println("getPassagem");
      
    }

    /**
     * Test of gerarId method, of class PassagemBarco.
     */
    @Test
    public void testGerarId() {
        System.out.println("gerarId");
        PassagemBarco instance = new PassagemBarco();
        UUID expResult = null;
        UUID result = instance.gerarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PassagemBarco.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PassagemBarco instance = new PassagemBarco();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreco method, of class PassagemBarco.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        PassagemBarco instance = new PassagemBarco();
        float expResult = 0.0F;
        float result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistancia method, of class PassagemBarco.
     */
    @Test
    public void testGetDistancia() {
        System.out.println("getDistancia");
        PassagemBarco instance = new PassagemBarco();
        float expResult = 0.0F;
        float result = instance.getDistancia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempo method, of class PassagemBarco.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        PassagemBarco instance = new PassagemBarco();
        int expResult = 0;
        int result = instance.getTempo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class PassagemBarco.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        PassagemBarco instance = new PassagemBarco();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class PassagemBarco.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        PassagemBarco instance = new PassagemBarco();
        int expResult = 0;
        int result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class PassagemBarco.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PassagemBarco instance = new PassagemBarco();
        UUID expResult = null;
        UUID result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
