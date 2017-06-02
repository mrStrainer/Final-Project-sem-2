package UILayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import ControlLayer.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalendarUI extends JFrame
{
	private JPanel contentPane;
	private JButton btnCancel;
	private JButton btnFinish;
	private JComboBox comboBox;
	private JTextArea textArea;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarUI frame = new CalendarUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public CalendarUI()
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
		
		btnCancel = new JButton("BACK");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Main.main(null);
			}
		});
		btnCancel.setBounds(25, 700, 100, 25);
		contentPane.add(btnCancel);
		
		comboBox = new JComboBox();
		comboBox.setBounds(100, 100, 650, 30);
		contentPane.add(comboBox);
		
		textArea = new JTextArea();
		textArea.setBounds(850, 100, 550, 300);
		contentPane.add(textArea);
		
		btnFinish = new JButton("Finish");
		btnFinish.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFinish.setBounds(1250, 450, 150, 50);
		contentPane.add(btnFinish);
	}
}
