import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Guess extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Guess frame = new Guess();
					frame.setVisible(true);
					frame.setSize(400, 200);
			
	}
	/**
	 * Create the frame.
	 */
	public Guess() {
		super("Guess!");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
	
		JTextField digit = new JTextField();
		JButton button = new JButton("Try your luck! ");
		
	
		
		Random random = new Random();
		Integer randomNumber = random.nextInt(100);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
		try {
			Integer guessNumber = Integer.valueOf(digit.getText());
			if (guessNumber == randomNumber) {
				JOptionPane.showMessageDialog(null, "You won!");
			}
			else if(guessNumber < randomNumber) {
				JOptionPane.showMessageDialog(null, "The number is lower than the actual digit.");
			}
			else {
				JOptionPane.showMessageDialog(null, "The number is higher thant the actual digit.");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid Format");
		}
	}
			
		});
		
		panel.add(digit);
		panel.add(button);
		setContentPane(panel);
		
	}
	
}
