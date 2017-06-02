package UILayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import ControlLayer.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sale extends JFrame
{
	private JPanel contentPane;
	private JButton btnCancel;
	private JTextField textField;
	private JTextField txtSearch;
	private JButton btnAddToCart;
	private JComboBox comboBox;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextField txtSearchThroughRandow;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sale frame = new Sale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Sale()
	{
		Initialize();
	}
	
	public void Initialize()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				OrderUI.main(null);
			}
		});
		btnCancel.setBounds(25, 700, 100, 25);
		contentPane.add(btnCancel);
		
		comboBox = new JComboBox();
		comboBox.setBounds(100, 150, 300, 25);
		contentPane.add(comboBox);
		
		textArea = new JTextArea();
		textArea.setBounds(100, 300, 500, 300);
		contentPane.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(800, 375, 400, 25);
		contentPane.add(textArea_1);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(800, 350, 400, 25);
		contentPane.add(lblItem);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(1225, 350, 75, 16);
		contentPane.add(lblAmount);
		
		textField = new JTextField();
		textField.setBounds(1225, 375, 75, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtSearch = new JTextField();
		txtSearch.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearch.setText("Search");
		txtSearch.setBounds(425, 100, 175, 25);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				OrderUI.main(null);
			}
		});
		btnAddToCart.setBounds(1000, 450, 300, 100);
		contentPane.add(btnAddToCart);
		
		txtSearchThroughRandow = new JTextField();
		txtSearchThroughRandow.setText("SEARCH THROUGH RANDOM WORD IN DESC.");
		txtSearchThroughRandow.setBounds(100, 100, 300, 25);
		contentPane.add(txtSearchThroughRandow);
		txtSearchThroughRandow.setColumns(10);
	}
}