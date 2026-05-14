package state_pattern;

public class PlayingState implements State {
	@Override
    public void play(MediaPlayer player) {
        System.out.println("Nhạc vẫn đang phát...");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Đang tạm dừng nhạc...");
        player.setIcon("PAUSE_ICON");
        player.setState(new PausedState());
    }
}
