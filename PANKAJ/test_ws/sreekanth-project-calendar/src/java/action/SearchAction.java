package action;

import dao.EventsDAO;
import entities.Event;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class SearchAction implements SessionAware {
    private String fromdate,todate, username;
    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String input() {
        return "success";
    }
    
    public String execute() {
        events = EventsDAO.search(fromdate,todate,username);
        return "success";
    }

    @Override
    public void setSession(Map<String, Object> map) {
        username = (String) map.get("username");
    }
}
