/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number1 = 3.0;
        double number2 = 1.0;
        Calculando integracion = new Calculando();
        testIntegracion(number1, number2,integracion);
        Calculando regresion = new Calculando();
        testRegresion(number1, number2, regresion);
        Main main = new Main();
        main.testCapacidad();

    }//fin main
    
    public double testIntegracion(){
        System.out.println("Ejecutada integración");
        return 0;       
    }//fin testIntegracion
    
    public static void testIntegracion(Double number1, Double number2, Calculando integracion){
        Double add = integracion.add(number1,number2);
        System.out.println("Test add = " + add);
        Double substract = integracion.subtract(number1,number2);
        System.out.println("Test add = " + substract);
        Double multiply = integracion.multiply(number1,number2);
        System.out.println("Test add = " + multiply);
        Double divide = integracion.divide(number1,number2);
        System.out.println("Test add = " + divide);
        
    }//fin testIntegracion
    
    
    public double testRecuperacionString(String number1, String number2)  throws IllegalArgumentException {

       if (number1 == null | number2 == null) {
            throw new IllegalArgumentException("Los números no pueden ser nulos");
        }

        if (number1.isEmpty() | number2.isEmpty()) {
            throw new IllegalArgumentException("Los números no pueden ser estar vacíos");
        }

        Calculando c = new Calculando();
        Double resultado = 0d;
        try {
            resultado = c.add(Double.valueOf(number1), Double.valueOf(number2));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Solo se admiten números");
        }
        return resultado;
    }
    
    
    public static void testRegresion(Double number1, Double number2, Calculando regresion){
        Double add = regresion.add(number1,number2);
        System.out.println("Test reg add = " + add);
        Double substract = regresion.subtract(number1,number2);
        System.out.println("Test reg substract = " + substract);
        Double multiply = regresion.multiply(number1,number2);
        System.out.println("Test reg multiply = " + multiply);
        Double divide = regresion.divide(number1,number2);
        System.out.println("Test reg divide = " + divide);
        Double resto = regresion.resto(number1,number2);
        System.out.println("Test reg resto = " + resto);
        
    }//fin testRegresion
    
    /**
     * Test capacidad.
     */
    public void testCapacidad(){
        double minimo = 0;
        double maximo = 10000;
        double minRandom = getRandomNumber(minimo, maximo);
        double maxRandom = getRandomNumber(minimo, maximo);
        
        Calculando capacidad = new Calculando();
        for (int i = 0; i < 200000; i++) {
            System.out.println("Prueba=> " + i);
            capacidad.add(minRandom, maxRandom);
            capacidad.subtract(minRandom, maxRandom);
            capacidad.multiply(minRandom, maxRandom);
            capacidad.divide(minRandom, maxRandom);
        }
    }//test capacidad

    private double getRandomNumber(double minimo, double maximo) {
        return ThreadLocalRandom.current().nextDouble(minimo, maximo +1);
    }
    
    
}//fin class main
