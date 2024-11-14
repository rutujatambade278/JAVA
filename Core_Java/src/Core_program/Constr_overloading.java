package Demo;

public class Constr_overloading {
	
	int id;
	String Name;
	int Age;
	
	Constr_overloading(int i,String N){
		id=i;
		Name=N;
	}
	
	Constr_overloading(int i,String N,int a){
		id=i;
		Name=N;
		Age=a;
	}
	void display() {
		System.out.println(id+" "+Name +" "+Age);
	}
	

	public static void main(String[] args) {
		
		Constr_overloading  overloading=new Constr_overloading(11,"rutuja");
		Constr_overloading  overloading1=new Constr_overloading(11,"Neha",23);
		
		overloading.display();
		overloading1.display();
		
		
	}

}
