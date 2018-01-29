
package entities;

import java.util.Date;


public class Note {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String title, text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    private java.util.Date updated;
    private User user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

   

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public String getPreview() {
        return   text.substring(0,  text.length() > 50 ? 50: text.length());
    }
    
}
