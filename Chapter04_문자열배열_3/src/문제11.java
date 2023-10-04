import java.util.Arrays;

public class 문제11 {
	public static void main(String[] args) {
//		3명의 학생에 대한 국어,영어,수학 점수를 입력받아서 저장후에 
//		총점,평균,등수를 구하고 국어점수 총점,영어점수 총점,수학점수의 총점을 구해서 
//		출력하는 프로그램을 작성하시오
		final int student=3;
		int[] kor=new int[student];
		int[] eng=new int[student];
		int[] math=new int[student];
		int[] tot=new int[student];
		int[] rank=new int[student];
		double[] avg=new double[student];
		
		for(int i=0;i<student;i++) {
			kor[i]=(int)(Math.random()*50)+50;
			eng[i]=(int)(Math.random()*50)+50;
			math[i]=(int)(Math.random()*50)+50;
			tot[i]=kor[i]+eng[i]+math[i];
			avg[i]=tot[i]/(double)student;
		}
		System.out.println(Arrays.toString(tot));
		
		for(int i=0;i<student;i++) {
			rank[i]=1;
			for(int j=0;i<student;j++) {
				if(tot[i]<tot[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));
	}
}
