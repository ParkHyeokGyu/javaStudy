import java.util.Scanner;
// startsWith.endsWith,contains => 검색,자동완성
public class 문자열7 {
	public static void main(String[] args) {
		String[] data= {
			"Java와 JSP",
			"Java와 Oracle",
			"Oracle Programming",
			"JQuery AND AJAX",
			"Spring AND Java"
		};
		Scanner sc=new Scanner(System.in);
		System.out.print("검색어 입력:");
		// String findData=sc.next();
		// next() => 공백을 포함하지 못한다, 공백 전까지 출력
		String findData=sc.nextLine();
		System.out.println(findData);
		for(int i=0;i<data.length;i++) {
			if(data[i].contains(findData)) {
//			if(data[i].endsWith(findData)) {
//			if(data[i].startsWith(findData)) {
				try {
					Thread.sleep(1000); // 1초후 출력
				} catch (Exception ex) {
					
				}
				System.out.println(data[i]);
			}
		}
	}
}
