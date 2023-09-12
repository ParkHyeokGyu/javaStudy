// 가장 기본이 되는 연산자 : 산술연산자
/*
 *	산술연산자 : +, -, *, /, %(나눈 나머지 값)
 *		이항연산자(피연산자(연산 대상) 2개)
 */
public class 산술연산자 {

	public static void main(String[] args) {
		// +
		// 국어,영어,수학 점수의 총점을 구한다
		int kor=55;
		int eng=12;
		int math=76;
		int total=kor+eng+math;
		double avg=total/3.0; // 3으로 나눌 경우 => total(int), 3(int) => 소수점 이하 제거
		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		System.out.printf("평균:%.2f\n",avg);
		
		System.out.println("========= % =========");
		int a=5;
		int b=2;
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(-a+"%"+b+"="+(-a%b));
		System.out.println(a+"%"+-b+"="+(a%-b));
		System.out.println(-a+"%"+-b+"="+(-a%-b));
		
		System.out.println("========= 형변환 =========");
		/*
		 *	자동형변환
		 *		작은 데이터형 => 큰 데이터형
		 *	강제형변환
		 *		큰 데이터형 => 작은 데이터형
		 *		(데이터형)값
		 *		
		 *			==========> 자동형변환
		 *		byte < char < int < long < float < double
		 *			<========== 강제형변환
		 */
		int aa='A';
		System.out.println("aa:"+aa);
		double dd=100;
		System.out.println("dd:"+dd);
		
		System.out.println(100+10.5+10.5F+'A'); // 결과값의 데이터형은 double
						// 100.0	10.5   65.0
						// 연산은 같은 데이터형끼리만 연산
		System.out.println('A'+'B'); // int형 이하(byte,char,short)의 연산결과는 int형
	}

}
