/*
 	중복 없는 난수 발생
 	예약일, 예약시간
 */
public class 배열_4 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		// 1~10 중복 없이
		int su=0; // 난수 저장
		boolean bCheck=false; // 중복 여부 화인
		
		for(int i=0;i<arr.length;i++) {
			bCheck=true;
			// bCheck=true => 난수 중복, bCheck=false => 종료
			while(bCheck) {
				// 난수 발생
				su=(int)(Math.random()*10)+1;
				bCheck=false;
				// 비교 => arr에 저장된 값과 난수가 같은지 확인
				for(int j=0;j<i;j++) {
					if(arr[j]==su) { // 같은 수가 있는지 확인
						bCheck=true;
						break;
					}
				}
			}
			arr[i]=su;
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
