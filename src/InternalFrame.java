
import javax.swing.*;
import java.awt.*;

class VentanaPrincipal extends JFrame {
	
	JMenuBar menuBar;
	JMenu masters, booking, testPerform, printing, transaction, labReports, settings, utilities, window, help;
	JInternalFrame iF;
	JPanel panel1;
	
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
			
			panel1 = new JPanel();
				panel1.setBackground(Color.WHITE);
				panel1.setBounds(5, 5, 870, 245);
				panel1.setLayout(null);
				
				JLabel lbl1 = new JLabel("Patient ID: ");
				metodoMagico(panel1, lbl1, 10, 10, 100, 30);
				
				JLabel lbl2 = new JLabel("Name: ");
				metodoMagico(panel1, lbl2, 10, 40, 100, 30);
				
				JLabel lbl3 = new JLabel("Sex: ");
				metodoMagico(panel1, lbl3, 10, 70, 100, 30);
				
				JLabel lbl4 = new JLabel("Referred By: ");
				metodoMagico(panel1, lbl4, 10, 100, 100, 30);
				
				JTextField caja1 = new JTextField();
				metodoMagico(panel1, caja1, 85, 15, 90, 20);
				
				JTextField caja2 = new JTextField();
				metodoMagico(panel1, caja2, 85, 105, 100, 20);
				
				JTextField caja3 = new JTextField();
				metodoMagico(panel1, caja3, 160, 45, 180, 20);
				
				JComboBox combo1 = new JComboBox();
				combo1.addItem("MR.");
				combo1.addItem("MRS.");
				combo1.addItem("MISS.");
				metodoMagico(panel1, combo1, 85, 45, 60, 20);
				
				JComboBox combo2 = new JComboBox();
				combo2.addItem("MALE");
				combo2.addItem("FEMALE");
				metodoMagico(panel1, combo2, 85, 75, 70, 20);
				
				JLabel lbl5 = new JLabel("Age: ");
				metodoMagico(panel1, lbl5, 175, 70, 70, 30);
				
				JTextField caja4 = new JTextField("0");
				caja4.setHorizontalAlignment(JTextField.RIGHT);
				metodoMagico(panel1, caja4, 205, 75, 30, 20);
				
				JLabel lbl6 = new JLabel("Mons: ");
				metodoMagico(panel1, lbl6, 240, 70, 70, 30);
				
				JTextField caja5 = new JTextField("0");
				caja5.setHorizontalAlignment(JTextField.RIGHT);
				metodoMagico(panel1, caja5, 280, 75, 30, 20);
				
				JLabel lbl7 = new JLabel("Days: ");
				metodoMagico(panel1, lbl7, 315, 70, 70, 30);
				
				JTextField caja6 = new JTextField("0");
				caja6.setHorizontalAlignment(JTextField.RIGHT);
				metodoMagico(panel1, caja6, 350, 75, 30, 20);
				
				JLabel lbl8 = new JLabel("Date");
				metodoMagico(panel1, lbl8, 250, 10, 100, 30);
				
				JSpinner spinn1 = new JSpinner();
				metodoMagico(panel1, spinn1, 280, 15, 100, 20);
				
				JLabel lbl9 = new JLabel("*Time (hh:mm)");
				metodoMagico(panel1, lbl9, 390, 10, 100, 30);
				
				JLabel lbl10 = new JLabel(":");
				metodoMagico(panel1, lbl10, 530, 10, 100, 30);
				
				JSpinner spinn2 = new JSpinner();
				metodoMagico(panel1, spinn2, 480, 15, 40, 20);
				
				JSpinner spinn3 = new JSpinner();
				metodoMagico(panel1, spinn3, 540, 15, 40, 20);
				
			iF.add(panel1);
			desktopPane.add(iF);
		
		add(desktopPane, BorderLayout.CENTER);
	}
	
	public ImageIcon iconos(String ruta) {
		ImageIcon imag = new ImageIcon(ruta+"");
		ImageIcon img = new ImageIcon(imag.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		return img;
	}
	
	public void metodoMagico(JPanel panel, JComponent comp, int x, int y, int w, int h) {
		comp.setBounds(x, y, w, h);
		panel.add(comp);
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
