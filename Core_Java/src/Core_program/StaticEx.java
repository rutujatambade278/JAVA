package Demo;

public class StaticEx {
	
	int id;
	String name;
	static String collage="Dy";
	
	StaticEx(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		
		System.out.println(id+" "+name+" "+collage
				);
	}

	public static void main(String[] args) {
		
		StaticEx s=new StaticEx(11,"rutuja");
		
		StaticEx s1=new StaticEx(12,"Neha");
		
		s.display();
		s1.display();
	}

}
