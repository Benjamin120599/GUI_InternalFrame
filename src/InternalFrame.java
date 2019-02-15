
import javax.swing.*;
import java.awt.*;

class VentanaPrincipal extends JFrame {
	
	JMenuBar menuBar;
	JMenu masters, booking, testPerform, printing, transaction, labReports, settings, utilities, window, help;
	
	public VentanaPrincipal() {
		
		getContentPane().setLayout(new BorderLayout());
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
		
		//ImageIcon imag1 = new ImageIcon("./src/add.png");
		//ImageIcon img1 = new ImageIcon(imag1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		
		
		JToolBar toolBar = new JToolBar();
			toolBar.add(new JButton("Add", iconos("./src/Add.png")));
			toolBar.add(new JButton("Edit", iconos("./src/Folder.png")));
			toolBar.add(new JButton("Back", iconos("./src/Back.png")));
			toolBar.add(new JButton("Go", iconos("./src/Go.png")));
			toolBar.add(new JButton("List", iconos("./src/List.png")));
			toolBar.add(new JButton("Save", iconos("./src/Save.png")));
			toolBar.add(new JButton("Print", iconos("./src/Print.png")));
			toolBar.add(new JButton("Cancel", iconos("./src/Cancel.png")));
			toolBar.add(new JButton("Settings", iconos("./src/Settings.png")));
			toolBar.add(new JButton("Delete", iconos("./src/Delete.png")));
			toolBar.add(new JButton("Exit", iconos("./src/Exit.png")));
			
		add(toolBar, BorderLayout.PAGE_START);
		
	}
	
	public ImageIcon iconos(String ruta) {
		ImageIcon imag = new ImageIcon(ruta+"");
		ImageIcon img = new ImageIcon(imag.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		return img;
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
