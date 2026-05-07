package command_pattern;

public class CurtainCommand implements Command{
	private AutomaticCurtain curtain;
    private int prevPos;
    private int newPos;

    public CurtainCommand(AutomaticCurtain curtain, int pos) {
        this.curtain = curtain;
        this.newPos = pos;
    }

    public void execute() {
        prevPos = curtain.getPosition();
        curtain.setPosition(newPos);
    }

    public void undo() {
        curtain.setPosition(prevPos);
    }

    public String getName() { return "Kéo rèm đến " + newPos + "%"; }
}
