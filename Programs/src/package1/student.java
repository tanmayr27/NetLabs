package package1;

public class student extends person{

		private int rollno;
		private String schoolname;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getSchoolname() {
			return schoolname;
		}
		public void setSchoolname(String schoolname) {
			this.schoolname = schoolname;
		}
		public student(String name,int rollno, String schoolname) {
			super(name);
			this.rollno = rollno;
			this.schoolname = schoolname;
		}

}