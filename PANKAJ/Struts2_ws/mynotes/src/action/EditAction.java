package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.NoteDAO;
import entities.Note;

public class EditAction extends ActionSupport {
    private int id;
    private String title, text;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String execute() {
       Note note = NoteDAO.getNote(id);
       text = note.getText();
       title = note.getTitle();
       return "success";
    }
    
}
