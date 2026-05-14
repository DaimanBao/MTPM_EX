package state_pattern;

public class PausedState implements State{
	@Override
    public void play(MediaPlayer player) {
        System.out.println("Đang chuyển sang chế độ Phát nhạc...");
        player.setIcon("PLAY_ICON");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Nhạc đã đang tạm dừng rồi.");
    }
}
