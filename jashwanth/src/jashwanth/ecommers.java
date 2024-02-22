package jashwanth;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecommers<jButton> {

	private JFrame frame;
	int i=0;
	int bill=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecommers window = new ecommers();
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
	public ecommers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 585, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Amazon");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(220, 31, 110, 40);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jashw\\Downloads\\book.png"));
		lblNewLabel.setBounds(43, 132, 73, 128);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jashw\\Downloads\\boook.png"));
		lblNewLabel_1.setBounds(156, 132, 73, 128);
		frame.getContentPane().add(lblNewLabel_1);
		
		Label label_1 = new Label("120/-");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setBounds(53, 266, 59, 33);
		frame.getContentPane().add(label_1);
		
		Label label_1_1 = new Label("180/-");
		label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1_1.setBounds(156, 266, 59, 33);
		frame.getContentPane().add(label_1_1);
		
		Label lb = new Label("CART:'0'");
		lb.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lb.setBounds(409, 132, 110, 33);
		frame.getContentPane().add(lb);
		
		
		
		Label b = new Label("BILL: '0'");
		b.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b.setBounds(409, 195, 110, 33);
		frame.getContentPane().add(b);
		
		Button button = new Button("Add to cart");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART:"+i);
				bill+=120;
				b.setText("BILL"+bill);
				
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setBounds(0, 324, 145, 21);
		frame.getContentPane().add(button);
		
		Button button_2 = new Button("Add to cart");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART:"+i);
				bill+=180;
				b.setText("BILL"+bill);
			}
		});
		button_2.setForeground(Color.RED);
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_2.setBounds(166, 324, 145, 21);
		frame.getContentPane().add(button_2);
		
		
		Button button_1 = new Button("Add to cart");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART:"+i);
				String cost=lb.getText();
				
			}
			
		});
		
	}
}
