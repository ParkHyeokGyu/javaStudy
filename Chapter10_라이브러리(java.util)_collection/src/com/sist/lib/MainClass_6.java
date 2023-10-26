package com.sist.lib;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

// 멜론 : 곡명, 지니 뮤직 : 곡명 비교 => 중복이 안된 노래만 추출
// 공통/차집합/교집합/합집합
public class MainClass_6 {
	public static Set<String> genieMusic() {
		Set<String> set=new HashSet<String>();
		try {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			for(int i=0;i<title.size();i++) {
				set.add(title.get(i).text());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return set;
	}
	
	public static Set<String> melonMusic() {
		Set<String> set=new HashSet<String>();
		try {
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0;i<title.size();i++) {
				set.add(title.get(i).text());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return set;
	}
	
	public static void main(String[] args) {
		System.out.println("==========Genie Music==========");
		Set<String> genie=genieMusic();
		for(String title:genie) {
			System.out.println(title);
		}
		System.out.println("==========Melon Music==========");
		Set<String> melon=melonMusic();
		for(String title:melon) {
			System.out.println(title);
		}
		
		// 차집합 => removeAll()
		// [1,2,3,4,5]-[1,2,3,6,7]=[4,5]
//		System.out.println("==========지니뮤직에만 있는 노래==========");
//		genie.removeAll(melon);
//		for(String title:genie) {
//			System.out.println(title);
//		}
		
		// 교집합 => retainAll()
//		System.out.println("==========지니뮤직과 멜론의 동일한 노래==========");
//		genie.retainAll(melon);
//		System.out.println("곡수:"+genie.size());
//		for(String title:genie) {
//			System.out.println(title);
//		}
		
		// 합집합 => set으로 받을 시 중복된 데이터는 제거된다
		// 장바구니 => 동일상품 관계없이 처리
		System.out.println("==========지니뮤직+멜론(List)==========");
		List<String> list=new ArrayList<String>();
		list.addAll(genie);
		list.addAll(melon);
		// UNION ALL => 중복된 데이터도 포함
		System.out.println("곡수:"+list.size());
		for(String title:list) {
			System.out.println(title);
		}
		
		System.out.println("==========지니뮤직+멜론(Set)==========");
		Set<String> hap=new HashSet<String>();
		hap.addAll(genie);
		hap.addAll(melon);
		// UNION => 중복된 데이터는 미포함
		System.out.println("곡수:"+hap.size());
		for(String title:hap) {
			System.out.println(title);
		}
	}
}
