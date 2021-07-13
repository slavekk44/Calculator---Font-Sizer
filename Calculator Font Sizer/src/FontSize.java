

import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

public class FontSize extends JFrame implements ActionListener{

	private JLabel fontSize[];
	private JButton ic,dc;
	private int size = 18;
	public FontSize() {
		
		Border compound,loweredbevel,raisedbevel;
		Border redline = BorderFactory.createLineBorder(Color.gray,15);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();

		
		setLayout(new GridLayout(2,2));
		fontSize = new JLabel[2];
		fontSize[0] = new JLabel("X", JLabel.RIGHT);
		fontSize[1] = new JLabel("18", JLabel.LEFT);
		fontSize[0].setBorder(BorderFactory.createMatteBorder(10, 15, 10, 0, Color.gray));
		fontSize[1].setBorder(BorderFactory.createMatteBorder(10, 0, 10, 15, Color.gray));
		
		for(int i=0; i<fontSize.length; i++)
		{
			fontSize[i].setOpaque(true);
			fontSize[i].setBackground(Color.yellow);
			fontSize[i].setFont(new Font("Arial", Font.PLAIN, size));
			add(fontSize[i]);
		}
		
		
		
		ic = new JButton("Increase");
		dc = new JButton("Decrease");
		
		
		ic.setFont(new Font("SansSerif",Font.BOLD,15));
		dc.setFont(new Font("SansSerif",Font.BOLD,15));
		ic.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
		dc.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
		ic.setOpaque(true);
		dc.setOpaque(true);
		compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
		compound = BorderFactory.createCompoundBorder(redline, compound);
		
		dc.setBorder(compound);
		ic.setBorder(compound);
		ic.addActionListener(this);
		dc.addActionListener(this);
		add(ic);
		add(dc);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame font = new FontSize();
		font.setSize(300, 270);
		font.setVisible(true);
		font.setTitle("FontSize");
		font.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==ic) {
			
			fontSize[0].setFont(new Font("Arial", Font.PLAIN,size++));
			
			fontSize[1].setText(String.valueOf(size));
			dc.setEnabled(true);
			System.out.println("INCREASE = " + size);
		}
		if(e.getSource()==dc) {
			
			if(size>0)
			{
				fontSize[0].setFont(new Font("Arial", Font.PLAIN, size--));
				
				fontSize[1].setText(String.valueOf(size));
				System.out.println("Discrease = "+size);
				if(size==0) {
					System.out.println("cannot be less than zero");
					dc.setEnabled(false);
				}
			}
			
			
			
		}
		
	}

}



	