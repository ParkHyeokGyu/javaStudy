package com.sist.exception;

public class MainClass_3 {
	public static void main(String[] args) {
		// 선택적인 부분 => 오류 발생 시 제외
//		try {
			for(int i=1;i<=10;i++) {
				try {
					int j=(int)(Math.random()*3);
					System.out.println("j="+j);
					System.out.println("i="+i+", i/j="+(i/j));
					// continue와 동일
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}
}
