/*
 * Tarea para DI08.
 * - probar cada método de la clase con JUnit.
 */

package calculadora;

/**
 *
 * @author Juan A. García Muelas <juangmuelas@gmail.com>
 * @version 1
 * @since 08/04/22
 */
public class Calculando {

    public double add(double number1, double number2){
    return number1 + number2; 
    } 
    
    public double subtract(double number1, double number2){ 
    return number1 - number2; 
    } 
    
    public double multiply(double number1, double number2) { 
    return number1 * number2; 
    } 

    public double divide(double number1, double number2){ 
    return number1 / number2; }
    
    //para prueba de regresión complementaria
    public double resto(double number1, double number2){ 
    return number1 % number2; }
    
}

