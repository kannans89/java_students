package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.UserDAO;
import entities.User;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class ChangePasswordAction extends ActionSupport implements SessionAware {

    private String oldpassword, password, password2, message;

    public String getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
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

        User u = (User) session.get("user");
        boolean done = UserDAO.changePassword(u.getEmail(), oldpassword, password);
        if (!done) {
            message = "Sorry! Could not change password. Old password is not correct!";
            return "error";
        }
        message = "Successfully changed password!";
        return "success";
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }
}
