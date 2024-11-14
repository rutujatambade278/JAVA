package Collection_Practice;

import java.util.ArrayList;

import bean.Student;

public interface StudentService {
public String inserData(Student stu);
public ArrayList<Student> displayData();
public ArrayList<Student>UpdateData(Student stu);
public ArrayList<Student>deleteData(int id);
public Student FindData();
public Student FindById();

}
