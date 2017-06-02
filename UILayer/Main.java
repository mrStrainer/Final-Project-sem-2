package UILayer;

import javax.swing.*;
import java.awt.*;
import ControlLayer.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main 
{
	private JFrame frame;
	private JButton btnCreate;
	private JButton btnDelete;
	private JButton btnNewOrder;
	private JButton btnUpcomingJobs;
	private JButton btnRestock;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Main window = new Main();
					window.frame.setVisible(true);
				} 
				catch (Exception e) { e.printStackTrace(); }
			}
		});
	}
	
	public Main()
	{
		Initialize();
	}
	
	public void Initialize()
	{
		frame = new JFrame();
		frame.setTitle("ZK-Office");
		frame.setBounds(100, 100, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnCreate = new JButton("CREATE");
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Create create = new Create();
				frame.dispose();
				create.main(null);
			}
		});
		btnCreate.setBounds(600, 30, 300, 100);
		frame.getContentPane().add(btnCreate);
		
		btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete delete = new Delete();
				frame.dispose();
				delete.main(null);
			}
		});
		btnDelete.setBounds(600, 180, 300, 100);
		frame.getContentPane().add(btnDelete);

		btnNewOrder = new JButton("NEW ORDER");
		btnNewOrder.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderUI oUI = new OrderUI();
				frame.dispose();
				oUI.main(null);
			}
		});
		btnNewOrder.setBounds(600, 330, 300, 100);
		frame.getContentPane().add(btnNewOrder);
		
		btnUpcomingJobs = new JButton("UPCOMING JOBS");
		btnUpcomingJobs.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnUpcomingJobs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalendarUI calendarUI = new CalendarUI();
				frame.dispose();
				calendarUI.main(null);
			}
		});
		btnUpcomingJobs.setBounds(600, 630, 300, 100);
		frame.getContentPane().add(btnUpcomingJobs);
		
		btnRestock = new JButton("RESTOCK");
		btnRestock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restock restock = new Restock();
				frame.dispose();
				Restock.main(null);
			}
		});
		btnRestock.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnRestock.setBounds(600, 480, 300, 100);
		frame.getContentPane().add(btnRestock);
		
	}
}
