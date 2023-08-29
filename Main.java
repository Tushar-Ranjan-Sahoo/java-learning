//Java Constructors
//		A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

public class Main {

	int x;
	public Main(){
		x=5;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		System.out.println(obj.x);
	}

}



