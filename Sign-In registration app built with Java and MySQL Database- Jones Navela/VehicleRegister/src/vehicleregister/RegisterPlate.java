/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleregister;
import java.util.Random;
/**
 *
 * @author Jones Navela
 */
public class RegisterPlate {
    static String[] INVALID_PLATE_LETTERS = { "AXE", "JAM", "FOR", "JUG", "JAW", "JAB", "ZIP", "ARE", "YOU" };
    
    static String generateLetters(int amount) {
        String letters = "";
        int n = 'Z' - 'A' + 1;
        for (int i = 0; i < amount; i++) {
            char c = (char) ('A' + Math.random() * n);
            letters += c;
        }
        return letters;
    }
    
    static String generateDigits(int amount) {
        String digits = "";
        int n = '9' - '0' + 1;
        for (int i = 0; i < amount; i++) {
            char c = (char) ('0' + Math.random() * n);
            digits += c;
        }
        return digits;
    }
    
    
    static String generateRegisterPlate() {
        String RegisterPlate;
        String letters;
        
        do {
            letters = generateLetters(3);
        } while (illegalWord(letters));
        
        String digits = generateDigits(3);
        
        RegisterPlate = letters + "-" + digits;
        return RegisterPlate;
    }
    
    private static boolean illegalWord(String letters) {
        for (int i = 0; i < INVALID_PLATE_LETTERS.length; i++) {
            if (letters.equals(INVALID_PLATE_LETTERS[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        
        System.out.println(generateRegisterPlate());
    }
}
