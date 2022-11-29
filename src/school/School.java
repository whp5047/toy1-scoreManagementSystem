package school;

import java.util.ArrayList;

public class School {
	

	private static School instance = new School();	//학교는 하나이기 때문에 싱글톤패턴으로 구현
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	private School() {}
	
	public static School getInstance() {
		if( instance == null) {
			instance = new School();
			
		}
		return instance;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	
	public void addStudent(Student student) { // 학생 등록
		studentList.add(student);
	}
	
	public void addSubject(Subject Subject) { // 과목 추가
		subjectList.add(Subject);
	}
	

}
