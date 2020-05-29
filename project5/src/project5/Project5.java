
 
package project5;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Bobby
 */
public class Project5 extends JFrame {

	private static int FRAME_WIDTH = 500;
	private static int FRAME_HEIGHT = 500;
	private static int DEFAULT_SIZE = 20;
	
	private String message;
	private JLabel label;
	private JButton fileButton;
	private JButton decodeButton;
	private JTextField textfield1, textfield2, textfield3;
	private File file;
	
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		new Project5();
	}

	public Project5() {
		// Initialize JFrame
		message = "File Decoder";
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		createEastPanel();
		setVisible(true); // Make frame visible
	}
	
	private class FileListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
			int returnValue = chooser.showOpenDialog(null); // this method
															// returns an int
			if (returnValue == JFileChooser.APPROVE_OPTION) {
				File inFile = chooser.getSelectedFile();
				file = chooser.getSelectedFile();
			}			
		}
		
	}
	
	private class DecoderListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Create decoder
			Decoder test;
			try {
				test = new Decoder(file);
				textfield1.setText(test.getCode());
				textfield2.setText(test.toString());
                                int num =  test.getErrorCount();
                                String number = Integer.toString(num);
                                textfield3.setText("Number of Errors: " + number);

				
			} catch (NullPointerException ex) {
				System.err.println("No file selected!");
			} catch (FileNotFoundException ex) {
				ex.printStackTrace();
				System.err.println("File not found!");
			}


		}
		
	}

	private void createEastPanel() {
		fileButton = new JButton("Choose File");
		decodeButton = new JButton("Decode");
		textfield1 = new JTextField(20);
		textfield2 = new JTextField(20);
                textfield3 = new JTextField(20);
		fileButton.addActionListener(new FileListener());
		decodeButton.addActionListener(new DecoderListener());
                

		JPanel westPanel = new JPanel();
		westPanel.setLayout(new GridLayout(2, 1));
		westPanel.add(textfield1);
		westPanel.add(textfield2);
                westPanel.add(textfield3);
                
		
		JPanel eastPanel = new JPanel();
		eastPanel.setLayout(new GridLayout(2, 1));
		eastPanel.add(fileButton);
		eastPanel.add(decodeButton);
		add(westPanel);
		add(eastPanel, BorderLayout.EAST);
	}

}
