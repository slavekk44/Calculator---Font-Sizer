

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.Scanner;
public class CalculatorDarkMode extends JFrame implements ActionListener{
	
	private JLabel result;
	private JTextField input;
	private JButton b[];
	private JMenuBar jb;
	private JMenu options;
	private JMenuItem MDarkMode,DarkModeOff;
	private boolean isDark;
	
	double answer = 0;
	
	public CalculatorDarkMode() {
		jb = new JMenuBar();
		options = new JMenu("options");
		jb.add(options);
		setJMenuBar(jb);
		
		MDarkMode = new JMenuItem("DarkMode");
		DarkModeOff = new JMenuItem("DarkModeOff");
		DarkModeOff.addActionListener(this);
		MDarkMode.addActionListener(this);
		options.add(MDarkMode);
		options.add(DarkModeOff);
	
		
		
	setLayout(new GridLayout(3,1));
	result = new JLabel("Result", JLabel.RIGHT);
	result.setBackground(Color.YELLOW);
	result.setOpaque(true);
	result.setFont(new Font("Arial", Font.BOLD, 24));
	result.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20));
	add(result);
	// set layout for 1 row and 3 column on top
	
	input = new JTextField();
	add(input);
	input.addActionListener(this);
	input.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,20));
	input.setHorizontalAlignment(SwingConstants.RIGHT);
	input.setFont(new Font("TimesRoman", Font.BOLD, 20));
			
	JPanel display = new JPanel(new GridLayout(1, 6));
	add(display);
	// compare current state of AM/PM a

	b = new JButton[5];
	b[0] = new JButton("+");
	b[1] = new JButton("-");
	b[2] = new JButton("*");
	b[3] = new JButton("/");
	b[4] = new JButton("CLR");
	
	for (int i = 0; i < b.length; i++) {
		
		
		b[i].setBackground(Color.LIGHT_GRAY);
		b[i].setOpaque(true);
		b[i].setBorder(BorderFactory.createLineBorder(Color.WHITE, 8));
		b[i].setFont(new Font("SansSerif", Font.BOLD, 20));
		b[i].addActionListener(this);
		display.add(b[i]);
	}


	
	
	isDark= false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame cal = new CalculatorDarkMode();
		cal.setSize(400,320);
		cal.setVisible(true);
		cal.setTitle("Calculator ;-)");
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			  //  Block of code to try
			String input1 = input.getText();
			
				
		//double score = 0;
		
		if(e.getSource() == b[0]) {
			
			 answer = answer + (Double.valueOf(input1));
			 result.setText(String.valueOf(answer));
			 System.out.println(answer);
		}
		
		if(e.getSource() == b[1]) {
			answer = answer - (Double.valueOf(input1));
			 result.setText(String.valueOf(answer));
			 System.out.println(answer);
		}
		if(e.getSource() == b[2]) {
			answer = answer * (Double.valueOf(input1));
			 result.setText(String.valueOf(answer));
			 System.out.println(answer);
		}
		if(e.getSource() == b[3]) {
			answer = answer / (Double.valueOf(input1));
			 result.setText(String.valueOf(answer));
			 System.out.println(answer);
			
		}
		
		if(e.getSource() == b[4]) {
			answer=0;
			result.setText(String.valueOf(answer));
			
			
		}
		
		
		if(e.getSource() == MDarkMode) {
			isDark= true;
			result.setBackground(Color.GRAY);
			result.setForeground(Color.WHITE);
			result.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 20));
			input.setBackground(Color.LIGHT_GRAY);
			input.setBorder(BorderFactory.createLineBorder(Color.GRAY,20));
			input.setForeground(Color.WHITE);
for (int i = 0; i < b.length; i++) {
				
				
				b[i].setBackground(Color.GRAY);
				b[i].setForeground(Color.WHITE);
				b[i].setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 8));
				b[i].setFont(new Font("SansSerif", Font.BOLD, 20));
				
				
			}
			
		} 
		if(e.getSource() == DarkModeOff) {
			isDark= false;
			result.setBackground(Color.yellow);
			result.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20));
			result.setForeground(Color.BLACK);
			input.setBackground(Color.WHITE);
			input.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,20));
			input.setForeground(Color.BLACK);
			for (int i = 0; i < b.length; i++) {
				
				
				b[i].setBackground(Color.LIGHT_GRAY);
				b[i].setForeground(Color.BLACK);
				b[i].setBorder(BorderFactory.createLineBorder(Color.WHITE, 8));
				b[i].setFont(new Font("SansSerif", Font.BOLD, 20));
				
				
			}
			
		} 
			
		
		
		}
		catch(Exception b) {
		  //  Block of code to handle errors
			System.out.println("Invalid imput");
		}
		
	}

	
}
