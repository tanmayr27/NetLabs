public class File extends AbstractFile {
	
	
	public File(String name) {
		super(name);
	}
	public void ls() {
		System.out.println("\t\t\tfile name - " + this.getFileName());
	}
}

