package Core_program;

public class ImmutableString {

	public static void main(String[] args) {
		
		//string is immutable can't change 
		String s="java"; //string create by literal way
		s.concat(s);   //concate method used string add the data
		System.out.println(s);

		//output is java because the string create one object s they value is java. this reference cant modify the data .
		
		//stringBuilder & Stringbuffer is mutable it can be change the value 
		
		StringBuilder sb=new StringBuilder("java");
		sb.append("program");
		System.out.println(sb);
	}

}
