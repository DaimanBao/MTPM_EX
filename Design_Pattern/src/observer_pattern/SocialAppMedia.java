package observer_pattern;

public class SocialAppMedia {
	public static void main(String[] args) {
		Connection userA = new Connection();
        SocialMediaFeed myFeed = new SocialMediaFeed();

        System.out.println("Kịch bản 1: Cập nhật status trước khi kết nối");
        userA.setStatus("Hôm nay tôi đi ăn bánh xèo Quy Nhơn!");
        myFeed.printFeed();

        userA.addPropertyChangeListener(myFeed);
        
        System.out.println("Kịch bản 2: Cập nhật status sau khi đã kết nối");
        userA.setStatus("Đang chuẩn bị làm bài tập lớn phần mềm.");
        userA.setStatus("Mẫu thiết kế Observer trong Java thật thú vị!");

        myFeed.printFeed();
	}
}
