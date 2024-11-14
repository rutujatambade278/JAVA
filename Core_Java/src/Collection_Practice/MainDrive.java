package Collection_Practice;

import bean.Student;

public class MainDrive {
public static void main(String[] args) {
	Student stu=new Student();
	stu.setId(101);
	stu.setName("Ram");
	stu.setFees(1000);
	Student stu2=new Student(102,"Chetan",20000);
	Student stu3=new Student(102,"rutuja",20000);
	Student stu4=new Student(104,"Neha",30000);
	
	StudentService ss=new StudentService_Impl();
	ss.inserData(stu);
	ss.inserData(stu2);
	ss.inserData(stu4);
	ss.FindData();
	//ss.UpdateData(stu2);
	ss.deleteData(1);
	
	
	//System.out.println(ss.displayData());
	//System.out.println(" Before update");
	//System.out.println(ss.UpdateData(stu3));
	//System.out.println(ss.deleteData(1));
	


}
}
