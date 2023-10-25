package com.sist.music;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class UserMain extends JFrame implements ActionListener{
	JTextField tf;
	JButton b,b2;
	JTable table;
	DefaultTableModel model;
	
	// 포함 클래스
	// 변경하지 않고 있는 그대로 사용한다
	MusicManager mm=new MusicManager();
	
	public UserMain() {
		tf=new JTextField(10);
		b=new JButton("검색");
		b2=new JButton("목록");
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b);
		p.add(b2);
		
		String[] col= {"순위","곡명","가수명"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row, col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		add("North",p);
		add("Center",js);
		
		musicPrint();
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// this => 해당 클래스에서 구현한 actionPerformed를 찾는다
		b.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
	}
	
	public void musicPrint() {
		ArrayList<Music> list=mm.musicAllData();
		// 0부터 시작해서 출력한 갯수까지 지울시 버그? 있다고함
		// 거꾸로 지우기
		for(int i=model.getRowCount()-1;i>=0;i--) {
			model.removeRow(i);
		}
		
		for(Music m:list) {
			String[] data= {
					String.valueOf(m.getRank()),
					m.getTitle(),
					m.getSinger()
			};
			// 데이터 한 줄씩 추가
			model.addRow(data);
		}
	}
	
	public void musicFind(String title) {
		ArrayList<Music> list=mm.musicFindData(title);
		// 0부터 시작해서 출력한 갯수까지 지울시 버그? 있다고함
		// 거꾸로 지우기
		for(int i=model.getRowCount()-1;i>=0;i--) {
			model.removeRow(i);
		}
		
		for(Music m:list) {
			String[] data= {
					String.valueOf(m.getRank()),
					m.getTitle(),
					m.getSinger()
			};
			// 데이터 한 줄씩 추가
			model.addRow(data);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b || e.getSource()==tf) {
			String title=tf.getText();
			if(title.length()<1) {
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				tf.requestFocus();
				return;
			}
			musicFind(title);
		}else if(e.getSource()==b2) {
			musicPrint();
		}
	}
	
	public static void main(String[] args) {
		new UserMain();
	}
}
