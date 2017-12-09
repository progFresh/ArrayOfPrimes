package Main;
import javax.swing.*;

public class SecondWindow extends JFrame {
	
	// Properties

	private static final long serialVersionUID = 1L;
	private static String programTitle = "Массив простых чисел";

	// - Constructor
	public SecondWindow() {
		super(programTitle);
		this.setBounds(607,70,300,600);
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
