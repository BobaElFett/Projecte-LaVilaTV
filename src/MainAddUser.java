import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;

import javax.swing.*;

public class MainAddUser {
    public static void main(String[] args) {
        System.setProperty("flatlaf.uiScale", "1.5");
        FlatOneDarkIJTheme.setup();

        JDialog addUser = new JDialog();
        addUser.setContentPane(new AddUser().getBase());
        addUser.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addUser.setSize(500, 720);
        addUser.setLocationRelativeTo(null);
        addUser.setVisible(true);
    }
}