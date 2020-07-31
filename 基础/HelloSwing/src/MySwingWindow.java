
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MySwingWindow extends JFrame {

	private JLabel myLabel;
	private JTextField myTextField;
	private JButton myButton;
	private Color color;
	public MySwingWindow() {
		super();
		this.setSize(400,300);
		this.getContentPane().setLayout(null);
		this.setTitle("My first swing window");
		this.add(getJButton(),null);
		this.add(getJlabel(),null);
		this.add(getJTextfield(),null);
	}
	private JLabel getJlabel() {
		if(myLabel == null) {
			myLabel = new JLabel();
			myLabel.setBounds(5, 10, 250, 30);
			myLabel.setText("hello! welcome to my swing");
		}
		return myLabel;
	}
	private JTextField getJTextfield() {
		if(myTextField == null) {
			myTextField = new JTextField();
			myTextField.setBounds(5, 45, 200, 30);
			myTextField.setText("tlg");
		}
		return myTextField;
	}
	private JButton getJButton() {
		if(myButton == null) {
			myButton = new JButton();
			myButton.setBounds(5, 80, 100, 40);
			myButton.setText("i want u to click me");
			myButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					color = Color.blue;
					myLabel.setForeground(color);
					myTextField.setBackground(color);
					color = Color.red;
				}
			});
		}
		return myButton;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySwingWindow window = new MySwingWindow();
		window.setVisible(true);
	}

}
