package state_pattern;

public class Main {
	public static void main(String[] args) {
		MediaPlayer myPlayer = new MediaPlayer();
        myPlayer.showStatus();

        System.out.println("\n--- Nhấn nút Play ---");
        myPlayer.play();
        myPlayer.showStatus();

        System.out.println("\n--- Nhấn nút Play lần nữa ---");
        myPlayer.play();

        System.out.println("\n--- Nhấn nút Pause ---");
        myPlayer.pause();
        myPlayer.showStatus();
	}
}
