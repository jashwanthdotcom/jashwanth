package jashwanth;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Label;

public class metro {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 652, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jashw\\Downloads\\images.png"));
		lblNewLabel.setBounds(428, 10, 200, 200);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(29, 130, 70, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("From:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(29, 185, 70, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("To:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(29, 237, 70, 25);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		tb1 = new JTextField();
		tb1.setBounds(125, 119, 206, 34);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "miasamaguda", "suraram", "chintal", "balnagar", "bowenpally "}));
		cb1.setBounds(125, 175, 206, 34);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"select", "secundrabad", "charminar", "abids"}));
		cb2.setBounds(125, 240, 206, 34);
		frame.getContentPane().add(cb2);
		JLabel lblNewLabel_1_2_1 = new JLabel("Tickets:");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(29, 298, 70, 25);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
	JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4"}));
		cb3.setBounds(125, 301, 206, 34);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String m=(String) cb1.getSelectedItem();
				String u=(String) cb2.getSelectedItem();
				String r=(String) cb3.getSelectedItem();
				int t=Integer.parseInt(r);
				int bill=0;
				if(m.equals("balnagar")&&u.equals("secundrabad"))
				{
					bill=35*t;
					JOptionPane.showMessageDialog(btnNewButton, "hello"+n+"\n from balnagar to secundrabad"+"\n your bill:"+bill);
				}
				if(m.equals("miasamaguda")&&u.equals("charminar"))
				{
					bill=50*t;
					JOptionPane.showMessageDialog(btnNewButton, "hello"+n+"\n from miasamaguda to charminar"+"\n your bill:"+bill);
			 	}
				else if(m.equals("suraram")&&u.equals("abids"))
				{
					bill=40*t;
					JOptionPane.showMessageDialog(btnNewButton, "hello"+n+"\n from suraram to abids"+"\n your bill:"+bill);
				}
				else if(m.equals("chintal")&&u.equals("secundrabad"))
				{
					bill=45*t;
					JOptionPane.showMessageDialog(btnNewButton, "hello"+n+"\n from chintal to secundrabad"+"\n your bill:"+bill);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(261, 362, 100, 34);
		frame.getContentPane().add(btnNewButton);
		
		Label label = new Label("Metro Ticket Booking");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(65, 42, 266, 52);
		frame.getContentPane().add(label);
		
		
		
		
	}
}
