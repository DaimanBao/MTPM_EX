package builder_pattern;

class BedroomBuilder implements Builder{

	private String bed;
	private String wardrobe;
	private String desk;
	private String chair;
	private String lamp;
	private String window;
	private String door;
	private String color;
	
	@Override
    public Builder setBed(String bed) {
        this.bed = bed;
        return this;
    }

    @Override
    public Builder setWardrobe(String wardrobe) {
        this.wardrobe = wardrobe;
        return this;
    }

    @Override
    public Builder setDesk(String desk) {
        this.desk = desk;
        return this;
    }

    @Override
    public Builder setChair(String chair) {
        this.chair = chair;
        return this;
    }

    @Override
    public Builder setLamp(String lamp) {
        this.lamp = lamp;
        return this;
    }

    @Override
    public Builder setWindow(String window) {
        this.window = window;
        return this;
    }

    @Override
    public Builder setDoor(String door) {
        this.door = door;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Bedroom build() {
        return new Bedroom(bed, wardrobe, desk, chair, lamp, window, door, color);
    }
}
