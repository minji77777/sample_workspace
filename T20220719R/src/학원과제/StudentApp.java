package 학원과제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	
		


	List<Student> list = new ArrayList<Student>();
	
	Scanner scn = new Scanner(System.in);

	boolean run = true;
	
	public void execute() {
	while(run) {
		System.out.println("1.등록 2.수정 3.리스트 9.종료");
		System.out.println("선택 > ");
		int selectNum = Integer.parseInt(scn.nextLine());
		
//		System.out.println("1.고등학생  2.대학생");
//		System.out.println("선택 > ");
//		int choose = Integer.parseInt(scn.nextLine());
//		
//		System.out.println("학생 번호 > ");
//		String studNo = scn.nextLine();
//		
//		System.out.println("학생 이름 > ");
//		String studName = scn.nextLine();
//		
//		System.out.println("점수 > ");
//		int score = Integer.parseInt(scn.nextLine());
		
		if(selectNum == 1) { //등록
			
			System.out.println("1.고등학생  2.대학생");
			System.out.println("선택 > ");
			int choose = Integer.parseInt(scn.nextLine());
		
			System.out.println("학생 번호 > ");
			String studNo = scn.nextLine();
			
			System.out.println("학생 이름 > ");
			String studName = scn.nextLine();
			
			System.out.println("점수 > ");
			int score = Integer.parseInt(scn.nextLine());
		
			if(choose == 1) {
				
				System.out.println("담임교사 >  ");
				String teacher = scn.nextLine();
				System.out.println("학년 정보> ");
				String grade = scn.nextLine();
				
			addStudent(new HighStudent( studNo, studName,score,teacher,grade));
			}
			
			else if(choose == 2) {
				System.out.println("담당교수 > ");
				String prof = scn.nextLine();
				System.out.println("전공 정보 > ");
				String major = scn.nextLine();
				
				addStudent(new CollegeStudent(studNo,studName,score,prof,major));
			}
			
			
		}
		else if(selectNum == 2) {//수정
			
			System.out.println("수정할 점수 입력> ");
			int modScore =  scn.nextInt();
			
			modStudent(new Student(null,null,modScore));
			
			System.out.println("수정완료");
		}
		else if(selectNum == 3) { //전체 리스트
			for (int i = 0; i< list.size(); i++) {
				System.out.println(list.get(i).toString());
			}
//				if(student[i] != null) {
//					System.out.printf("학생 번호: %s,학생이름: %s, 점수: %s, 작성일시 %s, 조회수 %d\n",
//					boards[i].getTitle(), boards[i].getContent(), boards[i].getWriter(),boards[i].getCreatDate(),boards[i].getHitCount());
		}
		else if(selectNum == 9) { //종료
			System.out.println("프로그램 종료");
			break;
		}
	}
	
		
		
		

	
	}
	
	public void addStudent(Student student) {  //등록
		list.add(student);
		
	}
	public void modStudent(Student student) { //수정
		for(int i = 0; i< list.size(); i++) {
//			if(student.getStudNo() == list.get(i).getStudNo()) {
//				list.get(i).setScore(student.getScore());
			if (list.equals(list.get(i).getStudNo())) {
				list.get(i).setScore(i);
				
			}
		}
				
		}
		
	
	public void studentList() {
		System.out.println();
	}
	
	
		
		
		
	}

