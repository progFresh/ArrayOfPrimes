package Main;
import java.awt.Dimension;

import javax.swing.*;

public class SecondWindow extends JFrame {
	
	// Properties

	private static final long serialVersionUID = 1L;
	private static String programTitle = "Массив простых чисел";
	private JLabel topLabel;

	// - Constructor
	public SecondWindow() {
		super(programTitle);
		this.setBounds(607,70,300,600);
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   
	    //  Panel
	    JPanel secondWindowPanel = new JPanel();
	    this.add(secondWindowPanel);
	    secondWindowPanel.setLayout(new BoxLayout(secondWindowPanel, BoxLayout.Y_AXIS));
	    
	    // title Label
	    topLabel = new JLabel();
	    topLabel.setText(Constants.secondWindowTopLabel);
        topLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        topLabel.setMaximumSize(new Dimension(120, 100));
        topLabel.setFocusable(false);
        secondWindowPanel.add(topLabel);
	}
}