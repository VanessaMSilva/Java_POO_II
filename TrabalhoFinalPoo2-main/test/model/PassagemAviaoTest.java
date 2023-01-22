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

    @Test
    public void testCalcularTempo() {
        System.out.println("calcularTempo");
        
        a.calcularTempo(1);
        assertTrue(a.getTempo()==1);
        a.calcularTempo(2);
        assertTrue(a.getTempo()==8);
        a.calcularTempo(3);
        assertTrue(a.getTempo()==4);
    }

   
    @Test
    public void testCalcularPreco() {
        System.out.println("calcularPreco");
        int empresa = 1;
        
        a.calcularPreco(1, empresa);
        assertTrue(a.getPreco()==400);
        a.calcularPreco(2, empresa);
        assertTrue(a.getPreco()==1140);
        a.calcularPreco(3, empresa);
        assertTrue(a.getPreco()==928);
        
        empresa = 2;
        
        a.calcularPreco(1, empresa);
        assertTrue(a.getPreco()==256);
        a.calcularPreco(2, empresa);
        assertTrue(a.getPreco()==1300);
        a.calcularPreco(3, empresa);
        assertTrue(a.getPreco()==572);
    }

    /**
     * Test of calcularDistancia method, of class PassagemAviao.
     */
    @Test
    public void testCalcularDistancia() {
        System.out.println("calcularDistancia");
        a.calcularDistancia(1);
        assertTrue(a.getDistancia()==434);
        a.calcularDistancia(2);
        assertTrue(a.getDistancia()==2364);
        a.calcularDistancia(3);
        assertTrue(a.getDistancia()==1159);
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
