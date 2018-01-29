package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.NoteDAO;
import entities.Note;
import entities.User;
import java.util.Date;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class AddAction extends ActionSupport implements SessionAware {
	private String title, text, message;

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

	private Map<String, Object> session;

	@Override
	public String execute() {

		Note note = new Note();
		note.setTitle(title);
		note.setText(text);
		note.setUpdated(new Date());
		note.setUser((User) session.get("user"));

		boolean done = NoteDAO.add(note);
		if (!done) {
			message = "Sorry! Registration Failed. Please try again!";
			return "error";
		}
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> map) {
		session = map;
	}

}
