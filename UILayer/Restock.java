package UILayer;
import ModelLayer.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import ControlLayer.*;
import ModelLayer.Item;
import ModelLayer.Supplier;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restock extends JFrame
{
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtSearch;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnCancel;
	private JButton btnAddToCart;
	private JButton btnSearch;
	private JTextArea textArea;
	private JTextPane textPane;
	private static Restock instance;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restock frame = new Restock();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Restock()
	{
		Initialize();
	}
	
	public static Restock getInstance() {
        if (instance == null) {
            instance = new Restock();
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
		
		JLabel lblSupplierId = new JLabel("Supplier ID");
		lblSupplierId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSupplierId.setBounds(100, 100, 100, 25);
		contentPane.add(lblSupplierId);
		
		textField = new JTextField();
		textField.setBounds(100, 130, 200, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblItemId = new JLabel("Item ID");
		lblItemId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblItemId.setBounds(550, 100, 100, 25);
		contentPane.add(lblItemId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(550, 130, 200, 25);
		contentPane.add(textField_1);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(1240, 130, 100, 25);
		contentPane.add(btnSearch);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate.setBounds(100, 200, 100, 25);
		contentPane.add(lblDate);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 230, 200, 25);
		contentPane.add(textField_2);
		
		txtSearch = new JTextField();
		txtSearch.setText("search item through word");
		txtSearch.setColumns(10);
		txtSearch.setBounds(1000, 130, 200, 25);
		contentPane.add(txtSearch);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAmount.setBounds(550, 200, 100, 25);
		contentPane.add(lblAmount);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(550, 230, 200, 25);
		contentPane.add(textField_3);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrice.setBounds(550, 300, 100, 25);
		contentPane.add(lblPrice);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(550, 330, 200, 25);
		contentPane.add(textField_4);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescription.setBounds(100, 300, 100, 25);
		contentPane.add(lblDescription);
		
		textArea = new JTextArea();
		textArea.setBounds(100, 330, 200, 100);
		contentPane.add(textArea);
		
		textPane = new JTextPane();
		textPane.setBounds(1000, 200, 340, 150);
		contentPane.add(textPane);
		
		btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sid = textField.getText();
				int sId = Integer.parseInt(sid);
				String pid = textField_1.getText();
				int pId = Integer.parseInt(pid);
				String date = textField_2.getText();
				String amount1 = textField_3.getText();
				int amount = Integer.parseInt(amount1);
				
				ItemControl ic = new ItemControl();
				Item i = ic.findItem(pId);
				
				PersonControl pc = new PersonControl();
				Supplier s = (Supplier) pc.findSupplier(sId);
				
				Restock restock = new Restock(i, s, amount, date);
				OrderControl oc = new OrderControl();
				oc.insertRestock(restock);
				
				dispose();
				OrderUI.main(null);
			}
		});
		btnAddToCart.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAddToCart.setBounds(500, 500, 300, 100);
		contentPane.add(btnAddToCart);
		
	}
}