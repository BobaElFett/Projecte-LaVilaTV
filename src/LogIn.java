import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;

import javax.swing.*;

public class LogIn {
    public static void main(String[] args) {
        System.setProperty("flatlaf.uiScale" , "1.5");
        FlatOneDarkIJTheme.setup();

        JDialog logIn = new JDialog();
        logIn.setContentPane(new LogInDialog().getBase());
        logIn.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        logIn.pack();
        logIn.setLocationRelativeTo(null);
        logIn.setVisible(true);
    }
}