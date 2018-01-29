package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.NoteDAO;

public class UpdateAction extends ActionSupport{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String title,text, message;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String execute() {
       boolean done  = NoteDAO.update(id,title,text);
       if ( !done) {
           message = "Sorry! Could not update note!";
           return "error";
       }
       return "success";
    }
    

    public String delete() {
       System.out.println("Deleting note!");
       NoteDAO.delete(id);
       return "success";
    }

    
    
}
