package command_pattern;

public class LightingSystem {
	private int brightness;

    public void setBrightness(int level) {
        this.brightness = level;
        System.out.println("Đèn: Độ sáng hiện tại là " + level + "%");
    }

    public int getBrightness() { return brightness; }
}
