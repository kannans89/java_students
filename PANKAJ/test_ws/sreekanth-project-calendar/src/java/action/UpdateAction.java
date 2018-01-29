package action;

import dao.EventsDAO;
import entities.Event;


public class UpdateAction{
    private String title,date,time;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
    public String input() {
        Event event = EventsDAO.get(id);
        this.title = event.getTitle();
        this.date = event.getDate().toString();
        this.time = event.getTime();
        return "success";
    }
    
    public String execute() {
        EventsDAO.update(id,title,date,time); 
        return "success"; 
    }

    
}
