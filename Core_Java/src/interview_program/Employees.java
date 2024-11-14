package interview_program;

public class Employees {
 
	    private int id;
	    private String name;
	    private int age;
	    private long salary;
	    private String department;

	   
	    public Employees(int id, String name, int age, long salary, String department) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.department = department;
		}


		public long getSalary() {
	        return salary;
	    }

	    // other getters and setters can be added here
	}
