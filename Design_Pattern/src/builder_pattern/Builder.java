package builder_pattern;

interface Builder {
	Builder setBed(String bed);
	Builder setWardrobe(String wardrobe);
	Builder setDesk(String desk);
	Builder setChair(String chair);
	Builder setLamp(String lamp);
	Builder setWindow(String window);
	Builder setDoor(String door);
	Builder setColor(String color);
	Bedroom build();
	
}
