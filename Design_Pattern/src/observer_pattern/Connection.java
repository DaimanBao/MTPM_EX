package observer_pattern;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Connection {
	private String status;
    private PropertyChangeSupport support;
    
    public Connection() {
    	support = new PropertyChangeSupport(this);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
    
    public void setStatus(String newStatus) {
        String oldStatus = this.status;
        this.status = newStatus;
        support.firePropertyChange("status", oldStatus, newStatus);
    }

    public String getStatus() {
        return status;
    }
    
}
