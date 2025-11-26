package pekan9_2511533014;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calkulator_2511533014 {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second; 
	double result;
	String operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calkulator_2511533014 window = new calkulator_2511533014();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calkulator_2511533014() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 275, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 212, 39);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setBounds(10, 90, 58, 39);
		btnBackspace.setFont(new Font("wingdings", Font.BOLD, 18));
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 129, 58, 39);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 166, 58, 39);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 203, 58, 39);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 241, 58, 39);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(65, 90, 58, 39);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnClear);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnPlus.setBounds(181, 90, 54, 39);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnPlus);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(65, 129, 58, 39);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(120, 129, 63, 39);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setBounds(181, 129, 54, 39);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnSub);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(65, 166, 58, 39);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(65, 203, 58, 39);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(65, 241, 58, 39);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
				
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDot);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(120, 166, 63, 39);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setBounds(181, 166, 54, 39);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnMul);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(120, 203, 63, 39);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setBounds(181, 203, 54, 39);
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f" , result);
					textField.setText(answer);			
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setBounds(120, 241, 63, 39);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnEqual);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setBounds(181, 241, 54, 39);
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnPercent);
		
		JButton btn00 = new JButton("00");
		btn00.setBounds(119, 90, 64, 39);
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
				
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn00);
	}
}
