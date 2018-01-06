package password_generator;

import javax.swing.JFrame;

/**
 * The Main class for Password Generator
 * @author Enkhamgalan Baterdene
 * @version 1.2
 * @date 01/05/2018
 */
public class Password_Generator {
    public static void main(String[] args) {
        MyInterface myI = new MyInterface();
        myI.setVisible(true);
        myI.setResizable(false);
        myI.setTitle("Password Generator");
        myI.setLocationRelativeTo(null);
        myI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
