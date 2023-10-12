package com.sist.main;
import com.sist.util.User; // 다른 폴더에 있을시엔 import

public class MainClass {
	public static void main(String[] args) {
		User u=new User();
		MainClass2 m=new MainClass2(); // 같은 폴더에 있을시엔 import없이 접근 가능
	}
}
