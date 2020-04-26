import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
public class Calculator 
{
	private JFrame frmCalculator;
	private JTextField txtDisplay;	
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmCalculator = new JFrame("Calculator");
		frmCalculator.setBounds(100, 100, 282, 429);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);	
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 11, 248, 48);
		frmCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		//----------------------------Row One-----------------------------------------------------
		JButton btnBackSpace=new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(txtDisplay.getText().length()>0)
				{
				  StringBuilder strB= new StringBuilder(txtDisplay.getText());	
				  strB.deleteCharAt(txtDisplay.getText().length() - 1);
				  backspace=strB.toString();
				  txtDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnBackSpace.setBounds(10, 68, 60, 60);
		frmCalculator.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(73, 68, 60, 60);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnC = new JButton("%");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="%";
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(136, 68, 60, 60);
		frmCalculator.getContentPane().add(btnC);
		
		JButton btnr = new JButton("/");
		btnr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="/";
			}
		});
		btnr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnr.setBounds(198, 68, 60, 60);
		frmCalculator.getContentPane().add(btnr);
	
	//---------------------Row 2-----------------------------	
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(string);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 130, 60, 60);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(string);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(73, 130, 60, 60);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(string);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(135, 130, 60, 60);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(198, 130, 60, 60);
		frmCalculator.getContentPane().add(btnPlus);
		
		//----------------------------- RoW number 3----------------------------------------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(string);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 192, 60, 60);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(string);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(73, 192, 60, 60);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(string);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(135, 192, 60, 60);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(198, 192, 60, 60);
		frmCalculator.getContentPane().add(btnSub);
		
		// RoW number 4----------------------------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(string);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 254, 60, 60);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(string);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(73, 254, 60, 60);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(string);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(135, 254, 60, 60);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.setBounds(198, 254, 60, 60);
		frmCalculator.getContentPane().add(btnMul);
		
		// RoW number 5----------------------------------------------------
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String string=txtDisplay.getText()+btn0.getText();
						txtDisplay.setText(string);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(10, 316, 60, 60);
				frmCalculator.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String string=txtDisplay.getText()+btnDot.getText();
						txtDisplay.setText(string);
					}
				});
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(73, 316, 60, 60);
				frmCalculator.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("\u00B1");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
						ops=ops*(-1);
						txtDisplay.setText(String.valueOf(ops));
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPM.setBounds(135, 316, 60, 60);
				frmCalculator.getContentPane().add(btnPM);
				
				JButton btnEquals = new JButton("=");
				btnEquals.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String answer;
						secondNumber=Double.parseDouble(txtDisplay.getText());
						if(operations=="+")
						{
							result=firstNumber + secondNumber;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);
						}
						else if(operations=="-")
						{
							result=firstNumber - secondNumber;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);	
						}
						else if(operations=="*")
						{
							result=firstNumber * secondNumber;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);	
						}
						else if(operations=="/")
						{
							result=firstNumber / secondNumber;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);	
						}
						else if(operations=="%")
						{
							result=firstNumber % secondNumber;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);	
						}
					}
				});
				btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEquals.setBounds(198, 316, 60, 60);
				frmCalculator.getContentPane().add(btnEquals);
	}

}
