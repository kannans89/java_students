package action;

import dao.EventsDAO;
import entities.Event;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;


public class HomeAction implements SessionAware  {
    private String  username;
    private List<Event> events;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public String execute() {
        // get events of current user 
        events = EventsDAO.getUpcomingEvents(username);
        return "success";
    }

    @Override
    public void setSession(Map<String, Object> map) {
        username = (String) map.get("username");
    }
}
