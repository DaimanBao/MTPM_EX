package proxy_pattern;

public class ImageFile implements DisplayObject{
	private String path;
	
	public ImageFile(String path) {
		this.path = path;
		this.loadFromDisk();
	}
	
	private void loadFromDisk() {
		System.out.println("Loading " + path + " from disk... (Heavy Process)");	}

	@Override
	public void display() {
		System.out.println("Displaying image: " + path);	}
}
