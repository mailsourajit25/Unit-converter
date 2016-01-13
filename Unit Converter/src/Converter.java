import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Converter extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JComboBox box1;
	private JComboBox box2;
	private JLabel lblConvertFrom;
	private JLabel lblConvertTo;
	private JLabel answer;
	private JLabel back;
	private JButton btnExit;
	private JLabel top;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter frame = new Converter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void convert()
	{
		double tnum1,ans;
		String s1;
		try{
			s1=num1.getText();
			tnum1=Double.parseDouble(s1);
			//***Temperature Block***
		//for celsius to fahrenheit and vice versa
			if(box1.getSelectedItem()=="Celsius" && box2.getSelectedItem()=="Fahrenheit")
		{
				ans=(9*tnum1+160)/5;
				answer.setText(Double.toString(ans));
		}
		else if(box1.getSelectedItem()=="Fahrenheit" && box2.getSelectedItem()=="Celsius")
		{
			ans=(5*tnum1-160)/9;
			answer.setText(Double.toString(ans));
		}
		//for celsius to kelvin and vice versa
			if(box1.getSelectedItem()=="Celsius" && box2.getSelectedItem()=="Kelvin")
			{
					ans=tnum1+274.15;
					answer.setText(Double.toString(ans));
			}
			else if( box1.getSelectedItem()=="Kelvin" && box2.getSelectedItem()=="Celsius")
			{
				ans=tnum1-274.15;
				answer.setText(Double.toString(ans));
			}
			//for kelvin to fahrenheit and vice versa
			if(box1.getSelectedItem()=="Kelvin" && box2.getSelectedItem()=="Fahrenheit")
			{
					ans=(tnum1-273.15)*1.8+ 32;
					answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Fahrenheit" && box2.getSelectedItem()=="Kelvin")
			{
				ans=((tnum1-32)/1.8)+273.15;
				answer.setText(Double.toString(ans));
			}
			//***Temperature Block end***
			
			//***Length Block***
			
			//for kilometer to meter and vice versa
			if(box1.getSelectedItem()=="Kilometer" && box2.getSelectedItem()=="Meter")
			{
				ans=tnum1*1000;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Meter" && box2.getSelectedItem()=="Kilometer")
			{
			ans=tnum1/1000;
			answer.setText(Double.toString(ans));
			}
			
			//for kilometer to Centimeter and vice versa
			if(box1.getSelectedItem()=="Kilometer" && box2.getSelectedItem()=="Centimeter")
			{
				ans=tnum1*100000;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Centimeter" && box2.getSelectedItem()=="Kilometer")
			{
			ans=tnum1/100000;
			answer.setText(Double.toString(ans));
			}
			
			//for kilometer to Millimeter and vice versa
			if(box1.getSelectedItem()=="Kilometer" && box2.getSelectedItem()=="Millimeter")
			{
				ans=tnum1*1000000;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Millimeter" && box2.getSelectedItem()=="Kilometer")
			{
			ans=tnum1/1000000;
			answer.setText(Double.toString(ans));
			}
			
			//for kilometer to Mile and vice versa
			if(box1.getSelectedItem()=="Kilometer" && box2.getSelectedItem()=="Mile")
			{
				ans=tnum1* 0.62137;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Mile" && box2.getSelectedItem()=="Kilometer")
			{
			ans=tnum1/0.62137;
			answer.setText(Double.toString(ans));
			}
			
			//for kilometer to Yard and vice versa
			if(box1.getSelectedItem()=="Kilometer" && box2.getSelectedItem()=="Yard")
			{
				ans=tnum1*1093.6;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Yard" && box2.getSelectedItem()=="Kilometer")
			{
			ans=tnum1/1093.6;
			answer.setText(Double.toString(ans));
			}
			
			//for kilometer to Feet and vice versa
			if(box1.getSelectedItem()=="Kilometer" && box2.getSelectedItem()=="Feet")
			{
				ans=tnum1*3280.8;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Feet" && box2.getSelectedItem()=="Kilometer")
			{
			ans=tnum1/3280.8;
			answer.setText(Double.toString(ans));
			}
			
			//for kilometer to Inch and vice versa
			if(box1.getSelectedItem()=="Kilometer" && box2.getSelectedItem()=="Inch")
			{
				ans=tnum1*39370;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Inch" && box2.getSelectedItem()=="Kilometer")
			{
			ans=tnum1/39370;
			answer.setText(Double.toString(ans));
			}
			
			//for Meter to Centimeter and vice versa
			if(box1.getSelectedItem()=="Meter" && box2.getSelectedItem()=="Centimeter")
			{
				ans=tnum1*100;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Centimeter" && box2.getSelectedItem()=="Meter")
			{
			ans=tnum1/100;
			answer.setText(Double.toString(ans));
			}
			
			//for Meter to Millimeter and vice versa
			if(box1.getSelectedItem()=="Meter" && box2.getSelectedItem()=="Millimeter")
			{
				ans=tnum1*1000;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Millimeter" && box2.getSelectedItem()=="Meter")
			{
			ans=tnum1/1000;
			answer.setText(Double.toString(ans));
			}
			
			//for Meter to Mile and vice versa
			if(box1.getSelectedItem()=="Meter" && box2.getSelectedItem()=="Mile")
			{
				ans=tnum1*0.00062137;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Mile" && box2.getSelectedItem()=="Meter")
			{
			ans=tnum1/0.00062137;
			answer.setText(Double.toString(ans));
			}
			
			//for Meter to Yard and vice versa
			if(box1.getSelectedItem()=="Meter" && box2.getSelectedItem()=="Yard")
			{
				ans=tnum1*1.0936;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Yard" && box2.getSelectedItem()=="Meter")
			{
			ans=tnum1/1.0936;
			answer.setText(Double.toString(ans));
			}
			
			//for Meter to Feet and vice versa
			if(box1.getSelectedItem()=="Meter" && box2.getSelectedItem()=="Feet")
			{
				ans=tnum1*3.2808;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Feet" && box2.getSelectedItem()=="Meter")
			{
			ans=tnum1/3.2808;
			answer.setText(Double.toString(ans));
			}
			
			//for Meter to Inch and vice versa
			if(box1.getSelectedItem()=="Meter" && box2.getSelectedItem()=="Inch")
			{
				ans=tnum1*39.370;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Inch" && box2.getSelectedItem()=="Meter")
			{
			ans=tnum1/39.370;
			answer.setText(Double.toString(ans));
			}
			
			//for Centimeter to Millimeter and vice versa
			if(box1.getSelectedItem()=="Centimeter" && box2.getSelectedItem()=="Millimeter")
			{
				ans=tnum1*10;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Millimeter" && box2.getSelectedItem()=="Centimeter")
			{
			ans=tnum1/10;
			answer.setText(Double.toString(ans));
			}
			
			//for Centimeter to Mile and vice versa
			if(box1.getSelectedItem()=="Centimeter" && box2.getSelectedItem()=="Mile")
			{
				ans=tnum1*0.0000062137;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Mile" && box2.getSelectedItem()=="Centimeter")
			{
			ans=tnum1/0.0000062137;
			answer.setText(Double.toString(ans));
			}
			
			//for Centimeter to Yard and vice versa
			if(box1.getSelectedItem()=="Centimeter" && box2.getSelectedItem()=="Yard")
			{
				ans=tnum1*0.010936;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Yard" && box2.getSelectedItem()=="Centimeter")
			{
			ans=tnum1/0.010936;
			answer.setText(Double.toString(ans));
			}
			
			//for Centimeter to Feet and vice versa
			if(box1.getSelectedItem()=="Centimeter" && box2.getSelectedItem()=="Feet")
			{
				ans=tnum1*0.032808;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Feet" && box2.getSelectedItem()=="Centimeter")
			{
			ans=tnum1/0.032808;
			answer.setText(Double.toString(ans));
			}
			
			//for Centimeter to Inch and vice versa
			if(box1.getSelectedItem()=="Centimeter" && box2.getSelectedItem()=="Inch")
			{
				ans=tnum1*0.393701;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Inch" && box2.getSelectedItem()=="Centimeter")
			{
			ans=tnum1/0.393701;
			answer.setText(Double.toString(ans));
			}
			
			//for Millimeter to Mile and vice versa
			if(box1.getSelectedItem()=="Millimeter" && box2.getSelectedItem()=="Mile")
			{
				ans=tnum1*0.00000062137;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Mile" && box2.getSelectedItem()=="Millimeter")
			{
			ans=tnum1/0.00000062137;
			answer.setText(Double.toString(ans));
			}
			
			//for Millimeter to Yard and vice versa
			if(box1.getSelectedItem()=="Millimeter" && box2.getSelectedItem()=="Yard")
			{
				ans=tnum1*0.0010936;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Yard" && box2.getSelectedItem()=="Millimeter")
			{
			ans=tnum1/0.0010936;
			answer.setText(Double.toString(ans));
			}
			
			//for Millimeter to Feet and vice versa
			if(box1.getSelectedItem()=="Millimeter" && box2.getSelectedItem()=="Feet")
			{
				ans=tnum1*0.0032808;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Feet" && box2.getSelectedItem()=="Millimeter")
			{
			ans=tnum1/0.0032808;
			answer.setText(Double.toString(ans));
			}
			
			//for Millimeter to Inch and vice versa
			if(box1.getSelectedItem()=="Millimeter" && box2.getSelectedItem()=="Inch")
			{
				ans=tnum1*0.0393701;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Inch" && box2.getSelectedItem()=="Millimeter")
			{
			ans=tnum1/0.0393701;
			answer.setText(Double.toString(ans));
			}
			
			
			//for Mile to Yard and vice versa
			if(box1.getSelectedItem()=="Mile" && box2.getSelectedItem()=="Yard")
			{
				ans=tnum1*1760.0;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Yard" && box2.getSelectedItem()=="Mile")
			{
			ans=tnum1/1760.0;
			answer.setText(Double.toString(ans));
			}
			
			//for Mile to Feet and vice versa
			if(box1.getSelectedItem()=="Mile" && box2.getSelectedItem()=="Feet")
			{
				ans=tnum1*5280.0;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Feet" && box2.getSelectedItem()=="Mile")
			{
			ans=tnum1/5280.0;
			answer.setText(Double.toString(ans));
			}
			
			//for Mile to Inch and vice versa
			if(box1.getSelectedItem()=="Mile" && box2.getSelectedItem()=="Inch")
			{
				ans=tnum1*63360;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Inch" && box2.getSelectedItem()=="Mile")
			{
			ans=tnum1/63360;
			answer.setText(Double.toString(ans));
			}
			
			//for Yard to Feet and vice versa
			if(box1.getSelectedItem()=="Yard" && box2.getSelectedItem()=="Feet")
			{
				ans=tnum1*3;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Feet" && box2.getSelectedItem()=="Yard")
			{
			ans=tnum1/3;
			answer.setText(Double.toString(ans));
			}
			
			//for Yard to Inch and vice versa
			if(box1.getSelectedItem()=="Yard" && box2.getSelectedItem()=="Inch")
			{
				ans=tnum1*36;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Inch" && box2.getSelectedItem()=="Yard")
			{
			ans=tnum1/36;
			answer.setText(Double.toString(ans));
			}
			
			//for Feet to Inch and vice versa
			if(box1.getSelectedItem()=="Feet" && box2.getSelectedItem()=="Inch")
			{
				ans=tnum1*12;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Inch" && box2.getSelectedItem()=="Feet")
			{
			ans=tnum1/12;
			answer.setText(Double.toString(ans));
			}
			
			//***Length Block End***
			
			//***Mass Block***
			
			//for Kilogram to Gram and vice versa
			if(box1.getSelectedItem()=="Kilogram" && box2.getSelectedItem()=="Gram")
			{
				ans=tnum1*1000;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Gram" && box2.getSelectedItem()=="Kilogram")
			{
			ans=tnum1/1000;
			answer.setText(Double.toString(ans));
			}
			
			//for Kilogram to Milligram and vice versa
			if(box1.getSelectedItem()=="Kilogram" && box2.getSelectedItem()=="Milligram")
			{
				ans=tnum1*1000000;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Milligram" && box2.getSelectedItem()=="Kilogram")
			{
			ans=tnum1/1000000;
			answer.setText(Double.toString(ans));
			}
			
			//for Kilogram to Pound and vice versa
			if(box1.getSelectedItem()=="Kilogram" && box2.getSelectedItem()=="Pound")
			{
				ans=tnum1*2.2046;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Pound" && box2.getSelectedItem()=="Kilogram")
			{
			ans=tnum1/2.2046;
			answer.setText(Double.toString(ans));
			}
			
			//for Kilogram to Ounce and vice versa
			if(box1.getSelectedItem()=="Kilogram" && box2.getSelectedItem()=="Ounce")
			{
				ans=tnum1*35.274;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Ounce" && box2.getSelectedItem()=="Kilogram")
			{
			ans=tnum1/35.274;
			answer.setText(Double.toString(ans));
			}
			
			
			//for Gram to Milligram and vice versa
			if(box1.getSelectedItem()=="Gram" && box2.getSelectedItem()=="Milligram")
			{
				ans=tnum1*1000;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Milligram" && box2.getSelectedItem()=="Gram")
			{
			ans=tnum1/1000;
			answer.setText(Double.toString(ans));
			}
			
			//for Gram to Pound and vice versa
			if(box1.getSelectedItem()=="Gram" && box2.getSelectedItem()=="Pound")
			{
				ans=tnum1*0.0022046;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Pound" && box2.getSelectedItem()=="Gram")
			{
			ans=tnum1/0.0022046;
			answer.setText(Double.toString(ans));
			}
			
			//for Gram to Ounce and vice versa
			if(box1.getSelectedItem()=="Gram" && box2.getSelectedItem()=="Ounce")
			{
				ans=tnum1*0.035274;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Ounce" && box2.getSelectedItem()=="Gram")
			{
			ans=tnum1/0.035274;
			answer.setText(Double.toString(ans));
			}
			
			//for Milligram to Pound and vice versa
			if(box1.getSelectedItem()=="Milligram" && box2.getSelectedItem()=="Pound")
			{
				ans=tnum1*0.0000022046;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Pound" && box2.getSelectedItem()=="Milligram")
			{
			ans=tnum1/0.0000022046;
			answer.setText(Double.toString(ans));
			}
			
			//for Milligram to Ounce and vice versa
			if(box1.getSelectedItem()=="Milligram" && box2.getSelectedItem()=="Ounce")
			{
				ans=tnum1*0.000035274;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Ounce" && box2.getSelectedItem()=="Milligram")
			{
			ans=tnum1/0.000035274;
			answer.setText(Double.toString(ans));
			}
			
			//for Pound to Ounce and vice versa
			if(box1.getSelectedItem()=="Pound" && box2.getSelectedItem()=="Ounce")
			{
				ans=tnum1*0.062500;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Ounce" && box2.getSelectedItem()=="Pound")
			{
			ans=tnum1/0.062500;
			answer.setText(Double.toString(ans));
			}
			
			//***Mass Block ends***
			
			//***Time Block***
			
			//for Millisecond to Second and vice versa
			if(box1.getSelectedItem()=="Millisecond" && box2.getSelectedItem()=="Second")
			{
				ans=tnum1/1000;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Second" && box2.getSelectedItem()=="Millisecond")
			{
			ans=tnum1/0.001;
			answer.setText(Double.toString(ans));
			}
			
			//for Millisecond to Minute and vice versa
			if(box1.getSelectedItem()=="Millisecond" && box2.getSelectedItem()=="Minute")
			{
				ans=tnum1*0.000016667;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Minute" && box2.getSelectedItem()=="Millisecond")
			{
			ans=tnum1/0.000016667;
			answer.setText(Double.toString(ans));
			}
			
			//for Millisecond to Hour and vice versa
			if(box1.getSelectedItem()=="Millisecond" && box2.getSelectedItem()=="Hour")
			{
				ans=tnum1*0.00000027778;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Hour" && box2.getSelectedItem()=="Millisecond")
			{
			ans=tnum1/0.00000027778;
			answer.setText(Double.toString(ans));
			}
			
			//for Second to Minute and vice versa
			if(box1.getSelectedItem()=="Second" && box2.getSelectedItem()=="Minute")
			{
				ans=tnum1*0.0166667;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Minute" && box2.getSelectedItem()=="Second")
			{
			ans=tnum1/0.0166667;
			answer.setText(Double.toString(ans));
			}
			
			//for Second to Hour and vice versa
			if(box1.getSelectedItem()=="Second" && box2.getSelectedItem()=="Hour")
			{
				ans=tnum1*0.000277778;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Hour" && box2.getSelectedItem()=="Second")
			{
			ans=tnum1/0.000277778;
			answer.setText(Double.toString(ans));
			}
			
			//for Minute to Hour and vice versa
			if(box1.getSelectedItem()=="Minute" && box2.getSelectedItem()=="Hour")
			{
				ans=tnum1*0.0166667;
				answer.setText(Double.toString(ans));
			}
			else if(box1.getSelectedItem()=="Hour" && box2.getSelectedItem()=="Minute")
			{
			ans=tnum1/0.0166667;
			answer.setText(Double.toString(ans));
			}
			
			//***Time Block Ends***
			
		//For any similar conversion
		if(box1.getSelectedItem()==box2.getSelectedItem())
		{
			answer.setText(Double.toString(tnum1));
		}
		}
	catch(Exception e1)
	{
		JOptionPane.showMessageDialog(null, "Enter a value to be converted");
	}
	}
	public void fillcomboboxtemp()
	{
		try
		{
			box1.addItem("Celsius");
			box1.addItem("Fahrenheit");
			box1.addItem("Kelvin");
			box2.addItem("Celsius");
			box2.addItem("Fahrenheit");
			box2.addItem("Kelvin");
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public void fillcomboboxlength()
	{
		try
		{
			box1.addItem("Kilometer");
			box1.addItem("Meter");
			box1.addItem("Centimeter");
			box1.addItem("Millimeter");
			box1.addItem("Mile");
			box1.addItem("Yard");
			box1.addItem("Feet");
			box1.addItem("Inch");
			
			box2.addItem("Kilometer");
			box2.addItem("Meter");
			box2.addItem("Centimeter");
			box2.addItem("Millimeter");
			box2.addItem("Mile");
			box2.addItem("Yard");
			box2.addItem("Feet");
			box2.addItem("Inch");
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public void fillcomboboxmass()
	{
		try
		{
			box1.addItem("Kilogram");
			box1.addItem("Gram");
			box1.addItem("Milligram");
			box1.addItem("Pound");
			box1.addItem("Ounce");
			
			box2.addItem("Kilogram");
			box2.addItem("Gram");
			box2.addItem("Milligram");
			box2.addItem("Pound");
			box2.addItem("Ounce");
			
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public void fillcomboboxtime()
	{
		try
		{
			box1.addItem("Millisecond");
			box1.addItem("Second");
			box1.addItem("Minute");
			box1.addItem("Hour");
			
			box2.addItem("Millisecond");
			box2.addItem("Second");
			box2.addItem("Minute");
			box2.addItem("Hour");
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public Converter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 469);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Unit Converter");
		setLocationRelativeTo(null);
		setResizable(false);
		
		num1 = new JTextField();
		num1.setFont(new Font("Serif", Font.BOLD, 16));
		num1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					convert();
				}
			}
		});
		num1.setBounds(70, 246, 204, 33);
		contentPane.add(num1);
		num1.setColumns(10);
		
		box1 = new JComboBox();
		box1.setFont(new Font("Georgia", Font.BOLD, 13));
		box1.setForeground(new Color(255, 255, 255));
		box1.setBackground(new Color(204, 0, 204));
		box1.setBounds(70, 202, 204, 33);
		contentPane.add(box1);
		
		box2 = new JComboBox();
		box2.setFont(new Font("Georgia", Font.BOLD, 13));
		box2.setBackground(new Color(153, 0, 102));
		box2.setForeground(new Color(255, 255, 255));
		box2.setBounds(400, 202, 204, 33);
		contentPane.add(box2);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBackground(new Color(204, 0, 51));
		btnConvert.setForeground(new Color(255, 255, 255));
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convert();
			}});
		btnConvert.setFont(new Font("Georgia", Font.BOLD, 13));
		btnConvert.setBounds(276, 329, 127, 42);
		contentPane.add(btnConvert);
		
		JButton btnTemperature = new JButton("Temperature");
		btnTemperature.setForeground(new Color(255, 255, 255));
		btnTemperature.setBackground(new Color(0, 153, 255));
		btnTemperature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					num1.setText("");
					answer.setText("");
					box1.removeAllItems();
					box2.removeAllItems();
					fillcomboboxtemp();
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnTemperature.setFont(new Font("Georgia", Font.BOLD, 13));
		btnTemperature.setBounds(70, 90, 138, 33);
		contentPane.add(btnTemperature);
		
		lblConvertFrom = new JLabel("Convert From");
		lblConvertFrom.setForeground(new Color(255, 255, 255));
		lblConvertFrom.setFont(new Font("Georgia", Font.BOLD, 13));
		lblConvertFrom.setBounds(73, 158, 111, 33);
		contentPane.add(lblConvertFrom);
		
		lblConvertTo = new JLabel("Convert To:");
		lblConvertTo.setForeground(new Color(255, 255, 255));
		lblConvertTo.setFont(new Font("Georgia", Font.BOLD, 13));
		lblConvertTo.setBounds(401, 162, 92, 24);
		contentPane.add(lblConvertTo);
		
		answer = new JLabel("");
		answer.setForeground(new Color(255, 255, 255));
		answer.setFont(new Font("Serif", Font.BOLD, 20));
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setBounds(400, 246, 204, 33);
		contentPane.add(answer);
		
		JButton btnLength = new JButton("Length");
		btnLength.setForeground(new Color(255, 255, 255));
		btnLength.setBackground(new Color(102, 204, 0));
		btnLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1.setText("");
				answer.setText("");
				box1.removeAllItems();
				box2.removeAllItems();
				fillcomboboxlength();
			}
		});
		btnLength.setFont(new Font("Georgia", Font.BOLD, 13));
		btnLength.setBounds(229, 90, 127, 33);
		contentPane.add(btnLength);
		
		JButton btnMass = new JButton("Mass");
		btnMass.setBackground(new Color(255, 0, 153));
		btnMass.setForeground(new Color(255, 255, 255));
		btnMass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText("");
				answer.setText("");
				box1.removeAllItems();
				box2.removeAllItems();
				fillcomboboxmass();
			}
		});
		btnMass.setFont(new Font("Georgia", Font.BOLD, 13));
		btnMass.setBounds(376, 90, 127, 33);
		contentPane.add(btnMass);
		
		JButton btnTime = new JButton("Time");
		btnTime.setForeground(new Color(255, 255, 255));
		btnTime.setBackground(new Color(255, 153, 0));
		btnTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText("");
				answer.setText("");
				box1.removeAllItems();
				box2.removeAllItems();
				fillcomboboxtime();
			}
		});
		btnTime.setFont(new Font("Georgia", Font.BOLD, 13));
		btnTime.setBounds(515, 90, 127, 33);
		contentPane.add(btnTime);
		
		back = new JLabel("");
		Image ob=new ImageIcon(this.getClass().getResource("/b1.jpg")).getImage();
		back.setIcon(new ImageIcon(ob));
		back.setBounds(0, 26, 673, 414);
		contentPane.add(back);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnExit.setBackground(new Color(153, 0, 0));
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Georgia", Font.BOLD, 13));
		btnExit.setBounds(584, 0, 89, 24);
		contentPane.add(btnExit);
		
		top = new JLabel("");
		Image ob1=new ImageIcon(this.getClass().getResource("/top2.jpg")).getImage();
		top.setIcon(new ImageIcon(ob1));
		top.setBounds(0, 1, 583, 23);
		contentPane.add(top);
	}
}
