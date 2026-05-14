package state_pattern;

public interface State {
	void play(MediaPlayer player);
    void pause(MediaPlayer player);
}
