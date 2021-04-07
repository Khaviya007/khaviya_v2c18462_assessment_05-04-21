package staticinterface;
interface stat{
	public static void show()
	{
		System.out.println("static interface");
	}
}
interface Test {
	public static void main(String[] args) {
		System.out.println("Main interface");
       stat.show();
	}
}
