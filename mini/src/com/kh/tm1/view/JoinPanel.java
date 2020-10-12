package com.kh.tm1.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinPanel extends JPanel {

	private JLabel lblJoin;
	private JButton IdCheck, joinCheck;
	private JTextField tfId, tfPw, tfRpw, tfName, tfEmail, tfEmail2, tfEmailPw;

	public JoinPanel() {

		this.setSize(550, 650);
		this.setLayout(null);

		JLabel lblJoin = new JLabel("회원가입");
		Font fi = new Font("굴림체", Font.BOLD, 25);
		lblJoin.setFont(fi);
		lblJoin.setBounds(220, 40, 120, 35);
		this.add(lblJoin);

		JLabel uesrId = new JLabel("아이디");
		uesrId.setBounds(43, 146, 105, 36);
		this.add(uesrId);

		tfId = new JTextField();
		tfId.setColumns(10);
		tfId.setBounds(148, 145, 257, 40);
		this.add(tfId);

		JButton IdCheck = new JButton("중복확인");
		IdCheck.setBounds(405, 145, 86, 39);
		this.add(IdCheck);

		JLabel userPw = new JLabel("비밀번호");
		userPw.setBounds(43, 186, 105, 36);
		this.add(userPw);

		tfPw = new JTextField();
		tfPw.setColumns(10);
		tfPw.setBounds(148, 185, 344, 40);
		this.add(tfPw);

		JLabel userRpw = new JLabel("비밀번호 확인");
		userRpw.setBounds(43, 226, 105, 36);
		this.add(userRpw);

		tfRpw = new JTextField();
		tfRpw.setColumns(10);
		tfRpw.setBounds(148, 225, 344, 40);
		this.add(tfRpw);

		JLabel userName = new JLabel("이름");
		userName.setBounds(43, 291, 105, 36);
		this.add(userName);

		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(148, 290, 344, 40);
		this.add(tfName);

		JLabel userEmail = new JLabel("이메일");
		userEmail.setBounds(43, 356, 105, 36);
		this.add(userEmail);

		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(148, 355, 344, 40);
		this.add(tfEmail);

		JLabel userEmailPw = new JLabel("이메일 비밀번호");
		userEmailPw.setBounds(43, 396, 105, 36);
		this.add(userEmailPw);

		tfEmailPw = new JTextField();
		tfEmailPw.setColumns(10);
		tfEmailPw.setBounds(148, 395, 344, 40);
		this.add(tfEmailPw);

		joinCheck = new JButton("가입완료");
		joinCheck.setBounds(40, 530, 450, 40);
		this.add(joinCheck);

	}

}
