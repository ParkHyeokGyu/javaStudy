import java.text.DecimalFormat;

class Movie2{
	int mno;
	String poster;
	String nameKr,nameEn;
	String regDate;
	String genre;
	String nation;
	String grade;
	String time;
	double score;
	int boxOffice;
	String subject,content;
}
class News{
	int nno;
	String poster;
	String title,subject;
	String date;
	String company;
}
class FoodCategory2{
	int cno;
	String poster;
	String title,subject;
}
class FoodHouse2{
	int fno;
	String name;
	double score;
	String address;
	String phone;
	String type;
	String price;
	String parking;
	String time;
	String menu;
}
class Recipe{
	int rno;
	String poster;
	String title;
	String user;
	int score;
	int hit;
	int showUser;
}
class Music{
	int music_no;
	int rank;
	String state; // 유지, 상승, 하강
				  //  -    ▲   ▼
	int idcrement; // 등폭
	String poster;
	String title;
	String artist;
	String album;
	int like;
}
class FoodPrice{
	int goods_no;
	int goods_discount;
	String goods_poster;
	String goods_name;
	int goods_price;
}
class Movie3{
	int mno;
	String poster;
	String title;
	String state;
	String genre;
	String date;
	String location;
	String actor;
	String grade;
	String time;
}
public class MainClass5 {
	public static void main(String[] args) {
		int like=323457;
		DecimalFormat df=new DecimalFormat("###,###");
		System.out.println("♡ "+df.format(like));
	}
}
