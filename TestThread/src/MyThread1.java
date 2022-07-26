
public class MyThread1 extends Thread{
public void run() {
	for(int i=0;i<5;i++)
{
	System.out.println("\t\t\thello this is my thread"+i);	
}
}
public static void main(String[] args) {
MyThread1 myThread=new MyThread1();
myThread.start();
for(int i=0;i<10;i++)
{
	System.out.println("main thread"+i);	
}
	}

}
