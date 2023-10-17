package com.sist.client;
import javax.swing.*;
public class MyWindow {
	JFrame fr=new JFrame();
	public MyWindow() {
		fr.setSize(800,600);
		fr.setVisible(true);
	}
	public static void main(String[] args) {
		new MyWindow();
	}
}
