package Demo;

public class Immutable {

	public static void main(String[] args) {
		
		String s="java";
		s="hello";
		s.hashCode();
//		StringBuilder s=new StringBuilder("java");
//		//s.charAt(0);
//		s.setCharAt(2, 'j');
//		s.insert(4,'h');
		System.out.println(s);
		
	}

}
