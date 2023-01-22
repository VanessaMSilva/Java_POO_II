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
public class PassagemAviaoTest {
    
    private PassagemAviao a;
    public PassagemAviaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
          a = new PassagemAviao();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gerarPassagem method, of class PassagemAviao.
     */
    @Test
    public void testGerarPassagem() {
        
        System.out.println("gerarPassagem");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
        
    
        PassagemAviao expResult = null;
        PassagemAviao result = a.gerarPassagem(empresa, destino, nome, cpf);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of calcularTempo method, of class PassagemAviao.
     */
    @Test
    public void testCalcularTempo() {
        System.out.println("calcularTempo");
        int destino = 0;
        PassagemAviao instance = new PassagemAviao();
        instance.calcularTempo(destino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPreco method, of class PassagemAviao.
     */
    @Test
    public void testCalcularPreco() {
        System.out.println("calcularPreco");
        int empresa = 0;
        int destino = 0;
        PassagemAviao instance = new PassagemAviao();
        instance.calcularPreco(empresa, destino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDistancia method, of class PassagemAviao.
     */
    @Test
    public void testCalcularDistancia() {
        System.out.println("calcularDistancia");
        int destino = 0;
        PassagemAviao instance = new PassagemAviao();
        instance.calcularDistancia(destino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassagem method, of class PassagemAviao.
     */
    @Test
    public void testGetPassagem() {
        System.out.println("getPassagem");
        PassagemAviao instance = new PassagemAviao();
        PassagemAviao expResult = null;
        PassagemAviao result = instance.getPassagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarId method, of class PassagemAviao.
     */
    @Test
    public void testGerarId() {
        System.out.println("gerarId");
        PassagemAviao instance = new PassagemAviao();
        UUID expResult = null;
        UUID result = instance.gerarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PassagemAviao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PassagemAviao instance = new PassagemAviao();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreco method, of class PassagemAviao.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        PassagemAviao instance = new PassagemAviao();
        float expResult = 0.0F;
        float result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistancia method, of class PassagemAviao.
     */
    @Test
    public void testGetDistancia() {
        System.out.println("getDistancia");
        PassagemAviao instance = new PassagemAviao();
        float expResult = 0.0F;
        float result = instance.getDistancia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempo method, of class PassagemAviao.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        PassagemAviao instance = new PassagemAviao();
        int expResult = 0;
        int result = instance.getTempo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class PassagemAviao.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        PassagemAviao instance = new PassagemAviao();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class PassagemAviao.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        PassagemAviao instance = new PassagemAviao();
        int expResult = 0;
        int result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class PassagemAviao.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PassagemAviao instance = new PassagemAviao();
        UUID expResult = null;
        UUID result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
