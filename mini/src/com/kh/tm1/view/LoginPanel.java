package com.kh.tm1.view;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginPanel extends JFrame {
	public LoginPanel() {		
		super("같이 가조");
		this.setTitle("같이 가조");
		this.setBounds(0,0,550,560);
		this.setLayout(null);
		
		Container c = this.getContentPane();
		JLabel lb = new JLabel("같이 가조");
		lb.setLocation(50, 100);
		lb.setSize(400,40);
		
		JLabel la = new JLabel("ID : ");
		la.setLocation(50,150);
		la.setSize(400,40);
		la.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		
		JTextField tf = new JTextField(" ");
		tf.setLocation(170, 150);
		tf.setSize(280,40);
		tf.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		JLabel la1 = new JLabel("Password : ");
		la1.setLocation(50,200);
		la1.setSize(400,40);
		la1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		JTextField tf1 = new JTextField("");
		tf1.setLocation(170, 200);
		tf1.setSize(280,40);
		tf1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		JButton btn = new JButton("로그인 ");
		btn.setLocation(50, 250);
		btn.setSize(400, 40);
		btn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btn.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		
		JButton btn1 = new JButton("아이디 찾기 ");
		btn1.setLocation(50, 300);
		btn1.setSize(120, 40);
		//폰트 : 맑은고딕, 볼드체, 크기는 30
		btn1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		//버튼1 위에 마우스를 올리면 대기중인 커서 모양으로 되도록 설정한다
		btn1.setCursor(new Cursor(Cursor.WAIT_CURSOR)); 
		
		JButton btn2 = new JButton("비밀번호 찾기 ");
		btn2.setLocation(190, 300);
		btn2.setSize(120, 40);
		btn2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		JButton btn3 = new JButton("회원가입 ");
		btn3.setLocation(330, 300);
		btn3.setSize(120, 40);
		btn3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btn3.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		//컨테이너에 생성한 컴포넌트 붙이기 
		this.add(la);
		this.add(la1);
		this.add(lb);
		this.add(tf);
		this.add(tf1);
		this.add(btn);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		
		this.setVisible(true);  // 두가지는 꼭 해야된다.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
