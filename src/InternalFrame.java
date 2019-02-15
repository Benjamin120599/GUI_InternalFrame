
import javax.swing.*;
import java.awt.*;

class VentanaPrincipal extends JFrame {
	
	JMenuBar menuBar;
	JMenu masters, booking, testPerform, printing, transaction, labReports, settings, utilities, window, help;
	
	
	public VentanaPrincipal() {
		
		getContentPane().setLayout(null);
		setSize(900, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		menuBar = new JMenuBar();
		
		masters = new JMenu("Masters");
		menuBar.add(masters);
		
		booking = new JMenu("Booking");
		menuBar.add(booking);
		
		testPerform = new JMenu("Test Perform");
		menuBar.add(testPerform);
		
		printing = new JMenu("Printing");
		menuBar.add(printing);
		
		transaction = new JMenu("Transaction");
		menuBar.add(transaction);
		
		labReports = new JMenu("Lab Reports");
		menuBar.add(labReports);
		
		settings = new JMenu("Settings");
		menuBar.add(settings);
		
		utilities = new JMenu("Utilities");
		menuBar.add(utilities);
		
		window = new JMenu("Window");
		menuBar.add(window);
		
		help = new JMenu("Help");
		menuBar.add(help);
		
		setJMenuBar(menuBar);
		
		JToolBar toolBar = new JToolBar();
			
		
		add(toolBar, BorderLayout.PAGE_START);
		
	}
	
	
}



public class InternalFrame {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaPrincipal();
			}
		});
		
		

	}

}
