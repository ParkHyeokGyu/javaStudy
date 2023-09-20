
public class 문제1_2_3 {
	public static void main(String[] args) {
//		1.  int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)
		int x=11;
		if(x>10&&x<20) {
			System.out.println(x+"는 10보다 크고 20보다 작다");
		}
//		2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
		char ch=' ';
		if(ch==' '&&ch!='\t') {
			System.out.println(ch+"는 공백이고 탭이 아니다");
		}
//		3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성
		ch='x';
		if(ch=='x'||ch=='X') {
			System.out.println(ch+"는 'x' 또는 'X'이다");
		}
	}
}
