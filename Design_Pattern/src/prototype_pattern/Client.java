package prototype_pattern;

public class Client {
	public static void main(String[] args) {
		Rabbit originalRabbit = new Rabbit(2);

		Rabbit cloneRabbit = originalRabbit.clone();
		
		System.out.println("Original rabbit age: " + originalRabbit.getAge());
		System.out.println("Clone rabbit age: " + cloneRabbit.getAge());
		
		cloneRabbit.setAge(5);
		System.out.println("\nAfter change age clone");
		System.out.println("Original rabbit age: " + originalRabbit.getAge());
		System.out.println("Clone rabbit age: " + cloneRabbit.getAge());
	}
}
