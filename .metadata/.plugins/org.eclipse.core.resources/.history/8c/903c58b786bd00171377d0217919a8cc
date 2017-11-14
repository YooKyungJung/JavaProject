package Rule;

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
import Subject.MirimSubject;

public class MirimRule extends JFrame {
	private JLabel label;
	private JLabel label_img;
	private JButton[] rulebtn = new JButton[3];
	private String[] img = {"/rule_1.png", "/rule_2.png","/rule_3.png"};
	Image[] btnimg = new Image[3];
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	
	public MirimRule() {
		//mbutton.setVisible(false);
		setTitle("규정");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //창 중앙에 띄우기
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label_img = new JLabel("");
		label_img.setLocation(270, 0);
		Image title_img = new ImageIcon(this.getClass().getResource("/rule_title.png")).getImage();
		for(int i=0;i<3;i++) {
			rulebtn[i] = new JButton("");
			btnimg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
		}
		label.setSize(1280,720);
		label_img.setSize(756,550);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label_img);
		contentPane.add(label);
		
		label.setIcon(new ImageIcon(img));
		label_img.setIcon(new ImageIcon(title_img));
		
		//mbutton.addActionListener(this);
		rulebtn[0].setBounds(250, 565, 214, 93);
		rulebtn[1].setBounds(550, 565, 214, 93);
		rulebtn[2].setBounds(850, 565, 214, 93);
		
		for(int i=0;i<3;i++) {
			rulebtn[i].setIcon(new ImageIcon(btnimg[i]));
			rulebtn[i].setBorderPainted(false);
			rulebtn[i].setContentAreaFilled(false);
			rulebtn[i].setFocusPainted(false);
			label.add(rulebtn[i]);
		}
		setBackbtn(backbtn);
		//버튼에 클릭 이벤트 넣어주기
		rulebtn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rulebtn[0].setVisible(false);
				setVisible(false);
				SchoolRule sr = new SchoolRule();
				sr.setVisible(true);
			}
		});
		
		rulebtn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rulebtn[1].setVisible(false);
				setVisible(false);
				CostumeRule cr=new CostumeRule();
				cr.setVisible(true);
			}
		});
		
		rulebtn[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rulebtn[2].setVisible(false);
				setVisible(false);
				DormitoryRule dr = new DormitoryRule();
				dr.setVisible(true);
			}
		});
	}
	
	public void setBackbtn(JButton j) {
		
		j.setIcon(new ImageIcon(back_img));
		j.setBounds(5,5,100,70);
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
