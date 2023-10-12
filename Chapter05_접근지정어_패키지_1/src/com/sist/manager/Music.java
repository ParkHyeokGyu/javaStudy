package com.sist.manager;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Music {
	private int mno;
	private String title;
	/*
	 		public void setTitle(Stirng title){
	 			this.title=title;
	 		}
	 */
	private String singer;
	private String album;
	private int idcrement;
	private String state;
	// 은닉화
	// 변수 => 메모리에 저장 / 메모리에서 데이터 읽기
	// 읽기 / 쓰기 => getter / setter
}
