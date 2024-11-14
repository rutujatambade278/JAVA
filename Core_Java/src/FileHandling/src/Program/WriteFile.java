package Program;

import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter f = new FileWriter("\\C:\\Users\\hp\\Desktop\\code.txt\\");
			try 
			{
				f.write("file is create successfully");
				f.write(" Hii ");
				f.write(" hello ");
				f.write(" smile please");
				f.write("\\C:\\Users\\hp\\Desktop\\smiling-face-world-smile-day-event_1017-33635.webp\\");
				
			} 
			finally 
			{
				f.close();
			}
		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

}
