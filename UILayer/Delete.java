package UILayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import ControlLayer.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delete extends JFrame
{
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnCancel;
	private JButton btnNo;
	private JButton btnYes;
	private JLabel lblId;
	private JTextField textField;
	private JButton btnFind;
	private JTextArea textArea;
	private JButton btnDelete;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Delete()
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
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(true);
		
		btnCancel = new JButton("BACK");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.main(null);
			}
		});
		btnCancel.setBounds(25, 700, 100, 25);
		panel.add(btnCancel);
		
		lblId = new JLabel("ID/Number:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblId.setBounds(200, 200, 150, 30);
		panel.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(350, 200, 300, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		btnFind = new JButton("FIND");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFind.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFind.setBounds(725, 185, 180, 60);
		panel.add(btnFind);
		
		textArea = new JTextArea();
		textArea.setBounds(200, 400, 500, 200);
		panel.add(textArea);
		
		btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDelete.setBounds(800, 450, 300, 100);
		panel.add(btnDelete);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		btnNo = new JButton("NO");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnNo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNo.setBounds(200, 350, 400, 200);
		panel_1.add(btnNo);
		
		btnYes = new JButton("YES");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				Main.main(null);
			}
		});
		btnYes.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnYes.setBounds(750, 350, 400, 200);
		panel_1.add(btnYes);
		
		JLabel lbl1 = new JLabel("You are about to delete this Object. You cannot get it back. Do you want to continue?");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbl1.setBounds(125, 200, 1150, 100);
		panel_1.add(lbl1);
	}
}
