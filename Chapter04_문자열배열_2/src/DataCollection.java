import java.io.FileReader;

public class DataCollection {
	static String fileReadData(String path) {
		String seoulData="";
		try {
			FileReader fr=new FileReader("C:\\javaDev\\"+path);
			int i=0;
			StringBuffer data=new StringBuffer();
			while((i=fr.read())!=-1) {
				data.append((char)i);
			}
			fr.close();
			seoulData=data.toString();
		} catch (Exception e) {
			
		}
		return seoulData;
	}
}
