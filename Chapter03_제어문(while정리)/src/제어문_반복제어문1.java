/*
	break : 반복 중단(반복문,switch)
			게임 => ESC
	continue : 특정부분을 제외
	--------------------- 반복문에서만 사용 가능
	제어영역 => 자신의 반복문만 제어할 수 있다
	for(){
		for(){
			break; => 2차 for문 제어
		}
		break; => 1차 for문 제어
	}
	
	outer:for(){
		for(){
			break outer; => 2차 for문 제어와 동시에 이름이 있는 반복문 제어
		}
	}
 */
public class 제어문_반복제어문1 {
	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			if(i==3) {
//				break;
//			}
//			System.out.println("i="+i);
//		}

//		for(int i=1;i<=10;i++) {
//			if(i%2==0) {
//				continue;
//			}
//			System.out.println("i="+i);
//		}
		
		/*
			break => for,while 동일
			continue
				for => 증가식
				while => 조건식
					무한루프에 빠질 수 있다
		 */
		
		int i=1;
		while(i<=10) {
			if(i==3) {
				break;
			}
			System.out.println("i="+i);
			i++;
		}
		
		i=1;
		while(i<=10) {
			if(i==3) {
				// i=1,i=2,i=3
				// i가 3일 경우 조건식으로 이동 => 무한루프
				continue;
			}
			System.out.println("i="+i);
			i++;
		}
		
//		outer:for(;;) {
//			System.out.println("break전");
//			for(;;) {
//				break outer;
//			}
//			System.out.println("break후");
//		}
	}
}
