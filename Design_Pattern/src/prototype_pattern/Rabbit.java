package prototype_pattern;


public class Rabbit implements Prototype<Rabbit>, Cloneable{
	private int age;
	
	public Rabbit(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public Rabbit clone() {
		// TODO Auto-generated method stub
		try {
			return (Rabbit) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public Rabbit(Rabbit other) {
		this.age = other.age;
	}
}
