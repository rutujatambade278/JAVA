package Micro;

public class First implements Cloneable{
	int id;
	String name;
	 public First(int id,String name) {
		 this.id=id;
		 this.name=name;
	 }
	 void display() {
		 System.out.println("id is :"+id);
		 System.out.println("name is:"+name);
	 }

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
         
        	 First f= new First(101,"rutu");
        	 First F1=(First)f.clone();
        	 f.display();
         	 F1.display();
        	 System.out.println(f.hashCode());
        	 System.out.println(F1.hashCode());
        	 
         }
	}


