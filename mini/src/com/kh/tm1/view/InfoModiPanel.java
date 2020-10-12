package com.kh.tm1.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InfoModiPanel extends JPanel{
	

	private JLabel lblJoin,title;
	private JButton IdCheck, joinCheck;
	private JTextField tfId, tfPw, tfRpw, tfName, tfEmail, tfEmail2, tfEmailPw;
	
	
	public InfoModiPanel() {
		this.setSize(550,650);
		this.setLayout(null);
		
		title=new JLabel("회원 정보 수정");
		
		title.setBounds(180, 20, 200, 50);
		title.setFont(new Font("맑은 고딕",Font.BOLD,30));
		



		JLabel userPw = new JLabel("비밀번호");
		userPw.setBounds(23, 186, 105, 36);
		this.add(userPw);

		tfPw = new JTextField();
		tfPw.setColumns(10);
		tfPw.setBounds(128, 185, 344, 40);
		this.add(tfPw);

		JLabel userRpw = new JLabel("비밀번호 확인");
		userRpw.setBounds(23, 226, 105, 36);
		this.add(userRpw);

		tfRpw = new JTextField();
		tfRpw.setColumns(10);
		tfRpw.setBounds(128, 225, 344, 40);
		this.add(tfRpw);

		JLabel userName = new JLabel("이름");
		userName.setBounds(23, 291, 105, 36);
		this.add(userName);

		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(128, 290, 344, 40);
		this.add(tfName);

		JLabel userEmail = new JLabel("이메일");
		userEmail.setBounds(23, 356, 105, 36);
		this.add(userEmail);

		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(128, 355, 344, 40);
		this.add(tfEmail);

		JLabel userEmailPw = new JLabel("이메일 비밀번호");
		userEmailPw.setBounds(23, 396, 105, 36);
		this.add(userEmailPw);

		tfEmailPw = new JTextField();
		tfEmailPw.setColumns(10);
		tfEmailPw.setBounds(128, 395, 344, 40);
		this.add(tfEmailPw);

		joinCheck = new JButton("회원정보 수정");
		joinCheck.setBounds(50, 530, 450, 40);
		this.add(joinCheck);

		setVisible(true);
		
		this.add(title);
		
	}
	

}
