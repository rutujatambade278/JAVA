package Collection_Practice;

import java.util.ArrayList;

import bean.Student;

public class StudentService_Impl implements StudentService{
public static ArrayList<Student> students=new ArrayList<>();
public StudentService_Impl() {
	
}
	@Override
	public String inserData(Student stu) {
		students.add(stu);
		return "Data insertd successfully";
	}
	@Override
	public ArrayList<Student> displayData() {
		// TODO Auto-generated method stub
		
		return students;
	}
	
	@Override
	public ArrayList<Student> UpdateData(Student stu) {
		students.add(stu);
	
		return students;
	}
	@Override
	public ArrayList<Student> deleteData(int id) {
		students.remove(id);
		return students;
	}
	@Override
	public Student FindData() {
		
		return students.get(1);
	}
	@Override
	public Student FindById() {
		
		return null;
	}

}
