package fileoutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class file2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="Welcome to Bangalore";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("Success");
		
	}
}
