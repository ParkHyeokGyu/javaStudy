package com.sist.main;

import com.sist.manager.Music;
import com.sist.manager.MusicSystem;

public class MainClass {
	public static void main(String[] args) {
		MusicSystem ms=new MusicSystem();
		
		for(Music m:ms.getMusics()) {
			System.out.println(m.getMno()+"."+m.getTitle());
		}
	}
}
