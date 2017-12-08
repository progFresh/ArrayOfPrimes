package Main;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
public class StartWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	// - Constructor
	public StartWindow() {

		super("Random prime array creator");		
		this.setBounds(400,200,400,450);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //  Panel
	    JPanel startWindowPanel = new JPanel();
	    this.add(startWindowPanel);
	    startWindowPanel.setLayout(new BoxLayout(startWindowPanel, BoxLayout.Y_AXIS));
	    
	    Font font = new Font("Verdana", Font.PLAIN, 11);
	    
	    //  the first button
	    JButton button1 = new JButton("Получить случайное простое число");
        button1.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        button1.setMaximumSize(new Dimension(300, 50));
        button1.setFocusable(false);
        button1.setFont(font);
        button1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  button1Action(e);
          }
        });
        startWindowPanel.add(button1);
	}
	
	// - Private helpers
	private void button1Action(ActionEvent e) {
		System.out.println("button1"); 
	}
}