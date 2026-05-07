package command_pattern;

import java.util.Arrays;

import command_pattern.Projector.Mode;

public class SmartOffice {
	public static void main(String[] args) {
		LightingSystem mainLight = new LightingSystem();
        AutomaticCurtain windowCurtain = new AutomaticCurtain();
        Projector officeProjector = new Projector();
        
        CentralController remote = new CentralController();

        System.out.println("Thao tác 1:");
        Command dimLight = new LightCommand(mainLight, 70);
        remote.executeCommand(dimLight);

        System.out.println("\nThao tác 2:");
        Command moveCurtain = new CurtainCommand(windowCurtain, 50);
        remote.executeCommand(moveCurtain); 
        
        System.out.println("\nThao tác 3:");
        Command startProjector = new ProjectorCommand(officeProjector, Mode.MOVIE);
        remote.executeCommand(startProjector);
        
        Command meetingMode = new MacroCommand(Arrays.asList(
            new LightCommand(mainLight, 20),
            new CurtainCommand(windowCurtain, 0),
            new ProjectorCommand(officeProjector, Projector.Mode.WORKING) 
        ), "Bắt đầu họp");

        System.out.println("\nThao tác 4:");
        remote.executeCommand(meetingMode);

        System.out.println("\n--- Thử nghiệm Undo ---");
        remote.pressUndo(); 

        remote.showLogs();
	}
}
