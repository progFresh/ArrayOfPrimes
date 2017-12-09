package Main;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import Array_creator.*;

public class StartWindow extends JFrame {

	// - Properties
	private static final long serialVersionUID = 1L;
	private JButton button1;
	private JButton button2;
	private JLabel titleLabel;
	private JLabel randomNumberLabel;
	private String button1Name = "Получить случайное простое число";
	private String button2Name = "Получить массив простых чисел";
	private static String programTitle = "Random prime array creator";
	private RandomArrayCreator randomPrimeArrayCreator = new RandomPrimeArrayCreator();
	

	// - Constructor
	public StartWindow() {
		super(programTitle);		
		this.setBounds(350,200,700,450);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //  Panel
	    JPanel startWindowPanel = new JPanel();
	    this.add(startWindowPanel);
	    startWindowPanel.setLayout(new BoxLayout(startWindowPanel, BoxLayout.Y_AXIS));
	    
	    Font font = new Font("Verdana", Font.PLAIN, 11);
	    
	    // title Label
	    titleLabel = new JLabel();
	    titleLabel.setText(Constants.descriptionProgramText);
        titleLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        titleLabel.setMaximumSize(new Dimension(500, 100));
        titleLabel.setFocusable(false);
        startWindowPanel.add(titleLabel);
        
	    // the first button
	    button1 = new JButton(button1Name);
        button1.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        button1.setMaximumSize(new Dimension(300, 50));
        button1.setFocusable(false);
        button1.setFont(font);
        button1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  button1Action();
          }
        });
        startWindowPanel.add(button1);
        
        // randomNumberLabel
	    randomNumberLabel = new JLabel();
	    randomNumberLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
	    randomNumberLabel.setMaximumSize(new Dimension(100, 30));
	    randomNumberLabel.setFocusable(false);
	    randomNumberLabel.setVisible(false);
        startWindowPanel.add(randomNumberLabel);
        
     // the second button
	    button2 = new JButton(button2Name);
        button2.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        button2.setMaximumSize(new Dimension(300, 50));
        button2.setFocusable(false);
        button2.setFont(font);
        button2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  button2Action();
          }
        });
        startWindowPanel.add(button2);
	}
	
	// - Private helpers
	private void button1Action() {
		int randomNumber = randomPrimeArrayCreator.getRandomNumber();
		randomNumberLabel.setText(String.valueOf(randomNumber));
		randomNumberLabel.setVisible(true);
	}

	private void button2Action() {
		System.out.println("sas");
	}
}