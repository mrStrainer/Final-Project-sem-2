package UILayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import ControlLayer.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderUI extends JFrame
{
	private JPanel contentPane;
	private JButton btnSale;
	private JButton btnService;
	private JButton btnRestock;
	private JButton btnPrintingJob;
	private JButton btnFinish;
	private JTextArea textArea;
	private JButton btnCancel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUI frame = new OrderUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public OrderUI()
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
		
		btnSale = new JButton("Sale");
		btnSale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sale sale = new Sale();
				contentPane.setVisible(false);
				sale.main(null);
			}
		});
		btnSale.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSale.setBounds(150, 100, 300, 100);
		contentPane.add(btnSale);
		
		btnService = new JButton("Service");
		btnService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Service service = new Service();
				contentPane.setVisible(false);
				service.main(null);
			}
		});
		btnService.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnService.setBounds(150, 250, 300, 100);
		contentPane.add(btnService);
		
		btnPrintingJob = new JButton("Printing Job");
		btnPrintingJob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Print print = new Print();
				contentPane.setVisible(false);
				print.main(null);
			}
		});
		btnPrintingJob.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPrintingJob.setBounds(150, 400, 300, 100);
		contentPane.add(btnPrintingJob);
		
		btnRestock = new JButton("Restock");
		btnRestock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restock restock = new Restock();
				contentPane.setVisible(false);
				restock.main(null);
			}
		});
		btnRestock.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnRestock.setBounds(150, 550, 300, 100);
		contentPane.add(btnRestock);
		
		textArea = new JTextArea();
		textArea.setBounds(700, 100, 600, 300);
		contentPane.add(textArea);
		
		btnFinish = new JButton("Finish");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.main(null);
			}
		});
		btnFinish.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnFinish.setBounds(1000, 550, 300, 100);
		contentPane.add(btnFinish);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.main(null);
			}
		});
		btnCancel.setBounds(25, 700, 100, 25);
		contentPane.add(btnCancel);
	}
	
	public void Refresh()
	{
		OrderUI.main(null);
		contentPane.setVisible(true);
	}
}