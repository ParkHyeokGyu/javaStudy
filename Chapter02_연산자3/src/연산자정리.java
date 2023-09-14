
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;

public class 연산자정리 {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String fd=sc.next();
		
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title=doc.select("a.title");
		Elements artist=doc.select("a.artist");
		for(int i=0;i<50;i++) {
			if(title.get(i).text().contains(fd)) {
				System.out.println(title.get(i).text()
						+"("+artist.get(i).text()+")"
				);
			}
		}
	}
}
