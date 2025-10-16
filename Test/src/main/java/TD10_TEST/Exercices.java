/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TD10_TEST;

/**
 *
 * @author diall
 */
public class Exercices {

    public static void main(String[] args) {
        System.out.println(Palindrom("levela"));
    }

    public static boolean Palindrom(String mot) {

        int i = 0;
        int j = mot.length() - 1;
        while (i < mot.length() / 2) {
            if (mot.charAt(i) != mot.charAt(j)) {
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
}
