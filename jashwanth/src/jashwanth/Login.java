package jashwanth;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mysql");	
		

		
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 597, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("LOGIN");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(229, 42, 107, 49);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("User Name:");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(58, 126, 124, 37);
		frame.getContentPane().add(label_1);
		
		Label label_1_1 = new Label("Password:");
		label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1_1.setBounds(58, 187, 124, 37);
		frame.getContentPane().add(label_1_1);
		
		textField = new JTextField();
		textField.setBounds(215, 126, 131, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = textField.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				if(userName.equals("jashwanth") && password.equals("shabuddin"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "login successfull");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid credentials");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(248, 306, 112, 37);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(215, 187, 131, 37);
		frame.getContentPane().add(passwordField);
	}
	public void setvisible(boolean b) {
		frame.setVisible(true);
	}
}
