package UILayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import ControlLayer.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Create extends JFrame
{
	private JPanel contentPane;
	private JPanel panelItem;
	private JPanel panelPerson;
	private JPanel panelChoose;
	private JTextField txtBrand;
	private JTextField txtPrice;
	private JTextField txtStock;
	private JTextField txtName;
	private JTextField textField;
	private JTextField txtSsdhdd;
	private JTextField txtmbtbtb;
	private JTextField txtLaserink;
	private JTextField txtx;
	private JTextField txtMonocolornetwork;
	private JTextField txtmpmpmp;
	private JTextField txtgbgbgb;
	private JTextField textField_2;
	private JTextField txtMonocolornetwork_1;
	private JTextField txtppmppm;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btnCancel;
	private JButton btnCancel_1;
	private JButton btnCancel_2;
	private JButton btnCamera;
	private JButton btnCopier;
	private JButton btnPrinter;
	private JButton btnPhone;
	private JButton btnOther;
	private JButton btnMemory;
	private JButton btnNewItem;
	private JButton btnNewPerson;
	private JButton btnCustomer;
	private JButton btnEmployee;
	private JButton btnSupplier;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create frame = new Create();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Create()
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
		contentPane.setLayout(new CardLayout(0, 0));
		
		panelItem = new JPanel();
		contentPane.add(panelItem);
		panelItem.setLayout(null);
		panelItem.setVisible(false);
		
		panelChoose = new JPanel();
		contentPane.add(panelChoose);
		panelChoose.setLayout(null);
		panelChoose.setVisible(true);
		
		panelPerson = new JPanel();
		contentPane.add(panelPerson);
		panelPerson.setLayout(null);
		panelPerson.setVisible(false);
		
		txtBrand = new JTextField();
		txtBrand.setBounds(200, 110, 300, 40);
		panelItem.add(txtBrand);
		txtBrand.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(200, 170, 300, 40);
		panelItem.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtStock = new JTextField();
		txtStock.setBounds(200, 230, 300, 40);
		panelItem.add(txtStock);
		txtStock.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(50, 50, 100, 30);
		panelItem.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(200, 50, 300, 40);
		panelItem.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBrand.setBounds(50, 110, 100, 30);
		panelItem.add(lblBrand);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrice.setBounds(50, 170, 100, 30);
		panelItem.add(lblPrice);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStock.setBounds(50, 230, 100, 30);
		panelItem.add(lblStock);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescription.setBounds(50, 290, 100, 30);
		panelItem.add(lblDescription);
		
		btnCancel_2 = new JButton("CANCEL");
		btnCancel_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelItem.setVisible(false);
				panelChoose.setVisible(true);
			}
		});
		btnCancel_2.setBounds(25, 700, 100, 25);
		panelItem.add(btnCancel_2);
		
		textField = new JTextField();
		textField.setBounds(200, 290, 300, 40);
		panelItem.add(textField);
		textField.setColumns(10);
		
		btnMemory = new JButton("Memory");
		btnMemory.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMemory.setBounds(1275, 70, 150, 50);
		panelItem.add(btnMemory);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblType.setBounds(850, 50, 100, 40);
		panelItem.add(lblType);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSize.setBounds(850, 95, 100, 40);
		panelItem.add(lblSize);
		
		txtSsdhdd = new JTextField();
		txtSsdhdd.setText("SSD/HDD/SD");
		txtSsdhdd.setColumns(10);
		txtSsdhdd.setBounds(950, 50, 300, 40);
		panelItem.add(txtSsdhdd);
		
		txtmbtbtb = new JTextField();
		txtmbtbtb.setText("500MB/1TB/2TB");
		txtmbtbtb.setColumns(10);
		txtmbtbtb.setBounds(950, 95, 300, 40);
		panelItem.add(txtmbtbtb);
		
		txtLaserink = new JTextField();
		txtLaserink.setText("Laser/Ink");
		txtLaserink.setColumns(10);
		txtLaserink.setBounds(950, 170, 300, 40);
		panelItem.add(txtLaserink);
		
		txtx = new JTextField();
		txtx.setText("210x297/420x594");
		txtx.setColumns(10);
		txtx.setBounds(950, 215, 300, 40);
		panelItem.add(txtx);
		
		btnPrinter = new JButton("Printer");
		btnPrinter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPrinter.setBounds(1275, 190, 150, 50);
		panelItem.add(btnPrinter);
		
		JLabel label = new JLabel("Type");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(850, 170, 100, 40);
		panelItem.add(label);
		
		JLabel label_1 = new JLabel("Size");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(850, 215, 100, 40);
		panelItem.add(label_1);
		
		JLabel label_2 = new JLabel("Type");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(850, 290, 100, 40);
		panelItem.add(label_2);
		
		JLabel lblResolution = new JLabel("Resolution");
		lblResolution.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResolution.setBounds(850, 335, 100, 40);
		panelItem.add(lblResolution);
		
		txtMonocolornetwork = new JTextField();
		txtMonocolornetwork.setText("DSLR/Mirrorless/point-and-shoot");
		txtMonocolornetwork.setColumns(10);
		txtMonocolornetwork.setBounds(950, 290, 300, 40);
		panelItem.add(txtMonocolornetwork);
		
		txtmpmpmp = new JTextField();
		txtmpmpmp.setText("13MP/24MP/50.6MP");
		txtmpmpmp.setColumns(10);
		txtmpmpmp.setBounds(950, 335, 300, 40);
		panelItem.add(txtmpmpmp);
		
		btnCamera = new JButton("Camera");
		btnCamera.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCamera.setBounds(1275, 310, 150, 50);
		panelItem.add(btnCamera);
		
		JLabel lblRam = new JLabel("RAM");
		lblRam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRam.setBounds(850, 410, 100, 40);
		panelItem.add(lblRam);
		
		JLabel lblScrSize = new JLabel("Scr Size");
		lblScrSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblScrSize.setBounds(850, 455, 100, 40);
		panelItem.add(lblScrSize);
		
		txtgbgbgb = new JTextField();
		txtgbgbgb.setText("2GB/4GB/8GB");
		txtgbgbgb.setColumns(10);
		txtgbgbgb.setBounds(950, 410, 300, 40);
		panelItem.add(txtgbgbgb);
		
		textField_2 = new JTextField();
		textField_2.setText("4\"/5\"/5.5\"");
		textField_2.setColumns(10);
		textField_2.setBounds(950, 455, 300, 40);
		panelItem.add(textField_2);
		
		btnPhone = new JButton("Phone");
		btnPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhone.setBounds(1275, 430, 150, 50);
		panelItem.add(btnPhone);
		
		JLabel lblType_1 = new JLabel("Type");
		lblType_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblType_1.setBounds(850, 530, 100, 40);
		panelItem.add(lblType_1);
		
		JLabel lblSpeed = new JLabel("Speed");
		lblSpeed.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSpeed.setBounds(850, 575, 100, 40);
		panelItem.add(lblSpeed);
		
		txtMonocolornetwork_1 = new JTextField();
		txtMonocolornetwork_1.setText("Mono/Color/Network");
		txtMonocolornetwork_1.setColumns(10);
		txtMonocolornetwork_1.setBounds(950, 530, 300, 40);
		panelItem.add(txtMonocolornetwork_1);
		
		txtppmppm = new JTextField();
		txtppmppm.setText("35ppm/40ppm");
		txtppmppm.setColumns(10);
		txtppmppm.setBounds(950, 575, 300, 40);
		panelItem.add(txtppmppm);
		
		btnCopier = new JButton("Copier");
		btnCopier.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCopier.setBounds(1275, 550, 150, 50);
		panelItem.add(btnCopier);
		
		btnOther = new JButton("Other");
		btnOther.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOther.setBounds(150, 400, 150, 50);
		panelItem.add(btnOther);
		
		btnNewItem = new JButton("New Item");
		btnNewItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelChoose.setVisible(false);
				panelItem.setVisible(true);				
			}
		});
		btnNewItem.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewItem.setBounds(500, 50, 600, 300);
		panelChoose.add(btnNewItem);
		
		btnNewPerson = new JButton("New Person");
		btnNewPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelChoose.setVisible(false);
				panelPerson.setVisible(true);
			}
		});
		btnNewPerson.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewPerson.setBounds(500, 400, 600, 300);
		panelChoose.add(btnNewPerson);
		
		btnCancel = new JButton("BACK");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.main(null);
			}
		});
		btnCancel.setBounds(25, 700, 100, 25);
		panelChoose.add(btnCancel);
		
		btnCancel_1 = new JButton("CANCEL");
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPerson.setVisible(false);
				panelChoose.setVisible(true);
			}
		});
		btnCancel_1.setBounds(25, 700, 100, 25);
		panelPerson.add(btnCancel_1);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFirstName.setBounds(100, 100, 150, 40);
		panelPerson.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLastName.setBounds(100, 160, 150, 40);
		panelPerson.add(lblLastName);
		
		JLabel lblBirthDate = new JLabel("Birth date");
		lblBirthDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBirthDate.setBounds(100, 220, 150, 40);
		panelPerson.add(lblBirthDate);
		
		JLabel lblPhone = new JLabel("Phone nr");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhone.setBounds(100, 280, 150, 40);
		panelPerson.add(lblPhone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(100, 340, 150, 40);
		panelPerson.add(lblEmail);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(100, 400, 150, 40);
		panelPerson.add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.setBounds(275, 100, 400, 40);
		panelPerson.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(275, 160, 400, 40);
		panelPerson.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(275, 220, 400, 40);
		panelPerson.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(275, 280, 400, 40);
		panelPerson.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(275, 340, 400, 40);
		panelPerson.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(275, 400, 400, 40);
		panelPerson.add(textField_7);
		
		btnCustomer = new JButton("Customer");
		btnCustomer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCustomer.setBounds(1000, 100, 200, 50);
		panelPerson.add(btnCustomer);
		
		btnEmployee = new JButton("Employee");
		btnEmployee.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEmployee.setBounds(1000, 250, 200, 50);
		panelPerson.add(btnEmployee);
		
		btnSupplier = new JButton("Supplier");
		btnSupplier.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSupplier.setBounds(1000, 400, 200, 50);
		panelPerson.add(btnSupplier);
	}
}
