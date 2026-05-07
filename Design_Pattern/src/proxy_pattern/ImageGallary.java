package proxy_pattern;

public class ImageGallary {
	public static void main(String[] args) {
		DisplayObject img1 = new ImageProxy("vacation.jpg");
		DisplayObject img2 = new ImageProxy("portrait.png");
		
		System.out.println("--- Slideshow started ---");
		img1.display();
		img1.display();
		img2.display();
		
	}
}
