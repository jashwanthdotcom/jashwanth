package send_data_reg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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

public class registerr {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerr window = new registerr();
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
	public registerr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 615, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Registration");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(213, 25, 153, 33);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("ID:");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_1.setBounds(80, 117, 59, 21);
		frame.getContentPane().add(label_1);
		
		Label label_1_1 = new Label("Name:");
		label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_1_1.setBounds(80, 171, 59, 21);
		frame.getContentPane().add(label_1_1);
		
		Label label_1_2 = new Label("Marks:");
		label_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_1_2.setBounds(80, 226, 74, 21);
		frame.getContentPane().add(label_1_2);
		
		TextField tb1 = new TextField();
		tb1.setBounds(228, 105, 158, 33);
		frame.getContentPane().add(tb1);
		
		TextField tb2 = new TextField();
		tb2.setBounds(228, 171, 158, 33);
		frame.getContentPane().add(tb2);
		
		TextField tb3 = new TextField();
		tb3.setBounds(228, 226, 158, 33);
		frame.getContentPane().add(tb3);
		
		Button button = new Button("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=tb1.getText();
				int id=Integer.parseInt(i);
				String n=tb2.getText();
				String marks=tb3.getText();
				int m=Integer.parseInt(marks);
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jashu","root","Mysql");
					String q="insert into reg values('"+id+"','"+n+"','"+m+"')";
					java.sql.Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(button, "Done");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button.setBounds(244, 311, 139, 33);
		frame.getContentPane().add(button);
	}
}
