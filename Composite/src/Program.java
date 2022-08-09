public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("a.txt");
	//	file.ls();
		
		Directory directory = new Directory("Parent Dir");
		File file1 = new File("b.txt");
		directory.add(file);
		directory.add(file1);
		Directory subdir = new Directory("sub dir");
		File file2 = new File("c.txt");
		subdir.add(file2);
		directory.add(subdir);
		directory.ls();
		
	}

}