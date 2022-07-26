package fileoutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class configuration {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			FileOutputStream fout = new FileOutputStream("D:\\config.properties");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s1="db.user=arisglobal\n";
			String s2="db.password=password\n";
			String s3="db.url=localhost\n";
			write(s1,bout);
			write(s2,bout);
			write(s3,bout);
			fout.close();
			System.out.println("Success");
		
	}
	public static void write(String s,BufferedOutputStream bout1) throws Exception
	{
		byte b[]=s.getBytes();
		bout1.write(b);
		bout1.flush();
	}
}
