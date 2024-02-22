package jashwanth;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 598, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Registration");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(207, 40, 163, 46);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("User Name:");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(66, 120, 130, 21);
		frame.getContentPane().add(label_1);
		
		Label label_1_1 = new Label("Email id:");
		label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1_1.setBounds(66, 167, 130, 21);
		frame.getContentPane().add(label_1_1);
		
		Label label_1_1_1 = new Label("phone no:");
		label_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1_1_1.setBounds(66, 211, 130, 21);
		frame.getContentPane().add(label_1_1_1);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton," your registration is successful");
				Login l=new Login();
				l.setvisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(240, 307, 142, 29);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(207, 122, 151, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(207, 167, 151, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(207, 211, 151, 19);
		frame.getContentPane().add(textField_2);
	}

}
