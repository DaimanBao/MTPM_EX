package command_pattern;

public class AutomaticCurtain {
	private int position = 0;

    public void setPosition(int pos) {
        this.position = pos;
        System.out.println("Rèm cửa: Đang ở vị trí " + pos + "%");
    }

    public int getPosition() { return position; }
}
