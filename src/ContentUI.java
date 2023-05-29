import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ContentUI {
    private JPanel panel1;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public JPanel getPanel1() {
        return panel1;
    }

    public ContentUI() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[] {"Código", "Nombre", "Apellidos", "Fecha Nac.", "Email", "Usuario",
                "Contraseña", "Departamento"});

        model.addRow(new Object[]{"0001", "Serena", "Berg","2003-11-02","serenaberg@vilatv.com","serenaberg","1234",9,
                "0002", "Cain", "Simpson","2014-12-13","cainsimpson4730@vilatv.com","cainsimpson","1234",2});
        table1.setModel(model);
        table1.getColumnModel().getColumn(0).setPreferredWidth(200);
        table1.getColumnModel().getColumn(1).setPreferredWidth(200);
        table1.getColumnModel().getColumn(2).setPreferredWidth(200);
        table1.getColumnModel().getColumn(3).setPreferredWidth(200);
        table1.getColumnModel().getColumn(4).setPreferredWidth(90);
        table1.getColumnModel().getColumn(6).setPreferredWidth(120);
        table1.getColumnModel().getColumn(7).setPreferredWidth(120);

    }
}
