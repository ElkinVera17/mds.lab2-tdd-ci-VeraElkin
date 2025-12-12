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
}


