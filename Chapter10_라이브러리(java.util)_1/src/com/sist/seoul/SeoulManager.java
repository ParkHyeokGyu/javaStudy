package com.sist.seoul;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SeoulManager {
	private static Seoul[] seouls;
	private String path="C:\\javaDev\\";
	
	public Seoul[] seoulAllData(int num) {
		if(num==1) {
			path+="seoul_location.txt";
		}else {
			path+="seoul_nature.txt";
		}
		
		FileReader fr=null;
		try {
			fr=new FileReader(path);
			StringBuffer data=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				data.append((char)i);
			}
			String[] seoul_data=data.toString().split("\n");
			seouls=new Seoul[seoul_data.length];
			i=0;
			StringTokenizer st=null;
			for(String sd:seoul_data) {
				seouls[i]=new Seoul();
				st=new StringTokenizer(sd, "|");
				String rank=st.nextToken();
				rank=rank.replaceAll("\\uFEFF", "");
				seouls[i].setNo(Integer.parseInt(rank));
				seouls[i].setName(st.nextToken());
				seouls[i].setContent(st.nextToken());
				seouls[i].setLoc(st.nextToken());
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return seouls;
	}
}
