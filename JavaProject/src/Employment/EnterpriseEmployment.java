package Employment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import Main.SelectMenu;

public class EnterpriseEmployment extends JFrame {
	private JTextArea dbShow;
	int row;
	private String[] str1; 
	private String[] str2; 
	private String[] str3; 
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();

	public EnterpriseEmployment() {
		setTitle("MOU협력");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); // 창 중앙에 띄우기
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		JPanel p = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(img, 0, 0, null);
				Dimension d = getSize();
				g.drawImage(img, 0, 0, d.width, d.height, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		p.setBorder(new EmptyBorder(0, 0, 0, 0));
		p.setLayout(null);
		dbShow = new JTextArea();
		JScrollPane scroll = new JScrollPane(dbShow);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		p.add(scroll);
		getContentPane().add(BorderLayout.CENTER, p);
		scroll.setBounds(325, 100, 650, 500);
		getContentPane().add(p);
		setBackbtn(backbtn, p);
		dbShow.setBackground(Color.WHITE);
		dbShow.setEditable(false); // 글자 입력 제한
		try {
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://10.96.122.177:3306/" + DBName + "?autoReconnect=true&useSSL=false";
			String SQL = "select * from employment2;";

			Connection con = DriverManager.getConnection(dbURL, "root", "mirim546"); // 연결
			System.out.println("디비연결완료");
			Statement stmt = con.createStatement();

			stmt.execute("use " + DBName + ";");
			ResultSet result = stmt.executeQuery(SQL);
			java.sql.ResultSetMetaData rsmd = result.getMetaData();
			result.last();
			row = result.getRow(); //레코드 수
			result.beforeFirst();
			str1 = new String[row];
			str2 = new String[row];
			str3 = new String[row];
			int i = 0;
			while (result.next()) {
				str1[i] = result.getString("company_name");
				str2[i] = result.getString("field");
				str3[i] = result.getString("website");
				i++;
			}

			result.close();
			stmt.close();
			con.close();

		} catch (SQLException sqle) {
			System.out.println("SQLException: " + sqle.getMessage());
			System.out.println("SQLState: " + sqle.getSQLState());
		}
		// 텍스트에어리어에 글자 출력
		for (int j = 0; j < row; j++) {
			dbShow.append("회사명 : " + str1[j] + "\t분야 : " + str2[j] + "\n" + str3[j] + "\n\n");
			dbShow.setFont(new Font("KoPub돋움체 Medium", Font.PLAIN, 15));
		}
	}

	public void setBackbtn(JButton j, JPanel p) {

		j.setIcon(new ImageIcon(back_img));
		j.setBounds(5, 5, 100, 70);
		j.setBorderPainted(false);
		j.setContentAreaFilled(false);
		j.setFocusPainted(false);
		p.add(j);

		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backbtn.setVisible(false);
				setVisible(false);
				MirimEmployment mr = new MirimEmployment();
				mr.setVisible(true);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}