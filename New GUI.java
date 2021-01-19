import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileSystemView;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MainPage {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel;
	private JTextArea txtrSelecttxtFiles;
	private JTextArea txtrYourDropbox;
	private JTextArea txtrYouJustHave;
	private JTextArea txtrUploadingOnYour;
	File[] files;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Secure File");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(53, 142, 216, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("OPEN  FILE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                j.setDialogTitle("Select a File and an Image");
                j.setMultiSelectionEnabled(true);
                int r = j.showOpenDialog(null); 
                if (r == JFileChooser.APPROVE_OPTION) 
                { 
                    files = j.getSelectedFiles();
                    String fileNames = "";
                    for(File file: files)
                    {
                        fileNames += file.getName() + " ; ";
                    }
                    textField.setText(fileNames);
                } 
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 18));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(302, 142, 135, 33);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea txtrSecureFileIs = new JTextArea();
		txtrSecureFileIs.setEditable(false);
		txtrSecureFileIs.setFont(new Font("Calibri", Font.ITALIC, 14));
		txtrSecureFileIs.setText("SECURE FILE is a tool that ensures security of your data stored on");
		txtrSecureFileIs.setBackground(Color.LIGHT_GRAY);
		txtrSecureFileIs.setBounds(60, 42, 368, 16);
		frame.getContentPane().add(txtrSecureFileIs);
		
		btnNewButton_1 = new JButton("ENCRYPT");
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 18));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(53, 231, 216, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("UPLOAD  TO  DROPBOX");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try { Desktop.getDesktop().browse(new URI("https://www.dropbox.com/h")); } 
		        catch (IOException | URISyntaxException e1) { e1.printStackTrace(); }
			}
		});
		btnNewButton_2.setFont(new Font("Calibri", Font.BOLD, 18));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(SystemColor.textHighlight);
		btnNewButton_2.setBounds(53, 301, 216, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("DECRYPT");
		btnNewButton_3.setFont(new Font("Calibri", Font.BOLD, 18));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(SystemColor.textHighlight);
		btnNewButton_3.setBounds(53, 370, 216, 38);
		frame.getContentPane().add(btnNewButton_3);
		
		lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Secure-icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(309, 247, 128, 135);
		frame.getContentPane().add(lblNewLabel);
		
		txtrSelecttxtFiles = new JTextArea();
		txtrSelecttxtFiles.setFont(new Font("Calibri", Font.BOLD, 14));
		txtrSelecttxtFiles.setText("( Plaintext file type : \".txt\" )");
		txtrSelecttxtFiles.setBackground(Color.LIGHT_GRAY);
		txtrSelecttxtFiles.setBounds(53, 182, 216, 22);
		frame.getContentPane().add(txtrSelecttxtFiles);
		
		txtrYourDropbox = new JTextArea();
		txtrYourDropbox.setEditable(false);
		txtrYourDropbox.setText("Dropbox. ");
		txtrYourDropbox.setFont(new Font("Calibri", Font.ITALIC, 14));
		txtrYourDropbox.setBackground(Color.LIGHT_GRAY);
		txtrYourDropbox.setBounds(60, 61, 368, 16);
		frame.getContentPane().add(txtrYourDropbox);
		
		txtrYouJustHave = new JTextArea();
		txtrYouJustHave.setEditable(false);
		txtrYouJustHave.setText("You just have to select a plaintext file you want to encrypt before ");
		txtrYouJustHave.setFont(new Font("Calibri", Font.ITALIC, 14));
		txtrYouJustHave.setBackground(Color.LIGHT_GRAY);
		txtrYouJustHave.setBounds(60, 78, 368, 16);
		frame.getContentPane().add(txtrYouJustHave);
		
		txtrUploadingOnYour = new JTextArea();
		txtrUploadingOnYour.setEditable(false);
		txtrUploadingOnYour.setText("uploading on your dropbox and a image to secure your key.");
		txtrUploadingOnYour.setFont(new Font("Calibri", Font.ITALIC, 14));
		txtrUploadingOnYour.setBackground(Color.LIGHT_GRAY);
		txtrUploadingOnYour.setBounds(60, 96, 368, 16);
		frame.getContentPane().add(txtrUploadingOnYour);
	}
}
