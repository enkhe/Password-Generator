
package password_generator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Enkhamgalan Baterdene
 */
public class Password {
    private HashMap<String, String> MAP;
    private LinkedList<String> TYPES;
    private String PASS;

    public Password() {
        init();
        PASS = getPass(16, TYPES);
    }

    public Password(int len, LinkedList<String> at) {
        this();
        PASS = getPass(len, at);
    }

    private String getPass(int len, LinkedList<String> at) {
        char[] chr = new char[len];
        if (at.size() == 0) at = TYPES;
        while (len > 0) {
            int ind = new Random().nextInt(at.size());
            chr[--len] = gRC(MAP.get(at.get(ind)));
        }
        
        return String.valueOf(chr);
    }

    private char gRC(String in) { //Get Random Characters from the input.
        return in.charAt(new Random().nextInt(in.length()));
    }

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

    @Override
    public String toString() {
        return PASS;
    }
    
    
}
