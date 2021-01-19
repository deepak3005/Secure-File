import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Window.Type;

public class EncryptionCompleted extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EncryptionCompleted dialog = new EncryptionCompleted();
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
	public EncryptionCompleted() {
		setResizable(false);
		setType(Type.POPUP);
		getContentPane().setBackground(SystemColor.controlHighlight);
		setBounds(100, 100, 300, 255);
		getContentPane().setLayout(null);
		
		JTextArea txtrFileEncryptedSuccessfully = new JTextArea();
		txtrFileEncryptedSuccessfully.setBackground(SystemColor.controlHighlight);
		txtrFileEncryptedSuccessfully.setEditable(false);
		txtrFileEncryptedSuccessfully.setFont(new Font("Calibri", Font.BOLD, 18));
		txtrFileEncryptedSuccessfully.setText("File Encrypted Successfully !");
		txtrFileEncryptedSuccessfully.setBounds(37, 32, 216, 21);
		getContentPane().add(txtrFileEncryptedSuccessfully);
		
		JTextArea txtrCiphertextFileSaved = new JTextArea();
		txtrCiphertextFileSaved.setBackground(SystemColor.controlHighlight);
		txtrCiphertextFileSaved.setEditable(false);
		txtrCiphertextFileSaved.setText("Ciphertext file saved at : ");
		txtrCiphertextFileSaved.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrCiphertextFileSaved.setBounds(37, 75, 216, 21);
		getContentPane().add(txtrCiphertextFileSaved);
		
		JTextArea txtrCipherImageSaved = new JTextArea();
		txtrCipherImageSaved.setBackground(SystemColor.controlHighlight);
		txtrCipherImageSaved.setEditable(false);
		txtrCipherImageSaved.setText("Cipher image saved at : ");
		txtrCipherImageSaved.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrCipherImageSaved.setBounds(37, 143, 216, 21);
		getContentPane().add(txtrCipherImageSaved);
		
		JTextArea txtrCiphertextFileSaved_1 = new JTextArea();
		MainPage x = new MainPage();
		txtrCiphertextFileSaved_1.setText(x.CipherFilePathToSave);
		txtrCiphertextFileSaved_1.setFont(new Font("Calibri", Font.ITALIC, 16));
		txtrCiphertextFileSaved_1.setEditable(false);
		txtrCiphertextFileSaved_1.setBackground(SystemColor.controlHighlight);
		txtrCiphertextFileSaved_1.setBounds(37, 102, 216, 21);
		getContentPane().add(txtrCiphertextFileSaved_1);
		
		JTextArea txtrCiphertextFileSaved_2 = new JTextArea();
		txtrCiphertextFileSaved_2.setText(x.CipherImagePathToSave);
		txtrCiphertextFileSaved_2.setFont(new Font("Calibri", Font.ITALIC, 16));
		txtrCiphertextFileSaved_2.setEditable(false);
		txtrCiphertextFileSaved_2.setBackground(SystemColor.controlHighlight);
		txtrCiphertextFileSaved_2.setBounds(37, 170, 216, 21);
		getContentPane().add(txtrCiphertextFileSaved_2);

	}

}
