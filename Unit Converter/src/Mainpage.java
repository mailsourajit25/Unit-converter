import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Mainpage {

	private JFrame frmUnitConverter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage window = new Mainpage();
					window.frmUnitConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mainpage() {
		initialize();
		frmUnitConverter.setTitle("Unit Converter");
		frmUnitConverter.setResizable(false);
		frmUnitConverter.setLocationRelativeTo(null);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnitConverter = new JFrame();
		frmUnitConverter.getContentPane().setBackground(Color.WHITE);
		frmUnitConverter.setBounds(100, 100, 679, 469);
		frmUnitConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnitConverter.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToUnit = new JLabel("Confused with conversions?");
		lblWelcomeToUnit.setForeground(new Color(255, 255, 255));
		lblWelcomeToUnit.setFont(new Font("Rockwell", Font.BOLD, 22));
		lblWelcomeToUnit.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToUnit.setBounds(175, 52, 371, 38);
		frmUnitConverter.getContentPane().add(lblWelcomeToUnit);
		
		JButton butn = new JButton("Proceed to converter");
		butn.setBackground(new Color(255, 51, 51));
		butn.setForeground(new Color(255, 255, 255));
		
		butn.setFont(new Font("Rockwell", Font.BOLD, 16));
		butn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmUnitConverter.dispose();
				Converter ob=new Converter();
				ob.setVisible(true);
				ob.fillcomboboxtemp();
			}
		});
		butn.setBounds(252, 381, 200, 48);
		frmUnitConverter.getContentPane().add(butn);
		
		
		JLabel ico = new JLabel("");
		Image ob1=new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		ico.setIcon(new ImageIcon(ob1));
		ico.setBounds(223, 101, 252, 243);
		frmUnitConverter.getContentPane().add(ico);
		
		JLabel img1 = new JLabel("");
		Image ob=new ImageIcon(this.getClass().getResource("/b.jpg")).getImage();
		img1.setIcon(new ImageIcon(ob));
		img1.setBounds(0, 32, 673, 408);
		frmUnitConverter.getContentPane().add(img1);
		Image ob2=new ImageIcon(this.getClass().getResource("/top1.jpg")).getImage();
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(204, 0, 102));
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnExit.setFont(new Font("Rockwell", Font.BOLD, 16));
		btnExit.setBounds(575, 0, 98, 30);
		frmUnitConverter.getContentPane().add(btnExit);
		
		JLabel top1 = new JLabel("");
		top1.setIcon(new ImageIcon(ob2));
		top1.setBounds(0, 0, 573, 30);
		frmUnitConverter.getContentPane().add(top1);
	}
}
