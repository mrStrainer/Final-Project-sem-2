package UILayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import ControlLayer.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Print extends JFrame
{
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnCancel;
	private JButton btnAddToCart;
	private JEditorPane editorPane;
	private JEditorPane editorPane_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private static Print instance;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Print frame = new Print();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Print()
	{
		Initialize();
	}
	
	public static Print getInstance() {
        if (instance == null) {
            instance = new Print();
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
		
		JLabel lblAmount = new JLabel("Amount of Papers");
		lblAmount.setBounds(1000, 200, 200, 25);
		contentPane.add(lblAmount);
		
		textField = new JTextField();
		textField.setBounds(1000, 225, 200, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(225, 125, 200, 25);
		contentPane.add(comboBox);
		
		JLabel lblPaperType = new JLabel("Paper type");
		lblPaperType.setBounds(225, 100, 100, 25);
		contentPane.add(lblPaperType);
		
		JLabel lblCovers = new JLabel("Covers");
		lblCovers.setBounds(225, 375, 100, 25);
		contentPane.add(lblCovers);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(225, 400, 200, 25);
		contentPane.add(comboBox_1);
		
		editorPane = new JEditorPane();
		editorPane.setBounds(450, 100, 400, 200);
		contentPane.add(editorPane);
		
		editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(450, 375, 400, 200);
		contentPane.add(editorPane_1);
		
		btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				String d = textField_1.getText();
				String f = textField_2.getText();
				OrderControl oc = new OrderControl();
				oc.insertPhotoAlbum(s, d, f);
				dispose();
				OrderUI.main(null);
			}
		});
		btnAddToCart.setBounds(1000, 475, 300, 100);
		contentPane.add(btnAddToCart);
		
		JLabel lblAmount_1 = new JLabel("Amount of Albums");
		lblAmount_1.setBounds(1000, 300, 200, 25);
		contentPane.add(lblAmount_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1000, 325, 200, 25);
		contentPane.add(textField_1);
		
		JLabel lblPaperSize = new JLabel("Paper Size");
		lblPaperSize.setBounds(1000, 100, 200, 25);
		contentPane.add(lblPaperSize);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(1000, 125, 200, 25);
		contentPane.add(textField_2);
		
		
	}
}