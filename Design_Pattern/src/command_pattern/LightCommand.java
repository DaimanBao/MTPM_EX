package command_pattern;

public class LightCommand implements Command {
	private LightingSystem light;
    private int prevLevel;
    private int newLevel;

    public LightCommand(LightingSystem light, int level) {
        this.light = light;
        this.newLevel = level;
    }

    public void execute() {
        prevLevel = light.getBrightness();
        light.setBrightness(newLevel);
    }

    public void undo() {
        light.setBrightness(prevLevel);
    }

    public String getName() { return "Chỉnh đèn lên " + newLevel + "%"; }
}
