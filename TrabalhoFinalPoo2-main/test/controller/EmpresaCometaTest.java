/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Passagem;
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
public class EmpresaCometaTest {
    
    public EmpresaCometaTest() {
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
     * Test of criarPassagemOnibus method, of class EmpresaCometa.
     */
    @Test
    public void testCriarPassagemOnibus() {
        System.out.println("criarPassagemOnibus");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
        EmpresaCometa instance = new EmpresaCometa();
        Passagem expResult = null;
        Passagem result = instance.criarPassagemOnibus(empresa, destino, nome, cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarPassagemAviao method, of class EmpresaCometa.
     */
    @Test
    public void testCriarPassagemAviao() {
        System.out.println("criarPassagemAviao");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
        EmpresaCometa instance = new EmpresaCometa();
        Passagem expResult = null;
        Passagem result = instance.criarPassagemAviao(empresa, destino, nome, cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarPassagemBarco method, of class EmpresaCometa.
     */
    @Test
    public void testCriarPassagemBarco() {
        System.out.println("criarPassagemBarco");
        int empresa = 0;
        int destino = 0;
        String nome = "";
        int cpf = 0;
        EmpresaCometa instance = new EmpresaCometa();
        Passagem expResult = null;
        Passagem result = instance.criarPassagemBarco(empresa, destino, nome, cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
