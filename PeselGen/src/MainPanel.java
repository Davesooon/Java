import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPanel implements ActionListener {
    private JFrame Frame;
    private JPanel MainForm;
    private JButton btn_Gen;
    private JTextField tb_Day;
    private JTextField tb_Month;
    private JTextField tb_Year;
    private JComboBox cmb_Gender;

    public MainPanel()
    {
        Frame = new JFrame();

        tb_Day = new JTextField();
        tb_Month = new JTextField();
        tb_Year = new JTextField();
        cmb_Gender = new JComboBox();

        JButton btn_Gen = new JButton();
        btn_Gen.addActionListener(this);

        MainForm = new JPanel();
        MainForm.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        MainForm.setLayout(new GridLayout(0, 1));
        MainForm.add(btn_Gen);

        Frame.add(MainForm, BorderLayout.CENTER);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setTitle("Generator Pesel");
        Frame.pack();
        Frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new MainPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
