package command_pattern;

public class Projector {
	public enum Mode { WORKING, MOVIE, OFF }
    private Mode currentMode = Mode.OFF;

    public void setMode(Mode mode) {
        this.currentMode = mode;
        System.out.println("Máy chiếu: Chế độ hiện tại là " + mode);
    }

    public Mode getMode() { return currentMode; }
}
