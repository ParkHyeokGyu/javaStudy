/*
 		문자열
 		----
 		length() => 문자의 갯수
 		substring() => 문자 자르기
 		indexOf(),lastIndexOf() => 문자의 위치
 		contains() => 포함
 		startsWith()
 		valueOf() => 문자열로 변환
 		replace()
 		split()
 */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 문자열_1 {
	public static void main(String[] args) throws Exception{
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
//		System.out.println(doc.toString());
		Elements title=doc.select("table.list-wrap a.title");
		Elements singer=doc.select("table.list-wrap a.artist");
		Elements album=doc.select("table.list-wrap a.albumtitle");
		for(int i=0;i<title.size();i++) {
			System.out.println("순위:"+(i+1));
			System.out.println("곡명:"+title.get(i).text());
			System.out.println("가수명:"+singer.get(i).text());
			System.out.println("앨범:"+album.get(i).text());
			String msg=(i+1)+"|"+title.get(i).text()
					+"|"+singer.get(i).text()
					+"|"+album.get(i).text()
					+"|"+youtubeData(title.get(i).text())
					+"\r\n";
			System.out.println(msg);
			FileWriter fw=new FileWriter("C:\\javaDev\\genie.txt",true);
			fw.write(msg);
			fw.close();
		}
	}
	
	static String youtubeData(String title) {
		// 브라우저 1byte, 자바 2byte
		// encoder로 변환해야한다
		// https://www.youtube.com/results?search_query=%EB%B0%A9%ED%83%84%EC%86%8C%EB%85%84%EB%8B%A8
		String key="";
		try {
			String url="https://www.youtube.com/results?search_query="
					+URLEncoder.encode(title,"UTF-8");
			Document doc=Jsoup.connect(url).get();
			Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");
			Matcher m=p.matcher(doc.toString());
			while(m.find()) {
				String s=m.group();
				key=s.substring(s.indexOf("=")+1,s.indexOf("\""));
				break;
			}
		} catch (Exception e) {
			
		}
		return key;
	}
}
