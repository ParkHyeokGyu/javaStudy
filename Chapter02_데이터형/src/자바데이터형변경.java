
public class 자바데이터형변경 {

	public static void main(String[] args) {
		int _int=(int)100.0; // int로 형변환시 소수점 이하 제거
		byte _byte=(byte)300; // 허용범위를 벗어난 값을 강제 형변환시 값이 바뀐다
		
		System.out.println("_int:"+_int);
		System.out.println("_byte:"+_byte);
		System.out.println(0b00101100); // 2진법을 10진법으로 바꿀때 => 앞에 0b를 붙인다
		
	}

}
