package action;

import dao.UserDAO;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class LoginAction implements SessionAware {
    private Map<String, Object> session;
    private String username, password, message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String input() {
        return "success";
    }

    public String execute() {
        boolean found = UserDAO.login(username, password);
        if (found) {
            // store username in session 
            session.put("username",username);
            return "success";
        } else {
            message = "Invalid Login. Please try again!";
            return "error";
        }

    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }
}
