package Kalkulators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JFrame;

public class Projekt_Kalkulator {

	private JFrame frame;
	private JTextField textField;

	int width = 50;
	int height = 50;
	
	double firstnumber = 0.0;
	double secondnumber= 0.0;
	double result = 0.0;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Projekt_Kalkulator window = new Projekt_Kalkulator();
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
	public Projekt_Kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 320, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBounds(20, 10, 270, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		

		// Przyciski 
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + button1.getText();
				textField.setText(EnterNumber);
			}
		});
		button1.setBounds(40, 250, width, height);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + button2.getText();
				textField.setText(EnterNumber);
			}
		});
		button2.setBounds(100, 250, width, height);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + button3.getText();
				textField.setText(EnterNumber);
			}
		});
		button3.setBounds(160, 250, width, height);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + button4.getText();
				textField.setText(EnterNumber);
			}
		});
		button4.setBounds(40, 190, width, height);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + button5.getText();
				textField.setText(EnterNumber);
			}
		});
		button5.setBounds(100, 190, width, height);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				String EnterNumber = textField.getText() + button6.getText();
				textField.setText(EnterNumber);
			}
		});
		button6.setBounds(160, 190, width, height);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + button7.getText();
				textField.setText(EnterNumber);
			}
		});
		button7.setBounds(40, 130, width, height);
		frame.getContentPane().add(button7);

		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + button8.getText();
				textField.setText(EnterNumber);
			}
		});
		button8.setBounds(100, 130, width, height);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + button9.getText();
				textField.setText(EnterNumber);
			}
		}); 
		button9.setBounds(160, 130, width, height);
		frame.getContentPane().add(button9);

		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + button0.getText();
				textField.setText(EnterNumber);
			}
		});
		button0.setBounds(40, 310, width, height);
		frame.getContentPane().add(button0);
		
		JButton buttonPM = new JButton("+/-");
		buttonPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tmp = textField.getText();
				tmp = tmp.replace(',','.');
				textField.setText(tmp);
				
				double opposite = Double.parseDouble((textField.getText()));
				opposite = opposite * (-1);
				textField.setText(String.valueOf(opposite));
			}
		});
		buttonPM.setBounds(100, 310, width, height);
		frame.getContentPane().add(buttonPM);
		
		JButton buttonEQUAL = new JButton("=");
		buttonEQUAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnumber = Double.parseDouble(textField.getText());
				if(operations == "+")
				{
					result = firstnumber + secondnumber;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnumber - secondnumber;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "*")
				{
					result = firstnumber * secondnumber;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstnumber / secondnumber;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		buttonEQUAL.setBounds(160, 310, width, height);
		frame.getContentPane().add(buttonEQUAL);
		
		JButton buttonPLUS = new JButton("+");
		buttonPLUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tmp = textField.getText();
				tmp = tmp.replace(',','.');
				textField.setText(tmp);
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		buttonPLUS.setBounds(220, 130, width, height);
		frame.getContentPane().add(buttonPLUS);

		JButton buttonMINUS = new JButton("-");
		buttonMINUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tmp = textField.getText();
				tmp = tmp.replace(',','.');
				textField.setText(tmp);
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		buttonMINUS.setBounds(220, 190, width, height);
		frame.getContentPane().add(buttonMINUS);
		
		JButton buttonMULTI = new JButton("*");
		buttonMULTI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tmp = textField.getText();
				tmp = tmp.replace(',','.');
				textField.setText(tmp);
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		buttonMULTI.setBounds(220, 250, width, height);
		frame.getContentPane().add(buttonMULTI);
		
		JButton buttonDIVISION = new JButton("/");
		buttonDIVISION.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tmp = textField.getText();
				tmp = tmp.replace(',','.');
				textField.setText(tmp);
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		buttonDIVISION.setBounds(220, 310, width, height);
		frame.getContentPane().add(buttonDIVISION);
		
		JButton buttonBACKSPACE = new JButton("<-");
		buttonBACKSPACE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				String backspace = null;
				
				if (textField.getText().length() > 0){
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		buttonBACKSPACE.setBounds(40, 70, width, height);
		frame.getContentPane().add(buttonBACKSPACE);
		
		JButton buttonCLEAR = new JButton("C");
		buttonCLEAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				textField.setText(null);
			}
		});
		buttonCLEAR.setBounds(100, 70, width, height);
		frame.getContentPane().add(buttonCLEAR);

	}

}
