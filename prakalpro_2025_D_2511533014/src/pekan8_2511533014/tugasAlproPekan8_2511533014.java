package pekan8_2511533014;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class OperatorLogikaGUI_2511533014 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    OperatorLogikaGUI_2511533014 frame = new OperatorLogikaGUI_2511533014();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public OperatorLogikaGUI_2511533014() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("OPERATOR LOGIKA");
        lblNewLabel.setBounds(180, 11, 150, 27);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nilai A");
        lblNewLabel_1.setBounds(10, 54, 48, 14);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Nilai B");
        lblNewLabel_2.setBounds(10, 92, 48, 14);
        contentPane.add(lblNewLabel_2);

        // ComboBox A
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
        comboBox.setBounds(72, 50, 60, 22);
        contentPane.add(comboBox);

        // ComboBox B
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"True", "False"}));
        comboBox_1.setBounds(72, 88, 60, 22);
        contentPane.add(comboBox_1);

        // Tombol AND
        JButton btnNewButton = new JButton("AND");
        btnNewButton.setBounds(20, 150, 80, 23);
        contentPane.add(btnNewButton);

        // Tombol OR
        JButton btnNewButton_1 = new JButton("OR");
        btnNewButton_1.setBounds(110, 150, 80, 23);
        contentPane.add(btnNewButton_1);

        // Tombol XOR
        JButton btnNewButton_2 = new JButton("XOR");
        btnNewButton_2.setBounds(200, 150, 80, 23);
        contentPane.add(btnNewButton_2);

        // Tombol NOT A
        JButton btnNewButton_3 = new JButton("NOT A");
        btnNewButton_3.setBounds(290, 150, 80, 23);
        contentPane.add(btnNewButton_3);

        // Tombol NOT B
        JButton btnNewButton_4 = new JButton("NOT B");
        btnNewButton_4.setBounds(380, 150, 80, 23);
        contentPane.add(btnNewButton_4);

        JLabel lblNewLabel_3 = new JLabel("Hasil");
        lblNewLabel_3.setBounds(10, 200, 48, 14);
        contentPane.add(lblNewLabel_3);

        textField = new JTextField();
        textField.setBounds(72, 197, 120, 20);
        textField.setEditable(false);
        contentPane.add(textField);
        textField.setColumns(10);

        // ============================
        //  EVENT HANDLER LOGIKA
        // ============================

        // AND
        btnNewButton.addActionListener(e -> {
            boolean A = Boolean.parseBoolean(comboBox.getSelectedItem().toString());
            boolean B = Boolean.parseBoolean(comboBox_1.getSelectedItem().toString());
            boolean hasil = A && B;
            textField.setText(String.valueOf(hasil));
        });

        // OR
        btnNewButton_1.addActionListener(e -> {
            boolean A = Boolean.parseBoolean(comboBox.getSelectedItem().toString());
            boolean B = Boolean.parseBoolean(comboBox_1.getSelectedItem().toString());
            boolean hasil = A || B;
            textField.setText(String.valueOf(hasil));
        });

        // XOR
        btnNewButton_2.addActionListener(e -> {
            boolean A = Boolean.parseBoolean(comboBox.getSelectedItem().toString());
            boolean B = Boolean.parseBoolean(comboBox_1.getSelectedItem().toString());
            boolean hasil = A ^ B;
            textField.setText(String.valueOf(hasil));
        });

        // NOT A
        btnNewButton_3.addActionListener(e -> {
            boolean A = Boolean.parseBoolean(comboBox.getSelectedItem().toString());
            boolean hasil = !A;
            textField.setText(String.valueOf(hasil));
        });

        // NOT B
        btnNewButton_4.addActionListener(e -> {
            boolean B = Boolean.parseBoolean(comboBox_1.getSelectedItem().toString());
            boolean hasil = !B;
            textField.setText(String.valueOf(hasil));
        });
    }
}
