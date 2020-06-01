package calculator_One;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

import javax.swing.border.EtchedBorder;

public class Calculator_One extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDisplay;
	private JButton btnPercentage;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JButton btnMultiplication;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btnDivision;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btnEquals;
	private JButton btnPlusMinus;
	private JButton btnDot;
	private JButton btn0;

	String operations;
	String answer;
	String cancel;
	double firstNum;
	double secondNum;
	double result;
	double logarithmic;

	String AC = "";
	int k = 0;
	double tm1 = 0.0;

	private JButton btnSqrt;
	private JButton btnMemoryRead;
	private JButton btnPi;
	private JButton btnSine;
	private JButton btnMemoryAdd;
	private JButton btnCosine;
	private JButton btnATangent;
	private JButton btnNegative;
	private JButton btnArcSine;
	private JButton btnArcCosine;
	private JButton btnArcTangent;
	private JButton btnRound;
	private JButton btnNaturalLog;
	private JButton btnLogBase10;
	private JButton btnExponential;
	private JButton btnEulerNumber;
	private JButton btnDecimal;
	private JButton btnSquare;
	private JButton btnCube;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// new CalculatorONE();

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_One frame = new Calculator_One();
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
	public Calculator_One() {
		setForeground(Color.MAGENTA);
		setFont(new Font("Impact", Font.BOLD, 40));
		setTitle("calculator ");
		setBackground(new Color(51, 51, 153));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 373);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(new Color(153, 102, 102));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textDisplay = new JTextField("0");
		textDisplay.setBounds(7, 9, 515, 46);
		textDisplay.setForeground(Color.BLACK);

		textDisplay.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textDisplay.setBackground(Color.LIGHT_GRAY);
		contentPane.add(textDisplay);
		textDisplay.setColumns(10);

		JButton btnBackSpace = new JButton("back");
		btnBackSpace.setForeground(Color.BLACK);
		btnBackSpace.setBounds(4, 54, 65, 60);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String backspace = null;

				if (textDisplay.getText().length() > 0) {

					StringBuffer strB = new StringBuffer(textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length() - 1);
					backspace = strB.toString();
					textDisplay.setText(backspace);

				}
			}
		});
		btnBackSpace.setBackground(Color.LIGHT_GRAY);
		btnBackSpace.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btnBackSpace);
		// textDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		JButton btnCancel = new JButton("C");
		btnCancel.setBounds(68, 54, 65, 60);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancel = textDisplay.getText();
				textDisplay.setText(null);
			}
		});
		btnCancel.setBackground(Color.GRAY);
		btnCancel.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btnCancel);

		btnPercentage = new JButton("%");
		btnPercentage.setBounds(135, 54, 65, 60);
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(" ");
				operations = " % ";
			}
		});
		btnPercentage.setBackground(Color.GRAY);
		btnPercentage.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btnPercentage);

		btnPlus = new JButton("+");
		btnPlus.setBounds(200, 54, 65, 60);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = " + ";

			}
		});
		btnPlus.setBackground(Color.GRAY);
		btnPlus.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btnPlus);

		btnMinus = new JButton("-");
		btnMinus.setBounds(200, 112, 65, 60);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(" ");
				operations = " - ";
			}
		});
		btnMinus.setBackground(Color.GRAY);
		btnMinus.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnMinus);

		btn9 = new JButton("9");
		btn9.setBounds(135, 112, 65, 60);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber;

				EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setBackground(Color.GRAY);
		btn9.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btn9);

		btn8 = new JButton("8");
		btn8.setBounds(68, 112, 65, 60);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber;

				EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setBackground(Color.GRAY);
		btn8.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btn8);

		// Button 7 calculation

		btn7 = new JButton("7");
		btn7.setBounds(4, 112, 65, 60);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber;

				EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setBackground(Color.GRAY);
		btn7.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btn7);

		btnMultiplication = new JButton("*");
		btnMultiplication.setBounds(200, 171, 65, 60);
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(" ");
				operations = " * ";
			}
		});
		btnMultiplication.setBackground(Color.GRAY);
		btnMultiplication.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btnMultiplication);

		btn6 = new JButton("6");
		btn6.setBounds(135, 171, 65, 60);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setBackground(Color.GRAY);
		btn6.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btn6);

		btn5 = new JButton("5");
		btn5.setBounds(68, 171, 65, 60);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setBackground(Color.GRAY);
		btn5.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btn5);

		btn4 = new JButton("4");
		btn4.setBounds(4, 171, 65, 60);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setBackground(Color.GRAY);
		btn4.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btn4);

		btnDivision = new JButton("÷");
		btnDivision.setBounds(200, 229, 65, 60);
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNum = Double.parseDouble(textDisplay.getText());
				secondNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(" ");

				operations = " / ";

			}
		});
		btnDivision.setBackground(Color.GRAY);
		btnDivision.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btnDivision);

		btn3 = new JButton("3");
		btn3.setBounds(135, 229, 65, 60);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3.setBackground(Color.GRAY);
		btn3.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btn3);

		btn2 = new JButton("2");
		btn2.setBounds(68, 229, 65, 60);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setBackground(Color.GRAY);
		btn2.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btn2);

		btn1 = new JButton("1");
		btn1.setBounds(4, 229, 65, 60);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1.setBackground(Color.GRAY);
		btn1.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btn1);

		btnEquals = new JButton("=");
		btnEquals.setBounds(200, 289, 65, 60);
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				secondNum = Double.parseDouble(textDisplay.getText());
				if (operations == " + ") {

					result = firstNum + secondNum;
					answer = String.format("%.1f", result);
					textDisplay.setText(answer);

					if (textDisplay.getText().endsWith(".0"))
						textDisplay.setText(textDisplay.getText().replace(".0", " "));

				} else if (operations == " - ") {

					result = firstNum - secondNum;
					answer = String.format("%.1f", result);
					textDisplay.setText(answer);
					if (textDisplay.getText().endsWith(".0"))
						textDisplay.setText(textDisplay.getText().replace(".0", " "));

				} else if (operations == " * ") {

					result = firstNum * secondNum;
					answer = String.format("%.1f", result);
					textDisplay.setText(answer);

					if (textDisplay.getText().endsWith(".0"))
						textDisplay.setText(textDisplay.getText().replace(".0", " "));

				} else if (operations == " % ") {

					result = firstNum % secondNum;
					answer = String.format("%.1f", result);
					textDisplay.setText(answer);

					if (textDisplay.getText().endsWith(".0"))
						textDisplay.setText(textDisplay.getText().replace(".0", " "));

				} else {

					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
					if (textDisplay.getText().endsWith(".0"))
						textDisplay.setText(textDisplay.getText().replace(".0", " "));
				}
			}
		});
		btnEquals.setBackground(Color.GRAY);
		btnEquals.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btnEquals);

		btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setBounds(135, 289, 65, 60);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = ops * (-1);
				textDisplay.setText(String.valueOf(ops));
				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));
			}
		});
		btnPlusMinus.setBackground(Color.GRAY);
		btnPlusMinus.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btnPlusMinus);

		btnDot = new JButton(".");
		btnDot.setBounds(68, 289, 65, 60);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textDisplay.getText().contains("."))
					return;

				String NumButton = textDisplay.getText() + btnDot.getText();
				textDisplay.setText(NumButton);

			}
		});
		btnDot.setBackground(Color.GRAY);
		btnDot.setFont(new Font("Times", Font.BOLD, 33));
		contentPane.add(btnDot);

		btn0 = new JButton("0");
		btn0.setBounds(4, 289, 65, 60);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn0.setBackground(Color.GRAY);
		btn0.setFont(new Font("Times", Font.BOLD, 20));
		contentPane.add(btn0);

		btnSqrt = new JButton("√");
		btnSqrt.setBounds(265, 54, 65, 60);
		btnSqrt.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textDisplay.getText().equals("")) {

					textDisplay.setText(" first input your number ");

				} else {

					logarithmic = Math.sqrt(Double.parseDouble(textDisplay.getText()));
					textDisplay.setText("");
					textDisplay.setText(textDisplay.getText() + String.format("%.2f", logarithmic));

				}

			}
		});
		contentPane.add(btnSqrt);

		btnMemoryRead = new JButton("MR");
		btnMemoryRead.setBounds(329, 54, 65, 60);
		btnMemoryRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
             
				 if(textDisplay.getText().equals(""))
					textDisplay.setText(" "); 
				textDisplay.setText(textDisplay.getText() + tm1);
				
				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));


			}

		});
		btnMemoryRead.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnMemoryRead);

		btnPi = new JButton("π");
		btnPi.setBounds(265, 112, 65, 60);
		btnPi.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				logarithmic = 3.1415926553589793238462433832795;
				textDisplay.setText(textDisplay.getText() + String.format("%.10f", logarithmic));
			}
		});
		contentPane.add(btnPi);

		btnSine = new JButton("sin");
		btnSine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = Math.sin(Double.parseDouble(textDisplay.getText()));
					textDisplay.setText("");
					// textDisplay.setText(textDisplay.getText() + String.format("%.10f",
					// logarithmic));
					textDisplay.setText(textDisplay.getText() + logarithmic);

				}
				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));
			}
		});
		btnSine.setBounds(329, 112, 65, 60);
		btnSine.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnSine);

		btnMemoryAdd = new JButton("M+");
		btnMemoryAdd.setBounds(393, 54, 65, 60);
		btnMemoryAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (k == 1) {
					tm1 = Double.parseDouble(textDisplay.getText());
					
				} else {

					tm1 += Double.parseDouble(textDisplay.getText());
					textDisplay.setText("" + tm1);
				}

			}
		});
		btnMemoryAdd.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnMemoryAdd);

		btnCosine = new JButton("cos");
		btnCosine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));

				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = Math.cos(Double.parseDouble(textDisplay.getText()));
					textDisplay.setText("");
					// textDisplay.setText(textDisplay.getText() + String.format("%.10f",
					// logarithmic));
					textDisplay.setText(textDisplay.getText() + logarithmic);

				}
				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));
			}
		});
		btnCosine.setBounds(393, 112, 65, 60);
		btnCosine.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnCosine);

		btnATangent = new JButton("tan");
		btnATangent.setBounds(455, 110, 65, 60);
		btnATangent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = Math.tan(Double.parseDouble(textDisplay.getText()));
					textDisplay.setText("");
					// textDisplay.setText(textDisplay.getText() + String.format("%.10f",
					// logarithmic));
					textDisplay.setText(textDisplay.getText() + logarithmic);

				}
				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));
			}
		});
		btnATangent.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnATangent);

		btnNegative = new JButton("(-)");
		btnNegative.setBounds(266, 171, 65, 60);
		btnNegative.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String sign = textDisplay.getText() + "-";
				textDisplay.setText(sign);
				// operations = " - ";

			}
		});
		contentPane.add(btnNegative);

		JButton btnMemoryCancel = new JButton("MC");
		btnMemoryCancel.setBounds(455, 54, 65, 60);
		btnMemoryCancel.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnMemoryCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tm1 = 0;
				textDisplay.setText("");
				
				
			}
		});
		contentPane.add(btnMemoryCancel);

		btnArcSine = new JButton("asin");
		btnArcSine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = Math.asin(Double.parseDouble(textDisplay.getText()));
					textDisplay.setText("");
					// textDisplay.setText(textDisplay.getText() + String.format("%.10f",
					// logarithmic));
					textDisplay.setText(textDisplay.getText() + logarithmic);

				}
				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));
			}
		});
		btnArcSine.setBounds(329, 171, 65, 60);
		btnArcSine.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnArcSine);

		btnArcCosine = new JButton("acos");
		btnArcCosine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = Math.acos(Double.parseDouble(textDisplay.getText()));
					textDisplay.setText("");
					// textDisplay.setText(textDisplay.getText() + String.format("%.10f",
					// logarithmic));
					textDisplay.setText(textDisplay.getText() + logarithmic);

				}
				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));
			}
		});
		btnArcCosine.setBounds(393, 171, 65, 60);
		btnArcCosine.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnArcCosine);

		btnArcTangent = new JButton("atan");
		btnArcTangent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = Math.atan(Double.parseDouble(textDisplay.getText()));
					textDisplay.setText("");
					// textDisplay.setText(textDisplay.getText() + String.format("%.10f",
					// logarithmic));
					textDisplay.setText(textDisplay.getText() + logarithmic);

				}
				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));
			}
		});
		btnArcTangent.setBounds(457, 171, 65, 60);
		btnArcTangent.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnArcTangent);

		btnRound = new JButton("Rund");
		btnRound.setBounds(265, 229, 65, 60);
		btnRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = Math.round(ops);
				textDisplay.setText(String.valueOf(ops));

			}

		});
		btnRound.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnRound);

		btnNaturalLog = new JButton("ln");
		btnNaturalLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = Math.log(Double.parseDouble(textDisplay.getText()));
					textDisplay.setText("");
					// textDisplay.setText(textDisplay.getText() + String.format("%.10f",
					// logarithmic));
					textDisplay.setText(textDisplay.getText() + logarithmic);

				}
				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));
			}
		});
		btnNaturalLog.setBounds(328, 229, 65, 60);
		btnNaturalLog.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnNaturalLog);

		btnLogBase10 = new JButton("log");
		btnLogBase10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = Math.log10(Double.parseDouble(textDisplay.getText()));
					textDisplay.setText("");
					// textDisplay.setText(textDisplay.getText() + String.format("%.10f",
					// logarithmic));
					textDisplay.setText(textDisplay.getText() + logarithmic);

				}
				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));
			}
		});
		btnLogBase10.setBounds(392, 229, 65, 60);
		btnLogBase10.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnLogBase10);

		btnExponential = new JButton("exp");
		btnExponential.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = Math.exp(Double.parseDouble(textDisplay.getText()));
					textDisplay.setText("");
					// textDisplay.setText(textDisplay.getText() + String.format("%.10f",
					// logarithmic));
					textDisplay.setText(textDisplay.getText() + logarithmic);

				}
				if (textDisplay.getText().endsWith(".0"))
					textDisplay.setText(textDisplay.getText().replace(".0", " "));
			}
		});
		btnExponential.setBounds(456, 229, 65, 60);
		btnExponential.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnExponential);

		btnEulerNumber = new JButton("e");
		btnEulerNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				logarithmic = 2.718281828;
				textDisplay.setText("");
				textDisplay.setText(textDisplay.getText() + logarithmic);

			}
		});
		btnEulerNumber.setBounds(265, 289, 65, 60);
		btnEulerNumber.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnEulerNumber);

		btnDecimal = new JButton("1/x1");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = 1 / (Double.parseDouble(textDisplay.getText()));
					textDisplay.setText(" ");
					// textDisplay.setText(textDisplay.getText() + String.format("%.6f",
					// logarithmic));
					textDisplay.setText(textDisplay.getText() + logarithmic);

					if (textDisplay.getText().endsWith(".0"))
						textDisplay.setText(textDisplay.getText().replace(".0", " "));

				}

			}
		});
		btnDecimal.setBounds(328, 289, 65, 60);
		btnDecimal.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnDecimal);

		btnSquare = new JButton("x^2");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = Math.pow(Double.parseDouble(textDisplay.getText()), 2);

					textDisplay.setText(" ");
					textDisplay.setText(textDisplay.getText() + String.format("%.6f", logarithmic));

				}

			}
		});
		btnSquare.setBounds(392, 289, 65, 60);
		btnSquare.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnSquare);

		btnCube = new JButton("x^3");
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textDisplay.getText().equals("")) {

					textDisplay.setText("first,input your number ");

				} else {

					logarithmic = Math.pow(Double.parseDouble(textDisplay.getText()), 3);

					textDisplay.setText(" ");
					textDisplay.setText(textDisplay.getText() + String.format("%.6f", logarithmic));

				}

			}
		});
		btnCube.setBounds(456, 289, 65, 60);
		btnCube.setFont(new Font("Monospaced", Font.BOLD, 20));
		contentPane.add(btnCube);
	}
}

