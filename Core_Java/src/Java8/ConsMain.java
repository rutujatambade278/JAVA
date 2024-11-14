package Java8;

import Core_program.Student;

public class ConsMain {

	public static void main(String[] args) {
		
		
		Provide provider= ()->{
			return new Student(null, null);
		};

	}

}
