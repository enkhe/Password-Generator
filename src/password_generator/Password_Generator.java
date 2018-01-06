package password_generator;

import javax.swing.JFrame;

public class Password_Generator {

    public static void main(String[] args) {
        //System.out.println("" + new Password());
        MyInterface myI = new MyInterface();
        myI.setVisible(true);
        myI.setResizable(false);
        myI.setTitle("Password Generator");
        myI.setLocationRelativeTo(null);
        myI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
