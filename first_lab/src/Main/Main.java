package Main;

import javax.swing.*;

public class Main {
	
	// - Main

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                JFrame startWindow = new StartWindow();
        			startWindow.setVisible(true);
            }
        });
	}
}