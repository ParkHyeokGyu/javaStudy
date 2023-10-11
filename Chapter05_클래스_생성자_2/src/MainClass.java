/*
 		데이터형
 			기본형
 			참조형 => 배열,클래스
 		클래스
 			데이터만 모아서 관리
 				초기화
 					명시적 초기화
 					초기화 블록
 					생성자
 					
 			메소드만 모아서 관리
 		
 		1) 클래스의 구성
 			class ClassName{
 				------------------------
 				데이터 저장 공간 : 멤버변수 => 프로그램 종료시까지 유지
 										다른 클래스에서도 사용이 가능
 							  1) 인스턴스 변수 => new연산자를 이용해서 메모리에 저장
 							  				  메모리에 따로 공간을 만들어 저장된다
 									데이터형 변수명;
 							  2) 공유 변수 => 컴파일시 메모리에 올라간다
 							  			   메모리 공간을 1개만 사용한다
 									static 데이터형 변수명;
 				------------------------
 				생성자 : 변수에 대한 초기화
 					   클래스 영역에서는 선언만 가능하다
 					   
 					   특징
 					   1) 클래스명과 동일
 					   2) 리턴형이 없다 => void는 리턴형이다
 					   3) 여러개를 사용할 수 있다
 					   4) 같은 이름으로 여러개 사용 => 오버로딩(중복함수 정의)
 					   		메소드명이 동일하다
 					   		리턴형은 관계가 없다
 					   		
 					   		매개변수의 갯수나 데이터형이 다르다
 					   		A()						A()
 					   		A(int a,int b)			A(int,int)
 					   		A(String s,double d)	A(String,double)
 					   		A(int c,int d) => X 	A(int,int)
 					   
 					   사용처
 					   1) 오라클 연동
 					   2) 윈도우 초기화 => 시작과 레이아웃 처리
 					   3) 서버연결,구동
 					   
 				생성자를 사용하지 않고 초기화하는 방법
 					인스턴스 블록
 					{
 						구현 => 변수의 초기화
 					}
 					
 					정적 블록
 					static{
 						구현 => static에 대한 초기화
 					}
 					
 					예)
 						class A{
 							int[] arr=new int[5];
 							A(){
 							
 							}
 						}
 						A a=new A(); => arr저장
 						
 						class A{
 							static int[] arr=new int[5];
 							static{
 								초기화 => 자동
 							}
 						}
 						A.arr
 				------------------------
 				멤버메소드
 					static 메소드 => 메모리 1개만 생성
 					static 리턴형 메소드(매개변수){
 					
 					}
 					
 					인스턴스 메소드 => 메모리에 따로 생성
 					리턴형 메소드(매개변수){
 					
 					}
 					
 					class A{
 						int a;
 						int b;
 						void display(){
 						
 						}
 					}
 					A aa=new A();
 					
 					-----aa-----
 						----
 						 a
 						----
 						 b
 						----
 						 display()
 						----
 					------------	
 					
 				------------------------
 			}
 */
/*
 		메소드 : 인스턴스 메소드 => new를 이용해 메모리에 저장할때마다 생성
 			   ----------- 객체 생성마다 따로 작동
 			   호출 => 객체명.메소드()
 		
 		형식
 			리턴형 메소드명(매개변수목록){ => 선언부
 				구현부
 			}
 			
 			리턴형	요청에 대한 결과값(1개만 사용 가능)
 					여러개인 경우 : 클래스/배열
 					리턴형이 없을때 : void
 			
 			메소드명	알파벳이나 한글로 시작
 					숫자를 사용할 수 있다(단 앞에 사용 금지)
 					키워드는 사용할 수 없다
 					---- 클래스명,메소드명은 키워드가 아니다
 					공백이 있으면 안된다
 					특수문자 사용 => _,&
 					
 					약속)
 					소문자로 시작한다,두번째 단어의 첫자는 대문자
 					
 					*** 소프트웨어 이행
 							한글에 문제가 생긴다
 							가급적이면 영문사용 권장
 							윈도우 개발 => 서버 리눅스 사용
 							Full Stack => AWS(PaaS)
 							=> STS : Java11
 							   tomact : 9
 							   spring-boot : 2.7.4
 							
 			매개변수	사용자가 보내준 값
 					여러개가 있을 수 있다
 						3개 이상일 시, 클래스나 배열로 묶는다
 			
 			void 메소드명(){
 				return;	=> 생략가능, 컴파일러에 의해 자동으로 추가
 						   메소드의 종료 : 원하는 위치에서 설정할 수 있다
 			}
 			
 			void 메소드명(){
 				if(){
 					return;
 				}else{
 					return;
 				}
 			}
 			호출 : 메소드명();
 			
 			int 메소드명(){
 				return 정수값; => 메소드의 리턴형과 리턴값은 데이터형이 일치해야한다
 								리턴값을 받는 변수의 데이터형은 리턴형의 데이터형과 같거나 크다
 			}
 			호출 : int a=메소드명();
 			
 			int[] 메소드명(){
 				int[] arr=new int[5];
 				return arr;
 			}
 			호출 : int[] arr=메소드명();
 			
 			A 메소드명(){
 				A a=a A();
 				return a;
 			}
 			호출 : A a=메소드명();
 			
 			메소드의 사용목적
 			1) 반복제거
 			2) 재사용
 			3) 유지보수가 용이 => 구조적인 프로그램
 			
 			프로그램 기획
 				벤치마킹/요구사항 분석
 				
 				예)
 					숫자 야구 게임
 						컴퓨터가 난수를 발생	com[]
 						사용자의 입력		user[]
 						비교				com[] user[]
 						힌트				user[] s b
 						종료				s
 						
 						멤버변수
 							com[] user[] s
 						
 */
import java.util.*;

class User{
	// 5개의 난수를 발생 => 정렬 => 출력
	int[] arr=new int[5];
	
	User() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬전:");
		System.out.println(Arrays.toString(arr));
	}
	
	void sort() {
//		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	void print() {
		System.out.println("정렬후:");
		System.out.println(Arrays.toString(arr));
	}
}
public class MainClass {
	public static void main(String[] args) {
		User u=new User();
		u.sort();
		u.print();
	}
}
