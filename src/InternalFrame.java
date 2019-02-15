
import javax.swing.*;
import java.awt.*;

class VentanaPrincipal extends JFrame {
	
	JMenuBar menuBar;
	JMenu masters, booking, testPerform, printing, transaction, labReports, settings, utilities, window, help;
	JInternalFrame iF;
	
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
		
		// InternalFrame
		
		JDesktopPane desktopPane = new JDesktopPane();
			
			iF = new JInternalFrame();
			iF.getContentPane().setLayout(null);
			iF.setSize(890, 510);
			iF.setClosable(false);
			iF.setResizable(false);
			iF.setDefaultCloseOperation(HIDE_ON_CLOSE);
			iF.setVisible(true);
			
			JPanel panel1 = new JPanel();
				panel1.setBackground(Color.WHITE);
				panel1.setBounds(5, 5, 870, 245);
				panel1.setLayout(null);
				
				JLabel lbl1 = new JLabel("Patient ID");
				lbl1.setBounds(10, 10, 100, 30);
				panel1.add(lbl1);
				
				JLabel lbl2 = new JLabel("Name");
				lbl2.setBounds(10, 40, 100, 30);
				panel1.add(lbl2);
				
				JLabel lbl3 = new JLabel("Sex");
				lbl3.setBounds(10, 70, 100, 30);
				panel1.add(lbl3);
				
				JLabel lbl4 = new JLabel("Referred By");
				lbl4.setBounds(10, 100, 100, 30);
				panel1.add(lbl4);
				
				JTextField caja1 = new JTextField();
				
				
				
			iF.add(panel1);
			desktopPane.add(iF);
		
		add(desktopPane, BorderLayout.CENTER);
	}
	
	public ImageIcon iconos(String ruta) {
		ImageIcon imag = new ImageIcon(ruta+"");
		ImageIcon img = new ImageIcon(imag.getImage().getScaledInstance(23, 23, Image.SCALE_DEFAULT));
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
