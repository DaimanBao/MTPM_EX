package singleton_pattern;

public class Client {
	public static void main(String[] args) {
		PrintSpooler print = PrintSpooler.getInstance();
		
		System.out.println(print);
	}
}
