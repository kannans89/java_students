package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.NoteDAO;
import entities.Note;
import entities.User;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class SearchAction extends ActionSupport implements SessionAware {
    private String pattern, message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    private List<Note> notes;

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
    private Map<String, Object> session;

    @Override
    public String execute() {
        User u = (User) session.get("user");
        notes  = NoteDAO.searchNotes(u.getEmail(), pattern);
        if ( notes == null || notes.size() == 0)
            message = "Sorry! No notes found!";
        return "success";
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }
}
