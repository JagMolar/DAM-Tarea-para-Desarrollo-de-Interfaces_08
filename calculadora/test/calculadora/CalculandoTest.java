/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import junit.framework.TestCase;


/**
 *
 * @author Juan A. García Muelas <juangmuelas@gmail.com>
 */
public class CalculandoTest extends TestCase {
    
    public CalculandoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of add method, of class Calculando.
     */
    public void testAdd() {
        System.out.println("add");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);
        System.out.println("El resultado es:");
        System.out.println(result);
    }

    /**
     * Test of subtract method, of class Calculando.
     */
    public void testSubtract() {
        System.out.println("subtract");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);
        System.out.println("El resultado es:");
        System.out.println(result);
    }

    /**
     * Test of multiply method, of class Calculando.
     */
    public void testMultiply() {
        System.out.println("multiply");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 0.0);
        System.out.println("El resultado es:");
        System.out.println(result);
    }

    /**
     * Test of divide method, of class Calculando.
     */
    public void testDivide() {
        System.out.println("divide");
        double number1 = 3.0;
        double number2 = 1.0;
        Calculando instance = new Calculando();
        double expResult = 3.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);
        System.out.println("El resultado es:");
        System.out.println(result);
    }
    
    //para prueba de regresión complementaria
    public void testResto(){ 
    System.out.println("resto");
        double number1 = 3.0;
        double number2 = 1.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        double result = instance.resto(number1, number2);
        assertEquals(expResult, result, 0.0);
        System.out.println("El resultado es:");
        System.out.println(result);}
    
    
    /**
     * Test recuperacion.
     */
    public void testRecuperacionVacio() {
        Main main = new Main();
        assertEquals(2, main.testRecuperacionString("", String.valueOf(2)) , 0.0);
    }
    public void testRecuperacionNulo() {
        Main main = new Main();
        assertEquals(2, main.testRecuperacionString(null, String.valueOf(2)) , 0.0);
    }
  
     public void testRecuperacion() {
        Main main = new Main();
        assertEquals(2, main.testRecuperacionString("uno", String.valueOf(2)), 0.0);
    }
     
}
