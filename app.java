public class HelloWorld {
    public static void main(String[] args) {
        // Prints "Hello, World!" to the console
        System.out.println("Hello, World!");
    }
}

// dev-2 push from local 
public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}
