/*
 * ** 변수는 1개만 저장하는 공간
 * 	  --- 많은 경우에는 ㅈ변수를 제어하기 어렵다
 * 	  --- 보완 : 한개의 이름으로 여러개의 변수를 제어
 * 			   --------- 배열명 => 인덱스 번호로 제어
 * 1. 배열 : 여러개의 변수를 하나로 묶어서 관리하는 역할
 * 			1차원 배열/2차원 배열...다차원 배열,가변배열
 * 			-------- 웹에서는 1차원만 사용
 * 		장점 : 한개의 변수명으로 모아서 관리하기때문에 반복문 사용이 쉽다
 * 			  연속적인 메모리 구조 => 인덱스번호를 이용한다
 * 		단점 : 고정적이다 => 한번 메모리에 할당하게 되면 변경하기 어렵다
 * 						기존의 배열보다 크게 배열을 만들어 처리해야 한다
 * 						보완 : 컬렉션(가변형)
 * 			  같은 데이터형만 모아서 관리
 * -------------------------------------------------------------
		선언
			데이터형[] 배열명;
			데이터형 배열명[];
			
		초기값
			생성과 동시에 초기화
				int[] arr={1,2,3,4,5};
			자동 초기화
				int[] arr=new int[5];
				---------------------
				int => 0
				double => 0.0
				float => 0.0f
				long => 0l
				boolean => false
				char => '\u0000' => null
						'\0'
				String => null
						  ---- 주소가 없는 경우
						  NullPointerException
			메모리 주소
				int[] arr={1,2,3,4,5};
				---------
				
				Stack(주소)		Heap(실제 데이터 저장)
				arr
				---				-------------------------
			   0x100				1	2	3	4	5
				---				|-----|---|--------------
						   	  0x100	0x104 0x108 .....
						   	  arr[0] arr[1] arr[2] .....
						  	  연속적인 메모리의 시작 주소
						  	  arr[index]
						  	  --- ------ 연속적으로 배치
						  	  배열명
						  	  
						  	  인덱스번호는 0번부터 시작
						  	  순차적으로 되어있다
						  	  배열의 인덱스를 추가하거나 삭제 => 불가능
						  	  주의점 : 인덱스 초과시 에러 발생
						  	  	int[] arr=new int[5];
						  	  	arr[5]=100 => 에러 발생
						  	  	갯수 => length
						  	  	
			각 데이터형별 생성
			int[] arr
			double[] arr
			char[] arr
			boolean[] arr
			String[] arr
			
			변수) 읽기, 수정, 저장
			int a=10; 저장
			a=20; 수정
			System.out.println(a); 읽기
			
			배열) 읽기, 수정, 저장
			int[] arr=new int[5];
			arr[인덱스번호]=10;
			---------------
			arr[0]=10; arr[1]=20;
			Systemout.println(arr[0]);
			Systemout.println(arr);
							 ----- 주소값만 출력
			
		활용
			값을 변경, 수정 => 일반 for
				int[] arr=new int[5];
				for(int i=0;i<arr.length;i++){
					arr[i]=i;
				} => 인덱스 번호를 이용
				
			값을 출력 => for-each
				코드가 간결하다, 처리속도가 빠르다
				for(int a:arr){
					
				} => 인덱스 번호가 아니라 실제 저장된 값을 이용
		
 */
public class 배열_1 {
	public static void main(String[] args) {
		// 정수 5개
		int[] arr=new int[1000];
		arr[0]=100;
		arr[3]=400;
		// 출력
		System.out.println("=== 일반 for ===");
		long s=System.currentTimeMillis(); // 시작 시간
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		long e=System.currentTimeMillis(); // 끝난 시간
		System.out.println("\n걸린 시간:"+(e-s));
		
		System.out.println("=== for-each ===");
		s=System.currentTimeMillis(); // 시작 시간
		for(int i:arr) {
			System.out.print(i);
		}
		e=System.currentTimeMillis(); // 끝난 시간
		System.out.println("\n걸린 시간:"+(e-s));
	}
}
