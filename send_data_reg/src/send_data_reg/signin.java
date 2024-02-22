package send_data_reg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class signin {

	private JFrame frame;
	private JPasswordField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signin window = new signin();
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
	public signin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Sign In");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(239, 24, 100, 42);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("User Name:");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setBounds(99, 114, 147, 42);
		frame.getContentPane().add(label_1);
		
		Label label_1_1 = new Label("Password:");
		label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1_1.setBounds(99, 195, 147, 42);
		frame.getContentPane().add(label_1_1);
		
		TextField tb1 = new TextField();
		tb1.setBounds(283, 127, 129, 29);
		frame.getContentPane().add(tb1);
		
		tb2 = new JPasswordField();
		tb2.setBounds(283, 204, 129, 29);
		frame.getContentPane().add(tb2);
		
		JButton btnNewButton = new JButton("Login ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u=tb1.getText();
				String p=tb2.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jashu","root","Mysql");
					String q="select count(*) from signup where u=? and p=?";
					PreparedStatement ps=con.prepareStatement(q);
					ps.setString(1,u);
					ps.setString(2, p);
					ResultSet rs=ps.executeQuery();
					rs.next();
					int c=rs.getInt(1);
					if(c==0)
					{
						JOptionPane.showMessageDialog(btnNewButton, "invalid");
						
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "Login Done!");
					}
					
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(240, 297, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
