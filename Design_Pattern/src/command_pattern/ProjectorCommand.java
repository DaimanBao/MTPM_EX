package command_pattern;

public class ProjectorCommand implements Command {
	private Projector projector;
    private Projector.Mode prevMode;
    private Projector.Mode newMode;

    public ProjectorCommand(Projector projector, Projector.Mode mode) {
        this.projector = projector;
        this.newMode = mode;
    }

    @Override
    public void execute() {
        prevMode = projector.getMode(); 
        projector.setMode(newMode);
    }

    @Override
    public void undo() {
        projector.setMode(prevMode);
    }

    @Override
    public String getName() {
        return "Chuyển máy chiếu sang chế độ " + newMode;
    }
}
