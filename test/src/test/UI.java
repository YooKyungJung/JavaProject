<<<<<<< HEAD
package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UI extends JFrame implements ActionListener { 
	private BufferedImage m_numberImage; 
	private JLabel m_label; 
	private JButton button;
	public UI() throws IOException { 
		super("UI"); setLocation(300, 300); 
		setSize(500,500); setLayout(null); 
		//JLabel Image 띄우기
		m_numberImage = ImageIO.read(new File("image경로"));
		m_label= new JLabel(new ImageIcon(m_numberImage));
		m_label.setBounds(30, 270, 350,230); add(m_label); 
		//JButton에 Image 띄우기 
		button = new JButton(new ImageIcon(m_numberImage));
		button.setBounds(30, 270, 100, 30);
		add(button); button.addActionListener(this); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); 
		} 
	
	@Override 
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub 
		if(e.getSource() == button) { 
			try { 
				m_numberImage = ImageIO.read(new File("변경할 image 경로")); 
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace(); 
					} button.setIcon(new ImageIcon(m_numberImage)); 
				} 
		} 
	}	
=======
package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UI extends JFrame implements ActionListener { 
	private BufferedImage m_numberImage; 
	private JLabel m_label; 
	private JButton button;
	public UI() throws IOException { 
		super("UI"); setLocation(300, 300); 
		setSize(500,500); setLayout(null); 
		//JLabel Image 띄우기
		m_numberImage = ImageIO.read(new File("image경로"));
		m_label= new JLabel(new ImageIcon(m_numberImage));
		m_label.setBounds(30, 270, 350,230); add(m_label); 
		//JButton에 Image 띄우기 
		button = new JButton(new ImageIcon(m_numberImage));
		button.setBounds(30, 270, 100, 30);
		add(button); button.addActionListener(this); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); 
		} 
	
	@Override 
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub 
		if(e.getSource() == button) { 
			try { 
				m_numberImage = ImageIO.read(new File("변경할 image 경로")); 
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace(); 
					} button.setIcon(new ImageIcon(m_numberImage)); 
				} 
		} 
	}	
>>>>>>> c0a42daf6ca8f0447a448bb947b83e077943f666
