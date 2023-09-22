import java.util.Arrays;

public class 문제 {
	public static void main(String[] args) {
//		1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
		char[] c=new char[10];
//		2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
		int[] n= {0,1,2,3,4,5};
//		3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
		char[] day= {'일', '월', '화', '수', '목', '금', '토'};
//		4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
		boolean[] bool= {true,false,false,true};
		
		char[] alpha= {'a','b','c','d'};
		for(int i=0;i<alpha.length;i++) {
			System.out.print(alpha[i]);
		}
		
		System.out.println();
		
//		양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		
		for(int i:arr) {
			if(i%3==0)
				System.out.print(i+"\t");
		}
		
		System.out.println();
		
//		정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라. 
		int[] arr2=new int[10];
		int sum=0;
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=(int)(Math.random()*10)+1;
			System.out.print(arr2[i]+"\t");
			sum+=arr[i];
		}
		System.out.println("\n합:"+sum);
		System.out.printf("평균:%.2f\n",(sum/(double)arr2.length));
		
//		5개 정수를 입력받은 후 차례로 출력하는 프로그램 
//		입력예) 5 10 9 3 2 출력예) 5 10 9 3 2
		int[] arr3=new int[5];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=(int)(Math.random()*10)+1;
			System.out.print(arr3[i]+"\t");
		}
		System.out.println();
		
//		문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
//		입력예) A B C D E F G H I J 출력예) ABCDEFGHIJ
		char[] alpha2=new char[10];
		for(int i=0;i<alpha2.length;i++) {
			alpha2[i]=(char)((Math.random()*26)+'A');
			System.out.print(alpha2[i]);
		}
		System.out.println();
		String chhh="A B C D F";
		String[] asdasd=chhh.split(" ");
//		System.out.println(Arrays.toString(asdasd));
		for(String str:asdasd)
			System.out.print(str);
		System.out.println();
		
		
//		정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
//		입력예) 5 3 9 6 8 4 2 8 10 1 출력예) 9 8 1
		int[] arr4=new int[10];
		for(int i=0;i<arr4.length;i++) {
			arr4[i]=(int)(Math.random()*10)+1;
			System.out.print(arr4[i]+"\t");
		}
		System.out.print("\n"+arr4[2]+" "+arr4[4]+" "+arr4[9]+"\n");
		
//		10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
//		입력예) 5 10 8 55 6 31 12 24 61 2 출력예) 61
		int[] arr5=new int[10];
		int max=1;
		for(int i=0;i<arr5.length;i++) {
			arr5[i]=(int)(Math.random()*100)+1;
			System.out.print(arr5[i]+"\t");
			if(max<arr5[i])
				max=arr5[i];
		}
		System.out.println("\n최대값:"+max);
		
//		10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총점과 평균을 구하여 출력하는 프로그램을 작성
		int[] arr6=new int[10];
		int sum2=0;
		for(int i=0;i<arr6.length;i++) {
			arr6[i]=(int)(Math.random()*100)+1;
			System.out.print(arr6[i]+"\t");
			sum2+=arr6[i];
		}
		System.out.println("\n총점:"+sum2);
		System.out.printf("평균:%.2f\n",(sum2/(double)arr6.length));
		
//		5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하는 프로그램 
//		출력예) 50 75 85 95 100
		int[] arr7= {95, 75, 85, 100, 50};
		for(int i:arr7)
			System.out.print(i+"\t");
		System.out.println();
//		Arrays.sort(arr7);
//		for(int i:arr7)
//			System.out.print(i+"\t");
		for(int i=0;i<arr7.length;i++) {
			for(int j=i+1;j)
		}
	}
}
