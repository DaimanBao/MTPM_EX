package state_pattern;

public class MediaPlayer {
	private State state;
    private String icon;

    public MediaPlayer() {
        this.state = new PausedState();
        this.icon = "PAUSE_ICON";
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void showStatus() {
        System.out.println("Trạng thái hiện tại: " + state.getClass().getSimpleName() + " | Icon: " + icon);
    }
}
