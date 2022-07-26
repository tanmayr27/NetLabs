package abstractc;

public abstract class person {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public person(String name) {
	super();
	this.name = name;
}

public abstract void showdetails();
}
