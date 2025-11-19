package pekan8_2511533014;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533014 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAngka1;
	private JTextField textAngka2;
	private JTextField textHasil;

	/**
	 * Launch the application.
	 */
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Kesalahan",JOptionPane.ERROR_MESSAGE);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533014 frame = new OperatorAritmatikaGUI_2511533014();
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
	public OperatorAritmatikaGUI_2511533014() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(100, 48, 49, 0);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Angka 1");
		lblNewLabel_1.setBounds(10, 64, 49, 14);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setBounds(169, 11, 127, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Angka 2");
		lblNewLabel_3.setBounds(10, 86, 48, 46);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Operator");
		lblNewLabel_4.setBounds(10, 143, 48, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Hasil");
		lblNewLabel_5.setBounds(11, 193, 48, 14);
		contentPane.add(lblNewLabel_5);
		
		textAngka1 = new JTextField();
		textAngka1.setBounds(69, 61, 96, 20);
		contentPane.add(textAngka1);
		textAngka1.setColumns(10);
		
		textAngka2 = new JTextField();
		textAngka2.setBounds(68, 99, 96, 20);
		contentPane.add(textAngka2);
		textAngka2.setColumns(10);
		
		textHasil = new JTextField();
		textHasil.setBounds(69, 190, 96, 20);
		contentPane.add(textHasil);
		textHasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(78, 139, 40, 22);
		contentPane.add(cbOperator);
		
		JButton Hitung = new JButton("Hitung");
		Hitung.addActionListener(new ActionListener() {
					int hasil;
			public void actionPerformed(ActionEvent e) {
				if(textAngka1.getText().trim().isEmpty()) {
					pesanPeringatan("inputkan angka 1");
				} else if (textAngka2.getText().trim().isEmpty()) {
					pesanPeringatan("inputkan angka 2");
				} else {
					try {
						int a = Integer.valueOf(textAngka1.getText());
						int b = Integer.valueOf(textAngka2.getText());
						int c = cbOperator.getSelectedIndex();
						if(c == 0) hasil = a + b;
						if(c == 1) hasil = a - b;
						if(c == 2) hasil = a * b;
						if(c == 3) hasil = a / b;
						if(c == 4) hasil = a % b;
						textHasil.setText(String.valueOf(hasil));
					} catch (NumberFormatException ex){
						pesanError("Angka 1 dan Angka 2 tidak valid");
					}
					
				
				}
			}
		});
		Hitung.setHorizontalAlignment(SwingConstants.RIGHT);
		Hitung.setBounds(169, 139, 94, 22);
		contentPane.add(Hitung);
		
		

	}
		}
