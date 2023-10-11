import java.util.Arrays;

class A{
	// 클래스 영역에서는 선언만 가능하다
	static int[] arr=new int[5];
	A(){
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
}
public class MainClass4 {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(Arrays.toString(a.arr));
		
		A b=new A();
		System.out.println(Arrays.toString(b.arr));
		System.out.println(Arrays.toString(a.arr));
	}
}
