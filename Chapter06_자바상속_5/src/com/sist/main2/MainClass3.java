package com.sist.main2;
class Super{
	
}
class Sub extends Super{
	
}
// NullPointerException, ClassCastException
public class MainClass3 {
	static String str;
	public static void main(String[] args) {
		Super s=new Sub();
//		Sub ss=(Sub)new Super(); // ClassCastException
//		Sub ss=(Sub)s;
//		
//		Super sss=new Super();
//		Sub ssss=(Sub)sss;
		str.charAt(0); // NullPointerException
	}
}
