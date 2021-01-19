import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;

public class DecryptionCompleted extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DecryptionCompleted dialog = new DecryptionCompleted();
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
	public DecryptionCompleted() {
		getContentPane().setBackground(SystemColor.controlHighlight);
		setResizable(false);
		setBounds(100, 100, 314, 178);
		getContentPane().setLayout(null);
		
		JTextArea txtrFileDecryptedSuccessfully = new JTextArea();
		txtrFileDecryptedSuccessfully.setEditable(false);
		txtrFileDecryptedSuccessfully.setBackground(SystemColor.controlHighlight);
		txtrFileDecryptedSuccessfully.setFont(new Font("Calibri", Font.BOLD, 18));
		txtrFileDecryptedSuccessfully.setText("File Decrypted Successfully !");
		txtrFileDecryptedSuccessfully.setBounds(35, 30, 217, 22);
		getContentPane().add(txtrFileDecryptedSuccessfully);
		
		JTextArea txtrRecoveredPlaintextFile = new JTextArea();
		txtrRecoveredPlaintextFile.setEditable(false);
		txtrRecoveredPlaintextFile.setBackground(SystemColor.controlHighlight);
		txtrRecoveredPlaintextFile.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrRecoveredPlaintextFile.setText("Recovered Plaintext File saved at :");
		txtrRecoveredPlaintextFile.setBounds(35, 75, 246, 16);
		getContentPane().add(txtrRecoveredPlaintextFile);
		
		JTextArea txtrRecoveredPlaintextFile_1 = new JTextArea();
		txtrRecoveredPlaintextFile_1.setEditable(false);
		MainPage y = new MainPage();
		txtrRecoveredPlaintextFile_1.setText(y.PlaintextFileRecoveredPathToSave);
		txtrRecoveredPlaintextFile_1.setFont(new Font("Calibri", Font.ITALIC, 16));
		txtrRecoveredPlaintextFile_1.setBackground(SystemColor.controlHighlight);
		txtrRecoveredPlaintextFile_1.setBounds(35, 102, 246, 16);
		getContentPane().add(txtrRecoveredPlaintextFile_1);

	}

}
