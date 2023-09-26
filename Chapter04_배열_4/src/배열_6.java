import java.util.Arrays;

public class 배열_6 {
	public static void main(String[] args) {
		char[] arr=new char[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(char)((Math.random()*26)+'A');
		}
		System.out.println(Arrays.toString(arr));
		
		// 버블
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// 선택
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
