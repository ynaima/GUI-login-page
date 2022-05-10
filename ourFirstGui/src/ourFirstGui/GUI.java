
package ourFirstGui;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	
	//private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI() {
		// TODO Auto-generated constructor stub
		//create the contructor and create new object window using JFrame
		 frame = new JFrame();    // the frame is the window so we need to have some stuff inside the window
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		
		
		 //label = new JLabel();
		
		 panel = new JPanel();     // an object for creating a window
		// to use the panel
		
		panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		//panel.add(label);
		
		// creating the label
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 30, 85, 35);
		panel.add(userLabel);
		
		JTextField userText = new JTextField(30);
		userText.setBounds(100, 40, 166, 35);
		panel.add(userText);
		
		JLabel passwordLabel = new JLabel("Password");
		userLabel.setBounds(10, 50, 85, 35);
		panel.add(passwordLabel);
		
		
		JPasswordField passText = new JPasswordField(30);
		passText.setBounds(100, 40, 166, 35);
		panel.add(passText);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("First Window");
		frame.pack();
		frame.setSize(350,300);
		
		
		frame.setVisible(true);
		
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we create a new gui object
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.setTitle("Modified First Window");
		//label.setText("Modified First Window");
		
	}

}
