package jashwanth;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.TextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class friend {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					friend window = new friend();
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
	public friend() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 591, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(266, 264, 158, 31);
		frame.getContentPane().add(textField_1);
		
		TextField textField = new TextField();
		textField.setBounds(243, 137, 181, 39);
		frame.getContentPane().add(textField);
		
		Label label_2 = new Label("Friend's Name:");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_2.setBounds(99, 264, 181, 39);
		frame.getContentPane().add(label_2);
		
		Label label_1 = new Label("Your Name:");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(88, 137, 172, 39);
		frame.getContentPane().add(label_1);
		
		Label label = new Label("FriendShip Cal");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(193, 31, 215, 39);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r=new Random();
				int res=r.nextInt(1,100);
				JOptionPane.showMessageDialog(btnNewButton, "Your friendship is :"+res);
				
			}
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(260, 342, 164, 39);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jashw\\Downloads\\png-clipart-friends-logo-friends-logo-at-the-movies-friends-thumbnail.png"));
		lblNewLabel.setBounds(0, 10, 557, 420);
		frame.getContentPane().add(lblNewLabel);
	}
}
