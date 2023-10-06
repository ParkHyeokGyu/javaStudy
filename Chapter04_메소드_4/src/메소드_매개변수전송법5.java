
public class 메소드_매개변수전송법5 {
	static void swap(int[] arr) {
		System.out.println("arr="+arr);
		System.out.println("변경전:swap=>arr[0]="+arr[0]+",arr[1]="+arr[1]);
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("변경후:swap=>arr[0]="+arr[0]+",arr[1]="+arr[1]);
	}
	public static void main(String[] args) {
		int[] temp= {10,20};
		System.out.println("temp="+temp);
		System.out.println("변경전:main=>temp[0]="+temp[0]+",arr[1]="+temp[1]);
		swap(temp);
		System.out.println("변경후:main=>temp[0]="+temp[0]+",arr[1]="+temp[1]);
	}
}
