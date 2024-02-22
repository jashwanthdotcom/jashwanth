package send_data_reg;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.mysql.cj.xdevapi.Statement;

import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class signup {

	private JFrame frame;
	private JPasswordField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
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
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 757, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("user:");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(172, 84, 91, 33);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Password:");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setBounds(137, 162, 136, 33);
		frame.getContentPane().add(label_1);
		
		TextField tb1 = new TextField();
		tb1.setBounds(344, 96, 136, 21);
		frame.getContentPane().add(tb1);
		
		Button button = new Button("Sign In");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String password=tb2.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jashu","root","Mysql");
					String g="insert into users values('"+user+"','"+password+"')";
					java.sql.Statement sta=con.createStatement();
					sta.executeUpdate(g);
					con.close();
					} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button.setBounds(253, 277, 120, 47);
		frame.getContentPane().add(button);
		
		tb2 = new JPasswordField();
		tb2.setBounds(344, 176, 136, 19);
		frame.getContentPane().add(tb2);
	}
}
