package builder_pattern;

public class Architect {
	public static void main(String[] args) {
		Bedroom bedroom = new BedroomBuilder()
								.setBed("King Size Bed")
								.setWardrobe("Large Wardrobe")
								.setDesk("Gaming Desk")
								.setChair("Gaming Chair")
								.setLamp("LED Lamp")
								.setWindow("Glass Window")
								.setDoor("Wood Door")
								.setColor("Blue and White")
								.build();
		
		System.out.println(bedroom);
	}
}
