package Program;

import java.io.File;
import java.io.IOException;

public class CreatingFile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   File fc= new File ("C:\\Users\\hp\\Desktop\\sandesh.txt");
   if (fc.createNewFile())
   {
   
   System.out.println(" file is created");
	  
   }
   else {
	   System.out.println("file is allready created");
   }
	}
}

