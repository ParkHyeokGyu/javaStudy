/*
 *	극어,영어,수학 점수를 받아서 총점과 평균을 구하는 프로그램을 작성
 *	총점과 평균을 구한 다음 학점을 출력하라
 */
public class 자바변수연습 {

	public static void main(String[] args) {
//		int 국어=0;
//		int 영어=0;
//		int 수학=0;
//		int 총점=0;
		int 국어=0,영어=0,수학=0,총점=0;
		double 평균=0;
		char 학점=' '; // '' => 애러(null) => ' ','A'(공백 혹은 값을 넣어준다)
		
		System.out.println("국어:"+국어);
		System.out.println("영어:"+영어);
		System.out.println("수학:"+수학);
		System.out.println("총점:"+총점);
		System.out.println("평균:"+평균);
	}

}
