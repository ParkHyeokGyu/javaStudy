package com.sist.student;
import java.util.*;
/*
 	클래스
 	1)데이터 => 오라클의 column과 동일
 	  -------------------------
 	  데이터형을 만든다
 	  => Music => 가수명,제목,앨범...
 	  => Movie => 제목,감독,출연...
 	  ------------------------- 캡슐화 => 읽기/쓰기 기능 추가
 	2)사용자 요청 => 기능
 	  -------- 목록출력,상세보기,찾기,예매,추천...
 	  => 상속,포함,오버라이딩 방식을 사용
 	3)데이터가 여러개일 경우 => 모아서 관리
 	  => 컬렉션,배열
 	      |   --- 고정적
 	      | 계속 갱신,추가 => 가변형
 	  => 배열 대신 컬렉션을 이용해서 처리하면 편리하다
 	            -----
 	            List => 중복허용,순서(인덱스)
 	             |
 	            ArrayList => 비동기,데이터베이스 프로그램 특성화
 	            => 읽기 기능 => get()
 	            => 총 갯수 => size()
 	            => 추가 => add()
 	            => 수정 => 오라클에서 수정,삭제,추가
 */
public class StudentManager {
	private static ArrayList<Student> list=new ArrayList<Student>();
	// 여러명 저장
	// 초기화 => 생성자
	public StudentManager() {
		list.add(new Student(1, "홍길동", 89, 79, 90));
		list.add(new Student(2, "심청이", 99, 45, 77));
		list.add(new Student(3, "춘향이", 12, 44, 77));
		list.add(new Student(4, "이순신", 100, 9, 0));
		list.add(new Student(5, "박문수", 10, 50, 100));
	}
	
	// 목록 출력
	public ArrayList<Student> studentAllData() {
		return list;
	}
	
	// 상세 보기
	public Student studentDetailData(int hakbun) {
		Student s=new Student();
		for(Student std:list) {
			if(std.getHakbun()==hakbun) {
				s=std;
				break;
			}
		}
		return s;
	}
	
	// 학번의 중복을 피하기 위한 메소드
	// 자동 증가 => sequence
	// CREATE SEQUENCE(오라클)
	// auto_increament()(MySQL)
	public int hakbunMaxData() {
		int max=0;
		for(Student std:list) {
			if(max<std.getHakbun()) {
				max=std.getHakbun();
			}
		}
		return max+1;
	}
	
	// 추가나 수정은 매개변수가 많다(클래스로 전송)
	// 학생 추가 => add
	public void studentInsert(Student std) {
		list.add(std);
		System.out.println("학생 추가 완료");
	}
	
	// 학생 수정 => set
	public void studentUpdate(Student std) {
		int index=0;
		for(int i=0;i<list.size();i++) {
			Student s=list.get(i);
			if(s.getHakbun()==std.getHakbun()) {
				index=i;
				break;
			}
		}
		list.set(index, std);
		System.out.println("수정 완료");
	}
	
	// 학생 삭제 => remove
	public void studentDelete(int hakbun) {
		for(int i=0;i<list.size();i++) {
			Student s=list.get(i);
			if(s.getHakbun()==hakbun) {
				list.remove(i);
				System.out.println(hakbun+"학번을 삭제하였습니다");
				break;
			}
		}
	}
	
	// 학생 찾기 => contains
	public ArrayList<Student> studentFindData(String name){
		ArrayList<Student> arr=new ArrayList<Student>();
		for(Student std:list) {
			if(std.getName().contains(name)) {
				arr.add(std);
			}
		}
		return arr;
	}
}
