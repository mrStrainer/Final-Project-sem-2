package UILayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import ControlLayer.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Service extends JFrame
{
	private JPanel contentPane;
	private JButton btnCancel;
	private JButton btnAddToCart;
	private JTextField txtStartdate;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea; 
	private static Service instance;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Service frame = new Service();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Service()
	{
		Initialize();
	}
	
	public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
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
		
		txtStartdate = new JTextField();
		txtStartdate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtStartdate.setText("STARTDATE");
		txtStartdate.setBounds(100, 120, 200, 30);
		contentPane.add(txtStartdate);
		txtStartdate.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(100, 200, 200, 30);
		contentPane.add(textField);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(100, 180, 100, 20);
		contentPane.add(lblPrice);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(100, 280, 500, 30);
		contentPane.add(textField_1);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(100, 260, 100, 20);
		contentPane.add(lblLocation);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(100, 340, 100, 20);
		contentPane.add(lblDescription);
		
		JLabel lblStartingDate = new JLabel("Starting Date");
		lblStartingDate.setBounds(100, 100, 100, 20);
		contentPane.add(lblStartingDate);
		
		btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String startDate = txtStartdate.getText();
				String p = textField.getText();
				int price = Integer.parseInt(p);
				String location = textField_1.getText();
				String description = textArea.getText();
				OrderControl oc = new OrderControl();
				oc.insertService(startDate, price, location, description);
			}
		});
		btnAddToCart.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAddToCart.setBounds(699, 510, 300, 100);
		contentPane.add(btnAddToCart);
		
		textArea = new JTextArea();
		textArea.setBounds(100, 360, 500, 250);
		contentPane.add(textArea);
		
	}
}