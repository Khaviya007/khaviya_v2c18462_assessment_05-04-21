package staticinterface;
interface test1{
	public void demo();
}
interface test2{
	public void show();
	public void demo();
}
interface test3{
	public void disp();
	public void run();
	default void demo() {
		System.out.println("test3 interface demo");
	}
}
class example implements test1,test2,test3{
	public void demo() {
		System.out.println("example demo");
		test3.super.demo();
	}
	
	public void show() {
		System.out.println("test2 show");
	}
	public void disp() {
		System.out.println("test3 disp");
	}
	public void run() {
		System.out.println("test3 run");
	}
	
}
public class Definterface {
	public static void main(String[] args) {
	   example e=new example();
	   e.demo();
	   e.show();
	   e.disp();
       e.run();
       
	}
}
