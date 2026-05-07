package command_pattern;

import java.util.List;

public class MacroCommand implements Command {
	private List<Command> commands;
    private String description;

    public MacroCommand(List<Command> commands, String description) {
        this.commands = commands;
        this.description = description;
    }

    public void execute() {
        System.out.println("--- Kích hoạt kịch bản: " + description + " ---");
        for (Command cmd : commands) cmd.execute();
    }

    public void undo() {
        System.out.println("--- Hoàn tác kịch bản: " + description + " ---");
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }

    public String getName() { return "Kịch bản: " + description; }

}

