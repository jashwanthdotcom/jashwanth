package jashwanth;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Checkbox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class book {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					book window = new book();
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
	public book() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setBounds(100, 100, 658, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Book My Show");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(213, 36, 221, 44);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Name:");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(85, 128, 75, 21);
		frame.getContentPane().add(label_1);
		
		Label label_1_1 = new Label("Movie:");
		label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1_1.setBounds(85, 173, 75, 21);
		frame.getContentPane().add(label_1_1);
		
		Label label_1_2 = new Label("Tickets:");
		label_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1_2.setBounds(85, 227, 87, 21);
		frame.getContentPane().add(label_1_2);
		
		TextField tb1 = new TextField();
		tb1.setBounds(199, 116, 192, 33);
		frame.getContentPane().add(tb1);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "RRR", "Pushpa", "Eagle", "Guntur karam", "Hanuman"}));
		c1.setBounds(198, 173, 193, 33);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6"}));
		c2.setBounds(199, 238, 193, 33);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String m=(String) c1.getSelectedItem();
				String nt=(String) c2.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;
				if(m.equals("RRR"))
				{
					bill=500*t;
					JOptionPane.showMessageDialog(btnNewButton,"Hello"+n+"\n selected  movie : "+m+"\n no of tickets : "+nt+"\n your bill"+bill );
					
				}
				if(m.equals("Hanuman"))
				{
					bill=1000*t;
					JOptionPane.showMessageDialog(btnNewButton, "hello"+n+"\n selected movie :"+m+"\n no of tickets"+nt+"\n your bill is:"+bill);
				
				}
				else if(m.equals("Pushpa"))
				{
					bill=250*t;
					JOptionPane.showMessageDialog(btnNewButton, "hello"+n+"\n selected movie :"+m+"\n no of tickets"+nt+"\n your bill is:"+bill);
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(264, 346, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
