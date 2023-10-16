package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MelonMusicSystem extends GenieMusicSystem{
	protected String title="멜론 Top50";
	
	// protected Music[] musics=new Music[50];
	// Music[] musicAllData()
	// Music[] musicTitleFindData(String title)
	// Music[] musicSingerFindData(String singer)
	// Music musicDetailData(int mno)
	// 상속 제외 => 초기화 블록,static,생성자,private
	{
		try {
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			// 노래 제목
			Elements title=doc.select("div.wrap_song_info div.rank01");
			// 가수명
			Elements singer=doc.select("div.wrap_song_info div.rank02 span.checkEllipsis");
			// 앨범
			Elements album=doc.select("div.wrap_song_info div.rank03");
			
			for(int i=0;i<musics.length;i++) {
				musics[i]=new Music();
				musics[i].setMno(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
			}
		} catch (Exception e) {}
	}
}
