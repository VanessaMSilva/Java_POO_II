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
public class PassagemOnibusTest {
    
    private PassagemOnibus o;
    
    public PassagemOnibusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        o = new PassagemOnibus();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gerarPassagem method, of class PassagemOnibus.
     */
    @Test
    public void testGerarPassagem() {
        System.out.println("gerarPassagem");
        
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
        
        PassagemOnibus expResult = null;
        PassagemOnibus result = o.gerarPassagem(empresa, destino, nome, cpf);
        
        assertNotEquals(expResult, result);
    }

    /**
     * Test of calcularTempo method, of class PassagemOnibus.
     */
    @Test
    public void testCalcularTempo() {
        System.out.println("calcularTempo");
     
        o.calcularTempo(1);
        assertTrue(o.getTempo()==5);
        o.calcularTempo(2);
        assertTrue(o.getTempo()==52);
        o.calcularTempo(3);
        assertTrue(o.getTempo()==24);
    }

    /**
     * Test of calcularPreco method, of class PassagemOnibus.
     */
    @Test
    public void testCalcularPreco() {
        System.out.println("calcularPreco");
        int destino = 0;
        int empresa = 0;
        PassagemOnibus instance = new PassagemOnibus();
        instance.calcularPreco(destino, empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDistancia method, of class PassagemOnibus.
     */
    @Test
    public void testCalcularDistancia() {
        System.out.println("calcularDistancia");
        int destino = 0;
        PassagemOnibus instance = new PassagemOnibus();
        instance.calcularDistancia(destino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassagem method, of class PassagemOnibus.
     */
    @Test
    public void testGetPassagem() {
        System.out.println("getPassagem");
        PassagemOnibus instance = new PassagemOnibus();
        PassagemOnibus expResult = null;
        PassagemOnibus result = instance.getPassagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarId method, of class PassagemOnibus.
     */
    @Test
    public void testGerarId() {
        System.out.println("gerarId");
        PassagemOnibus instance = new PassagemOnibus();
        UUID expResult = null;
        UUID result = instance.gerarId();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PassagemOnibus.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PassagemOnibus instance = new PassagemOnibus();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreco method, of class PassagemOnibus.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        PassagemOnibus instance = new PassagemOnibus();
        float expResult = 0.0F;
        float result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistancia method, of class PassagemOnibus.
     */
    @Test
    public void testGetDistancia() {
        System.out.println("getDistancia");
        PassagemOnibus instance = new PassagemOnibus();
        float expResult = 0.0F;
        float result = instance.getDistancia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempo method, of class PassagemOnibus.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        PassagemOnibus instance = new PassagemOnibus();
        int expResult = 0;
        int result = instance.getTempo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class PassagemOnibus.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        PassagemOnibus instance = new PassagemOnibus();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class PassagemOnibus.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        PassagemOnibus instance = new PassagemOnibus();
        int expResult = 0;
        int result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class PassagemOnibus.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PassagemOnibus instance = new PassagemOnibus();
        UUID expResult = null;
        UUID result = instance.getId();
        
        assertEquals(expResult, result);
    }


    
}
