public class Main {
	static void myStatickMethod(){
		System.out.println("This is static method");

	}
	public void myPublicMethod(){
		System.out.println("This is public method");
	}

	public static void main(String[] args) {
		myStatickMethod();
		Main obj = new Main();
		obj.myPublicMethod();
	}
}

