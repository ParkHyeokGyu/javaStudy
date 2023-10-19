/*
 	예외처리
 		예외복구 => try~catch
 			try => 정상 수행 문장 => 에러 발생이 예상되는 코드
 			catch => try절의 문장 수행 => 에러 발생
 									  1)확인 => e.getMessage(),e.printStackTrace()
 									  2)복구 => 처음부터 수행
 				  => catch절을 여러번 사용할 수 있다
 				  => Exception의 계층구조에따라 작성해야한다
 				  			
 				  			Throwable
 				  			---------
 				  			|
 				  			Exception
 				  			|
 				  			-----------------
 				  			|				|
 				  			IOException		RuntimeException
 				  							|
 				  							NumberFormatException
 				  							...
 				  			
 		예외회피 => throws
 */
package com.sist.exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// UpDown Game
public class MainClass_4 extends JFrame implements ActionListener{
	JTextField tf;
	JTextArea ta;
	JButton b1,b2;
	// 난수
	int com;
	
	public MainClass_4() {
		tf=new JTextField(10);
		// 비활성화,Start 버튼을 눌렀을시 활성화
		tf.setEnabled(false);
		ta=new JTextArea();
		// 수직,수평 스크롤 모두 적용
		JScrollPane js=new JScrollPane(ta);
		b1=new JButton("Start");
		b2=new JButton("Exit");
		
		// 윈도우 배치
		// 수평으로 묶는다
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		// frame에 배치
		add("North",p);
		add("Center",js);
		
		setSize(300,450);
		setVisible(true);
		
		// 버튼 클릭시에 => actionPerformed 호출
		// this => 해당 객체에 구현했기때문
		b1.addActionListener(this);
		b2.addActionListener(this);
		// 엔터 처리
		tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new MainClass_4();
	}
	
	// 버튼 처리,엔터 처리
	// 콜백,버튼을 눌렀을때마다 호출
	@Override
	public void actionPerformed(ActionEvent e) {
		// e => 클릭한 버튼
		if(e.getSource()==b1) {
			com=(int)(Math.random()*100)+1;
			b1.setEnabled(false);
			tf.setEnabled(true);
			// 해당 객체에 포커스 적용
			tf.requestFocus();
			// TextArea에 문자열 출력
			ta.append("게임을 시작합니다\n");
			
		}
		if(e.getSource()==b2) {
			// 윈도우의 메모리 회수
			dispose();
			System.exit(0);
		}
		if(e.getSource()==tf) {
			try {
				// 정상적으로 수행
				// TextField에 입력한 값
				String num=tf.getText();
				// 정수로 변환
				int user=Integer.parseInt(num);
				if(user<1 || user>100) {
					ta.append("1~100까지 입력이 가능합니다\n");
				}else {
					if(com>user) {
						ta.append("입력값보다 큰 값을 입력하세요\n");
					}else if(com<user) {
						ta.append("입력값보다 작은 값을 입력하세요\n");
					}else {
						ta.append("Game Over!!\n");
						tf.setText("");
						b1.setEnabled(true);
						tf.setEnabled(false);
					}
				}
				tf.setText("");
			} catch (NumberFormatException e2) {
				// 정수 변환 에러 처리
				// 메시지박스
				JOptionPane.showMessageDialog(this, "1~100까지 정수만 입력하세요");
				// TextField 공백으로 처리
				tf.setText("");
				tf.requestFocus();
			}
		}
	}
}
