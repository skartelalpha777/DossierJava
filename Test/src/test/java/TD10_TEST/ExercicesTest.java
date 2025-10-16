/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TD10_TEST;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author diall
 */
public class ExercicesTest {

    public ExercicesTest() {
    }

    /**
     * Test of Palindrom method, of class Exercices.
     */
    @org.junit.jupiter.api.Test
    public void testPalindrom() {
        System.out.println("Palindrom");
        String mot = "radar";
        boolean expResult = true;
        boolean result = Exercices.Palindrom(mot);
        //assertEquals(expResult, result);
        assertTrue(result);

    }

    /**
     * Test of Palindrom method, of class Exercices.
     */
    @org.junit.jupiter.api.Test
    public void testPalindrom_b() {

        String mot = "beta";
        boolean expResult = false;
        boolean result = Exercices.Palindrom(mot);
        assertEquals(expResult, result);

    }

    /**
     * Test of Palindrom method, of class Exercices.
     */
    @org.junit.jupiter.api.Test
    public void testPalindrom_IAexception() {

        assertThrows(IllegalArgumentException.class, () -> Exercices.Palindrom("A"));

    }

}
