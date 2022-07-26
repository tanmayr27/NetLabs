
/*public class salary extends Thread{

	public void run()
    {
    }
	public static void main(String[] args) {
		int basic=50000;
		hra(basic);
		da(basic);
	}
	public static void hra(int a)
	{
		System.out.println("HRA:"+0.24*a);
	}
	public static void da(int a)
	{
		System.out.println("DA:"+0.3*a);
	}
}*/

class Employee {
    private int basic;
    private double da;
    private double hra;
    private double netSal;
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getNetSal() {
		return netSal;
	}
	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}
    
}

class DAThread extends Thread {
    private Employee employee;
    public DAThread(Employee employee) {
        this.employee = employee;
    }
    public void run() {
        double resDA = 0;
        resDA = .5 * employee.getBasic();
        employee.setDa(resDA);
    }
}

class HRAThread extends Thread {
    private Employee employee;
    public HRAThread(Employee employee) {
        this.employee = employee;
    }
    public void run() {
        double resHRA = 0;
        resHRA = .5 * employee.getBasic();
        employee.setHra(resHRA);
    }
}
class salary {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setBasic(1000);
        DAThread daThread = new DAThread(employee);
        HRAThread hraThread = new HRAThread(employee);
        daThread.start();
        hraThread.start();
        
        try { 
            daThread.join();
            hraThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        employee.setNetSal(employee.getBasic() + employee.getDa() + employee.getHra());
        System.out.println("Net Salary : " + employee.getNetSal());
    }

}
