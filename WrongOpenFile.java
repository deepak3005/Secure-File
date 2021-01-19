import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;

public class WrongOpenFile extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WrongOpenFile dialog = new WrongOpenFile();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public WrongOpenFile() {
		setResizable(false);
		getContentPane().setBackground(SystemColor.controlHighlight);
		setBackground(Color.LIGHT_GRAY);
		setType(Type.POPUP);
		setTitle("Error in File Type");
		setBounds(100, 100, 450, 122);
		getContentPane().setLayout(null);
		
		JTextArea txtrPlaintextFileShould = new JTextArea();
		txtrPlaintextFileShould.setEditable(false);
		txtrPlaintextFileShould.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrPlaintextFileShould.setBackground(SystemColor.controlHighlight);
		txtrPlaintextFileShould.setText("Plaintext file should be of \".txt\" extension only!");
		txtrPlaintextFileShould.setBounds(82, 32, 330, 22);
		getContentPane().add(txtrPlaintextFileShould);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/File-Delete-icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(22, 11, 48, 61);
		getContentPane().add(lblNewLabel);

	}
}
