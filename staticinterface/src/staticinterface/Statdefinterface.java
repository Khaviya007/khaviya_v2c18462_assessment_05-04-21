package staticinterface;
interface stati{
	public static void show() {
		System.out.println("Static interface");
	}
}
interface def{
	default void disp() {
		System.out.println("default interface");
	}
}
 class demo implements def{
	public void disp() {
		System.out.println("default interface in demo");
	}
}
public class Statdefinterface{
	public static void main(String[] args) {
		stati.show();
		demo d=new demo();
		d.disp();
	}
}
