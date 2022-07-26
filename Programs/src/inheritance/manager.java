package inheritance;

public class manager extends employee {
private int no_of_emp;



public manager(int empid, String empname, int no_of_emp) {
	super(empid, empname);
	this.no_of_emp = no_of_emp;
}

public int getNo_of_emp() {
	return no_of_emp;
}

public void setNo_of_emp(int no_of_emp) {
	this.no_of_emp = no_of_emp;
}

}
