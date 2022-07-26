package fileoutput;
import java.io.FileOutputStream;
public class file {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("d:\\output.txt");
			fout.write(97);
			fout.close();
			System.out.println("Success");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
