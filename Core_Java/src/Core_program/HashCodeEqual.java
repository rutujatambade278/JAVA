package Core_program;

import java.util.Objects;

public class HashCodeEqual {
	
	private Long id;
	private String name;
	public HashCodeEqual() {
	
		super();
		// TODO Auto-generated constructor stub
	}
 
	
	
	public HashCodeEqual(int id, String name) {
		super();
		this.id = (long) id;
		this.name = name;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Hashcode Method...
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	//Equal Method....
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeEqual other = (HashCodeEqual) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	public static void main(String[]args) {
		 
		
		HashCodeEqual hashcode=new HashCodeEqual(11,"Rutuja");
		HashCodeEqual hashcode1=new HashCodeEqual(12,"Lata");
		
		System.out.println("Hashcode Method value:"+(hashcode.hashCode()== hashcode1.hashCode()));
		System.out.println("Equal Method value:"+hashcode.equals(hashcode1));
		
		
		
	}

}
