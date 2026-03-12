package builder_pattern;

public class Bedroom {
	
	private String bed;
	private String wardrobe;
	private String desk;
	private String chair;
	private String lamb;
	private String window;
	private String door;
	private String color;
	
	public Bedroom(String bed, String wardrobe, String desk, String chair, String lamb, String window, String door,
			String color) {
		super();
		this.bed = bed;
		this.wardrobe = wardrobe;
		this.desk = desk;
		this.chair = chair;
		this.lamb = lamb;
		this.window = window;
		this.door = door;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bedroom [bed=" + bed + ", wadrobe=" + wardrobe + ", desk=" + desk + ", chair=" + chair + ", lamb=" + lamb
				+ ", window=" + window + ", door=" + door + ", color=" + color + "]";
	}

	

}
