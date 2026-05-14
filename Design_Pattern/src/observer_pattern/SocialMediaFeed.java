package observer_pattern;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements PropertyChangeListener {
	private List<String> statuses = new ArrayList<>();
	
	@Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("status".equals(evt.getPropertyName())) {
            String updatedStatus = (String) evt.getNewValue();
            statuses.add(updatedStatus);
            System.out.println("[THÔNG BÁO]: Bảng tin vừa nhận cập nhật: " + updatedStatus);
        }
    }
	
	public void printFeed() {
        System.out.println("\n--- BẢNG TIN HIỆN TẠI ---");
        if (statuses.isEmpty()) {
            System.out.println("Chưa có tin mới nào.");
        } else {
            for (String s : statuses) {
                System.out.println("- " + s);
            }
        }
        System.out.println("-------------------------\n");
    }
}
