package command_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CentralController {
	private Stack<Command> history = new Stack<>();
    private List<String> log = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
        log.add("Thực thi: " + command.getName());
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command lastCmd = history.pop();
            log.add("Hoàn tác: " + lastCmd.getName());
            lastCmd.undo();
        } else {
            System.out.println("Không còn lệnh nào để hoàn tác.");
        }
    }

    public void showLogs() {
        System.out.println("\n--- LỊCH SỬ THAO TÁC (LOG) ---");
        for (String entry : log) {
            System.out.println(entry);
        }
    }
}
