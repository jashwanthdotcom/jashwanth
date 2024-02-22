package jashwanth;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Checkbox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 662, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Registration");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(245, 21, 160, 47);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Name:");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(70, 109, 59, 21);
		frame.getContentPane().add(label_1);
		
		Label label_1_1 = new Label("Branch:");
		label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1_1.setBounds(70, 165, 80, 21);
		frame.getContentPane().add(label_1_1);
		
		Label label_1_1_1 = new Label("Fav Language");
		label_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1_1_1.setBounds(70, 277, 153, 33);
		frame.getContentPane().add(label_1_1_1);
		
		Label label_1_1_2 = new Label("Gender");
		label_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1_1_2.setBounds(70, 227, 80, 21);
		frame.getContentPane().add(label_1_1_2);
		
		TextField Name = new TextField();
		Name.setBounds(227, 97, 201, 33);
		frame.getContentPane().add(Name);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "CSE", "IT", "EEE", "ECE", "MECH"}));
		cb1.setBounds(227, 153, 201, 33);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		r1.setBounds(220, 227, 103, 21);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Femlae");
		r2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		r2.setBounds(348, 227, 103, 21);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JRadioButton c1 = new JRadioButton("python");
		c1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		c1.setBounds(236, 288, 103, 21);
		frame.getContentPane().add(c1);
		
		JRadioButton c2 = new JRadioButton("java");
		c2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		c2.setBounds(374, 289, 103, 21);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=Name.getText();
				String cb=(String) cb1.getSelectedItem();
				String g;
				if(r1.isSelected()) {
					g="Male";
				}
				else if(r2.isSelected()) {
					g="Female";
				}
				else {
					g=("invalid");
				}
				String P="";
				if(c1.isSelected())
				{
					P="java";
				}
				if(c2.isSelected())
				{
					P=P+"python";
				}
				JOptionPane.showMessageDialog(btnNewButton,"hello"+n+"\n please confirm your details\n Nmae :"+n +"\n Branch :"+cb +"\n Gender"+g +"\n fav programming language :"+P);
				
					
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(269, 383, 157, 41);
		frame.getContentPane().add(btnNewButton);
	}
}
