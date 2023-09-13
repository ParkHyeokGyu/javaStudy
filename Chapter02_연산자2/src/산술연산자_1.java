// % => 배수,화폐매수 구하기
public class 산술연산자_1 {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(-a+"%"+b+"="+(-a%b));
		System.out.println(a+"%"+-b+"="+(a%-b));
		System.out.println(-a+"%"+-b+"="+(-a%-b));
		
		System.out.println("===================");
		
		int c=369;
		// 백단위 : 3, 십단위 : 6, 단단위 : 9
		int h=c/100;
		int t=(c%100)/10;
		int i=c%10;
		System.out.println(h+","+t+","+i);
	}

}
