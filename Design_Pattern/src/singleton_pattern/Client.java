package singleton_pattern;

public class Client {
	public static void main(String[] args) {
		PrintSpooler instance = PrintSpooler.getInstance();
		
		System.out.println(instance);
	}
}
