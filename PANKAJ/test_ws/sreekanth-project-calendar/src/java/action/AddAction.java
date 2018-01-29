package action;

import dao.EventsDAO;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class AddAction implements SessionAware {
    private String title,date,time, username;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public String execute() {
        EventsDAO.add(title,date,time,username);
        return "success";
    }

    @Override
    public void setSession(Map<String, Object> map) {
        username = (String) map.get("username");
    }
}
