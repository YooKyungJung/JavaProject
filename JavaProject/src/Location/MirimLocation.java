package Location;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.SelectMenu;

public class MirimLocation extends JFrame {
	private JLabel label;
	private JButton locationbtn;
	private JLabel label_img;
	Image btnimg;
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();

	public MirimLocation() {
		setTitle("위치");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); // 창 중앙에 띄우기
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label_img = new JLabel("");
		label_img.setLocation(270, 0);
		Image title_img = new ImageIcon(this.getClass().getResource("/location_title.png")).getImage();

		locationbtn = new JButton("");

		btnimg = new ImageIcon(this.getClass().getResource("/location_1.png")).getImage();
		label.setSize(1280, 720);
		label_img.setSize(756, 550);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label_img);
		contentPane.add(label);

		label.setIcon(new ImageIcon(img));
		label_img.setIcon(new ImageIcon(title_img));

		locationbtn.setBounds(530, 565, 214, 93);

		locationbtn.setIcon(new ImageIcon(btnimg));
		locationbtn.setBorderPainted(false);
		locationbtn.setContentAreaFilled(false);
		locationbtn.setFocusPainted(false);
		label.add(locationbtn);
		setBackbtn(backbtn);
		// 버튼에 클릭 이벤트 넣어주기
		locationbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locationbtn.setVisible(false);
				setVisible(false);
				OutLocation oe = new OutLocation();
				oe.setVisible(true);
			}
		});

	}

	public void setBackbtn(JButton j) {

		j.setIcon(new ImageIcon(back_img));
		j.setBounds(5, 5, 100, 70);
		j.setBorderPainted(false);
		j.setContentAreaFilled(false);
		j.setFocusPainted(false);
		label.add(j);

		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backbtn.setVisible(false);
				setVisible(false);
				SelectMenu sm = new SelectMenu();
				sm.setVisible(true);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
