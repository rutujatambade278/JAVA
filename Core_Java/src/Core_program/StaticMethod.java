package Demo;

public class StaticMethod {
	
	int id;
	String Name;
	static  String Collage="Dy";
	
	static void change() {
		Collage="pvg";
	}
	
	StaticMethod( int i,String N) {
		
		id=i;
		Name=N;
		
	}
     void Dispaly() {
    	 System.out.println(id+" "+Name+" "+Collage);
     }
	public static void main(String[] args) {
		
		StaticMethod.change();
		StaticMethod s=new StaticMethod(11,"rutuja");
		StaticMethod s1=new StaticMethod(12,"sejal");
		StaticMethod s2=new StaticMethod(13,"Naha");
		
		s.Dispaly();
		s1.Dispaly();
		s2.Dispaly();
		
	}

}
