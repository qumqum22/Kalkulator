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
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;

public class Projekt_Kalkulator {

	private JFrame frame;
	private JTextField textField;

	int width = 55;
	int height = 55;
	
	double firstnumber = 0.0;
	double secondnumber= 0.0;
	double result = 0.0;
	String operations;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
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
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setBounds(100, 100, 320, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBounds(20, 10, 270, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton buttonTurnOFF = new JRadioButton("OFF");
		//buttonTurnOFF.setEnabled(false);
		JRadioButton buttonTurnON = new JRadioButton("ON");
		buttonTurnON.setEnabled(false);
		
		

		// Przyciski 
		
		JButton number1 = new JButton("1");
		number1.setFont(new Font("Tahoma", Font.BOLD, 11));
		number1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + number1.getText();
				textField.setText(EnterNumber);
			}
		});
		number1.setBounds(40, 250, width, height);
		frame.getContentPane().add(number1);
		
		JButton number2 = new JButton("2");
		number2.setFont(new Font("Tahoma", Font.BOLD, 11));
		number2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + number2.getText();
				textField.setText(EnterNumber);
			}
		});
		number2.setBounds(100, 250, width, height);
		frame.getContentPane().add(number2);
		
		JButton number3 = new JButton("3");
		number3.setFont(new Font("Tahoma", Font.BOLD, 11));
		number3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + number3.getText();
				textField.setText(EnterNumber);
			}
		});
		number3.setBounds(160, 250, width, height);
		frame.getContentPane().add(number3);
		
		JButton number4 = new JButton("4");
		number4.setFont(new Font("Tahoma", Font.BOLD, 11));
		number4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + number4.getText();
				textField.setText(EnterNumber);
			}
		});
		number4.setBounds(40, 190, width, height);
		frame.getContentPane().add(number4);
		
		JButton number5 = new JButton("5");
		number5.setFont(new Font("Tahoma", Font.BOLD, 11));
		number5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + number5.getText();
				textField.setText(EnterNumber);
			}
		});
		number5.setBounds(100, 190, width, height);
		frame.getContentPane().add(number5);
		
		JButton number6 = new JButton("6");
		number6.setFont(new Font("Tahoma", Font.BOLD, 11));
		number6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				String EnterNumber = textField.getText() + number6.getText();
				textField.setText(EnterNumber);
			}
		});
		number6.setBounds(160, 190, width, height);
		frame.getContentPane().add(number6);
		
		JButton number7 = new JButton("7");
		number7.setFont(new Font("Tahoma", Font.BOLD, 11));
		number7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + number7.getText();
				textField.setText(EnterNumber);
			}
		});
		number7.setBounds(40, 130, width, height);
		frame.getContentPane().add(number7);

		JButton number8 = new JButton("8");
		number8.setFont(new Font("Tahoma", Font.BOLD, 11));
		number8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + number8.getText();
				textField.setText(EnterNumber);
			}
		});
		number8.setBounds(100, 130, width, height);
		frame.getContentPane().add(number8);
		
		JButton number9 = new JButton("9");
		number9.setFont(new Font("Tahoma", Font.BOLD, 11));
		number9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + number9.getText();
				textField.setText(EnterNumber);
			}
		}); 
		number9.setBounds(160, 130, width, height);
		frame.getContentPane().add(number9);

		JButton number0 = new JButton("0");
		number0.setFont(new Font("Tahoma", Font.BOLD, 11));
		number0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String EnterNumber = textField.getText() + number0.getText();
				textField.setText(EnterNumber);
			}
		});
		number0.setBounds(40, 310, width, height);
		frame.getContentPane().add(number0);
		
		JButton buttonPM = new JButton("+/-");
		buttonPM.setFont(new Font("Tahoma", Font.BOLD, 9));
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
		buttonPM.setBounds(220, 310, width, height);
		frame.getContentPane().add(buttonPM);
		
		JButton buttonEQUAL = new JButton("=");
		buttonEQUAL.setFont(new Font("Tahoma", Font.BOLD, 11));
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
		buttonPLUS.setFont(new Font("Tahoma", Font.BOLD, 11));
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
		buttonPLUS.setBounds(220, 70, width, height);
		frame.getContentPane().add(buttonPLUS);

		JButton buttonMINUS = new JButton("-");
		buttonMINUS.setFont(new Font("Tahoma", Font.BOLD, 11));
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
		buttonMINUS.setBounds(220, 130, width, height);
		frame.getContentPane().add(buttonMINUS);
		
		JButton buttonMULTI = new JButton("*");
		buttonMULTI.setFont(new Font("Tahoma", Font.BOLD, 11));
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
		buttonMULTI.setBounds(220, 190, width, height);
		frame.getContentPane().add(buttonMULTI);
		
		JButton buttonDIVISION = new JButton("/");
		buttonDIVISION.setFont(new Font("Tahoma", Font.BOLD, 11));
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
		buttonDIVISION.setBounds(220, 250, width, height);
		frame.getContentPane().add(buttonDIVISION);
		
		JButton buttonDOT = new JButton(".");
		buttonDOT.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonDOT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tmp = textField.getText();
				tmp = tmp.replace(',','.');
				textField.setText(tmp);
				
				if (!tmp.contains("."))
				{
					String EnterNumber = textField.getText() + buttonDOT.getText();
					textField.setText(EnterNumber);
				}
			}
		});
		buttonDOT.setBounds(100, 310, width, height);
		frame.getContentPane().add(buttonDOT);
		
		JButton buttonBACKSPACE = new JButton("<-");
		buttonBACKSPACE.setFont(new Font("Tahoma", Font.BOLD, 11));
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
		buttonBACKSPACE.setBounds(100, 70, width, height);
		frame.getContentPane().add(buttonBACKSPACE);
		
		JButton buttonCLEAR = new JButton("C");
		buttonCLEAR.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonCLEAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				textField.setText(null);
			}
		});
		buttonCLEAR.setBounds(160, 70, width, height);
		frame.getContentPane().add(buttonCLEAR);
		
		
		buttonTurnON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonTurnON.setEnabled(false);
				buttonTurnOFF.setEnabled(true);
				
				textField.setEnabled(true);
				
				number1.setEnabled(true);
				number2.setEnabled(true);
				number3.setEnabled(true);
				number4.setEnabled(true);
				number5.setEnabled(true);
				number6.setEnabled(true);
				number7.setEnabled(true);
				number8.setEnabled(true);
				number9.setEnabled(true);
				number0.setEnabled(true);
				buttonPLUS.setEnabled(true);
				buttonMINUS.setEnabled(true);
				buttonMULTI.setEnabled(true);
				buttonDIVISION.setEnabled(true);
				buttonPM.setEnabled(true);
				buttonCLEAR.setEnabled(true);
				buttonBACKSPACE.setEnabled(true);
				buttonEQUAL.setEnabled(true);
				buttonDOT.setEnabled(true);	
			}
		});
		buttonGroup.add(buttonTurnON);
		buttonTurnON.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTurnON.setBounds(41, 74, 49, 23);
		frame.getContentPane().add(buttonTurnON);
		
		
		buttonTurnOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonTurnON.setEnabled(true);
				buttonTurnOFF.setEnabled(false);
				
				textField.setText(null);
				textField.setEnabled(false);
				
				firstnumber = 0.0;
				secondnumber= 0.0;
				result = 0.0;
				
				number1.setEnabled(false);
				number2.setEnabled(false);
				number3.setEnabled(false);
				number4.setEnabled(false);
				number5.setEnabled(false);
				number6.setEnabled(false);
				number7.setEnabled(false);
				number8.setEnabled(false);
				number9.setEnabled(false);
				number0.setEnabled(false);
				buttonPLUS.setEnabled(false);
				buttonMINUS.setEnabled(false);
				buttonMULTI.setEnabled(false);
				buttonDIVISION.setEnabled(false);
				buttonPM.setEnabled(false);
				buttonCLEAR.setEnabled(false);
				buttonBACKSPACE.setEnabled(false);
				buttonEQUAL.setEnabled(false);
				buttonDOT.setEnabled(false);
			}
		});
		buttonGroup.add(buttonTurnOFF);
		buttonTurnOFF.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonTurnOFF.setBounds(41, 100, 49, 23);
		frame.getContentPane().add(buttonTurnOFF);
		


	}
	
}
