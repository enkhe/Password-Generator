package password_generator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

/**
 * Model class for Password Generator
 * @author Enkhamgalan Baterdene
 * @version 1.2
 * @date 01/05/2018
 */
public class Password {
    private HashMap<String, String> MAP;
    private LinkedList<String> TYPES;
    private String PASS;

    /**
     * Generates default password with 16 char length.
     */
    public Password() {
        init();
        PASS = getPass(16, TYPES);
    }

    /**
     * Generates password.
     * @param len The Length of the password.
     * @param at  Allowed Types of characters
     */
    public Password(int len, LinkedList<String> at) {
        this();
        PASS = getPass(len, at);
    }

    /**
     * Get Password.
     * @param len The Length of the password.
     * @param at  Allowed Types of characters
     * @return password.
     */
    private String getPass(int len, LinkedList<String> at) {
        char[] chr = new char[len];
        if (at.size() == 0) at = TYPES;
        while (len > 0) {
            int ind = new Random().nextInt(at.size());
            chr[--len] = gRC(MAP.get(at.get(ind)));
        }
        
        return String.valueOf(chr);
    }

    /**
     * Get Random Characters from a text input.
     * @param in is a text.
     * @return a character.
     */
    private char gRC(String in) {
        return in.charAt(new Random().nextInt(in.length()));
    }

    /**
     * Initializing the fields.
     */
    private void init() {
        MAP = new HashMap<>();
        TYPES = new LinkedList<String>();
        PASS = "";
        
        MAP.put("SYMBOLS", "!@#$%^&*()_+");
        MAP.put("NUMBERS", "1234567890");
        MAP.put("LOWERCASE", "abcdefghijklmnopqrstuvwxyz");
        MAP.put("UPPERCASE", "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        MAP.put("AMBIGIOUS", "({}[]()/\\'\"`~,;:.<>)");
        
        TYPES = new LinkedList<String>(MAP.keySet());
    }

    /**
     * @return the Password.
     */
    @Override
    public String toString() {
        return PASS;
    }
}
