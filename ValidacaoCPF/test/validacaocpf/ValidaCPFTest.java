/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacaocpf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SESI_SENAI
 */
public class ValidaCPFTest {
    
    public ValidaCPFTest() {
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
     * Test of isCPF method, of class ValidaCPF.
     */
    @Test
    public void testIsCPFfalse() {
        System.out.println("isCPF false");
        String CPF = "99999999921";
        boolean expResult = false;
        boolean result = ValidaCPF.isCPF(CPF);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsCPFtrue() {
        System.out.println("isCPF true");
        String CPF = "34485861023";
        boolean expResult = true;
        boolean result = ValidaCPF.isCPF(CPF);
        assertEquals(expResult, result);
    }

    /**
     * Test of imprimeCPF method, of class ValidaCPF.
     */
    @Test
    public void testImprimeCPF() {
        System.out.println("imprimeCPF");
        String CPF = "99999999999";
        String expResult = "999.999.999-99";
        String result = ValidaCPF.imprimeCPF(CPF);
        assertEquals(expResult, result);
    }
    
}
