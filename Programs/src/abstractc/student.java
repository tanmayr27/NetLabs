package abstractc;

public class student extends person{
private int rollno;

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public student(int rollno,String name) {
	super(name);
	this.rollno = rollno;
}

@Override
public void showdetails()
{
	System.out.println("Roll:"+this.getRollno());
	System.out.println("Name:"+this.getName());
}
}
