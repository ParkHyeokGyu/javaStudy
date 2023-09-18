// 12,1,2 => 겨울, 3,4,5 => 봄, 6,7,8 => 여름, 9,10,11 => 가을
// case 값이 동일할 수 없다
// case 값에 실수를 사용할 수 없다
// case 값:
// case문장을 수행하고 종료시에는 반두시 break문 사용
// case순서는 상관이 없다
/*
	switch(정수){
	default:
		break;
	case 3:
	case 1:
		break;
	case 2:  
	}
 */
public class 선택문_3 {
	public static void main(String[] args) {
		// 정수 임의 출력 => random()
		int month=(int)(Math.random()*12)+1;
		System.out.println("입력된 달:"+month);
		
		switch(month) {
		case 12:
		case 1: // if(month==12||month==1||month==2)
		case 2:
			System.out.println("겨울");
			break;
		case 3:case 4:case 5:
			System.out.println("봄");
			break;
		case 6:case 7:case 8:
			System.out.println("여름");
			break;
		case 9:case 10:case 11:
			System.out.println("가을");
			break;
		}
	}
}
