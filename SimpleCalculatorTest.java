/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.testing_project;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mena
 */
public class SimpleCalculatorTest {
    
    public SimpleCalculatorTest() {
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
     * Test of add method, of class SimpleCalculator.
     */
    @Test
    public void testAddOneAndTwo() {
        System.out.println("add");
        int num1 = 1;
        int num2 = 2;
        SimpleCalculator instance = new SimpleCalculator();
        int expResult = 3;
        int result = instance.add(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
        //fail("addition method failed.");
    }

    /**
     * Test of subtract method, of class SimpleCalculator.
     */
    @Test
    public void testSubtractFiveAndOne() {
        System.out.println("substract");
        int num1 = 5;
        int num2 = 1;
        SimpleCalculator instance = new SimpleCalculator();
        int expResult = 4;
        int result = instance.subtract(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
        //fail("subtraction method failed.");
    }

    /**
     * Test of multiply method, of class SimpleCalculator.
     */
    @Test
    public void testMultiplySevenAndSix() {
        System.out.println("multiply");
        int num1 = 7;
        int num2 = 6;
        SimpleCalculator instance = new SimpleCalculator();
        int expResult = 42;
        int result = instance.multiply(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
        //fail("multiplying method failed.");
    }

    /**
     * Test of divide method, of class SimpleCalculator.
     */
    @Test
    public void testDivideEightAndFour() {
        System.out.println("divide");
        int num1 = 8;
        int num2 = 2;
        SimpleCalculator instance = new SimpleCalculator();
        int expResult = 4;
        int result = instance.divide(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
        //fail("dividing method failed.");
    }
    
}
