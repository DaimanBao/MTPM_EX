package proxy_pattern;

public class ImageProxy implements DisplayObject {
	private ImageFile imageFile;
	private String path;
	
	public ImageProxy(String path) {
		this.path = path;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(imageFile == null) {
			imageFile = new ImageFile(path);
		}
		imageFile.display();
	}
}
