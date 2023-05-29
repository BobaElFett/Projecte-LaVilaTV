import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddEmployee {
    private JPanel addEmployee;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField emailField;
    private JTextField userField;
    private JTextField passwordField;
    private JButton addButton;
    private JComboBox departementComboBox;
    private JTextField directionField;
    private JPanel MainPanel;
    private JTextField firstNameField;
    private JTextField birthDateField;
    private JTextField hiringDateField;
    private JComboBox departmentComboBox;
    private JTextField hiringDateFiled;

    public AddEmployee() {
    }

    public static void main(String[] args) {
        System.setProperty("flatlaf.uiScale", "1.5");
        FlatOneDarkIJTheme.setup();
        JFrame frame = new JFrame();
        frame.setContentPane((new AddEmployee()).addEmployee);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setVisible(true);
    }
}
