
public class Marks {
int a,b,c,d,e;

public Marks(int a, int b, int c, int d, int e) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
	this.d = d;
	this.e = e;
}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public int getC() {
	return c;
}

public void setC(int c) {
	this.c = c;
}

public int getD() {
	return d;
}

public void setD(int d) {
	this.d = d;
}

public int getE() {
	return e;
}

public void setE(int e) {
	this.e = e;
}

public String findmarks(int a1,int b1,int c1,int d1,int e1)
{
	int result= ((a1+b1+c1+d1+e1)/5);
	
	if(result<40)
		return "Apply next Sem";
		else if((result>=40)&&(result<60))
			return "Pass";
		else if((result>=60)&&(result<80))
			return "Average";
		else
			return "Top";
	
}
}
