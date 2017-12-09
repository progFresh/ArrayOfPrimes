package Main;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SecondWindow extends JFrame {
	
	// Properties

	private static final long serialVersionUID = 1L;
	private static String programTitle = "Массив простых чисел";
	private String watchButtonName = "OK";
	private JLabel topLabel;
	private JTextField textField;
	private JButton watchButton;

	// - Constructor
	public SecondWindow() {
		super(programTitle);
		this.setBounds(607,70,300,600);
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	    //  Panel
	    JPanel secondWindowPanel = new JPanel();
	    secondWindowPanel.setBorder(new EmptyBorder(50, 0, 0, 0));
	    
	    Font font = new Font("Verdana", Font.PLAIN, 11);
	    
	    this.add(secondWindowPanel);
	    secondWindowPanel.setLayout(new BoxLayout(secondWindowPanel, BoxLayout.Y_AXIS));
	    
	    // title Label
	    topLabel = new JLabel();
	    topLabel.setText(Constants.secondWindowTopLabel);
        topLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        topLabel.setMaximumSize(new Dimension(120, 20));
        topLabel.setFocusable(false);
        secondWindowPanel.add(topLabel);
        
        // text field
        textField = new JTextField();
        textField.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        textField.setMaximumSize(new Dimension(150, 30));
        secondWindowPanel.add(textField);
        
     // the first button
	    watchButton = new JButton(watchButtonName);
	    watchButton.setAlignmentX(JComponent.CENTER_ALIGNMENT);
	    watchButton.setMaximumSize(new Dimension(50, 45));
	    watchButton.setFocusable(false);
	    watchButton.setFont(font);
	    watchButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  watchButtonAction();
          }
        });
        secondWindowPanel.add(watchButton);
	}

	private void watchButtonAction () {
		String stringFromField = textField.getText();
		Integer arrayNumber = null;
	    try {
	    		arrayNumber = Integer.valueOf(stringFromField);
	    		System.out.println("yep");
	    }
	    catch(NumberFormatException e) {
	    		JOptionPane.showMessageDialog(null, "Неверный ввод");
	    }
	}
}