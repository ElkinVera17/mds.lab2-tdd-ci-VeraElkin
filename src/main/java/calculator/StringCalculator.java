/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author USUARIO
 */
public class StringCalculator {
    public int add(String numbers) {
        // Iteración 1: cadena vacía devuelve 0
        if (numbers.isEmpty()) {
            return 0;
        }
        // Iteración 2: un solo número
        return Integer.parseInt(numbers);
    }
}
