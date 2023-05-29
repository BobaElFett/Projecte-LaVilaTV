import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.setProperty("flatlaf.uiScale", "1.5");
        FlatOneDarkIJTheme.setup();

        JDialog addContent = new JDialog();
        addContent.setContentPane(new AddContent().getContentPane());

    }
}