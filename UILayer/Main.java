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
		btnCreate.setBounds(600, 50, 300, 100);
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
		btnDelete.setBounds(600, 200, 300, 100);
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
		btnNewOrder.setBounds(600, 350, 300, 100);
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
		btnUpcomingJobs.setBounds(600, 500, 300, 100);
		frame.getContentPane().add(btnUpcomingJobs);
		
	}
}
