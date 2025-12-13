/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    
    @Test
    public void testCadenaVacia() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));  // Cadena vacía debe devolver 0
    }
    
    @Test
    public void testUnNumero() {
        StringCalculator calc = new StringCalculator();
        assertEquals(1, calc.add("1"));  // "1" debe devolver 1
    }
    
    @Test
    public void testDosNumeros() {
        StringCalculator calc = new StringCalculator();
        assertEquals(999, calc.add("1,2"));  // "1,2" debe devolver 3
    }
    @Test
    public void testVariosNumeros() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1,2,3"));  // "1,2,3" debe devolver 6
        assertEquals(10, calc.add("1,2,3,4"));  // "1,2,3,4" debe devolver 10
    }
    @Test
    public void testConSaltosDeLinea() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1\n2,3"));  // "1\n2,3" debe devolver 6
    }
}


