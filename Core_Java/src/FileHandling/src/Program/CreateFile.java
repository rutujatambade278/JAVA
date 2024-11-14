package Program;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj=new File("\\C:\\Users\\hp\\Desktop\\code.txt\\");
		//if(obj.createNewFile()) {
		if(obj.exists()) {
			System.out.println("File is successfully create"+obj.getName());
			System.out.println("File length is:"+obj.length());
			System.out.println("File get path:"+obj.getPath());
			System.out.println("File free space:"+obj.getFreeSpace());
			System.out.println("File is read:"+obj.canRead());
			System.out.println("File is  write:"+obj.canWrite());
			System.out.println("File is get a class:"+obj.getClass());
			System.out.println("File is exist: "+obj.exists());
			
		}
		else {
			System.out.println("Already exit");
		}
			}

}
