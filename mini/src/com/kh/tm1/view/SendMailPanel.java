package com.kh.tm1.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SendMailPanel extends JPanel{

	JLabel title,receiveL,contentL,attachL;
	JTextField receiveT,attachT;
	JTextArea contentA;
	JButton attachB,sendB,homeB;
	public SendMailPanel() {
		
		this.setSize(550,650);
		this.setLayout(null);
		
		 title=new JLabel("메일 쓰기");
		
		title.setBounds(220, 20, 200, 50);
		title.setFont(new Font("맑은 고딕",Font.BOLD,30));
//--------------------------------------------------------------		
		
		 receiveL=new JLabel("받는 사람");
		
		receiveL.setBounds(20, 90, 100, 25);
		receiveL.setFont(new Font("맑은 고딕",Font.PLAIN,15));	
//--------------------------------------------------------------		
		
		 receiveT=new JTextField();
		
		receiveT.setBounds(100, 90,400,25);
//--------------------------------------------------------------		
		
		 contentL=new JLabel("내용");
		
		contentL.setBounds(20, 130, 100, 25);
		contentL.setFont(new Font("맑은 고딕",Font.PLAIN,15));	
//--------------------------------------------------------------		
		
		 contentA=new JTextArea();
		
		contentA.setBounds(101, 130,395,300);
//--------------------------------------------------------------		

		 attachL=new JLabel("첨부파일");
		
		attachL.setBounds(20, 450, 100, 25);
		attachL.setFont(new Font("맑은 고딕",Font.PLAIN,15));	
		
//--------------------------------------------------------------		

		 attachT=new JTextField();
		
		attachT.setBounds(100, 450,300,25);
		
//--------------------------------------------------------------		
		
		
		 attachB=new JButton("찾아보기");
		attachB.setBounds(400, 450, 100, 25);
//--------------------------------------------------------------
		
		 sendB=new JButton("보내기");
		sendB.setBounds(115, 550, 150, 50);
//-------------------------------------------------------------
		 homeB=new JButton("홈으로");
		homeB.setBounds(315, 550, 150, 50);

		
		
		
		this.add(attachT);
		this.add(homeB);
		this.add(sendB);
		this.add(attachB);
		this.add(attachL);
		this.add(contentA);
		this.add(contentL);
		this.add(receiveT);
		this.add(receiveL);
		this.add(title);
		
	}
	
	
}
