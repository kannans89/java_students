package action;

import dao.UserDAO;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;


public class ChangePasswordAction implements SessionAware  {
    
    private String  username, oldpassword, password,  message;

    public String getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        
        boolean done = UserDAO.changePassword
                       (username,oldpassword, password);
        if (done) {
            message = "Password has been changed successfully!";
            return "success";
        } else {
            message = "Sorry! Could not change password!";
            return "error";
        }

    }

    @Override
    public void setSession(Map<String, Object> map) {
        username = (String) map.get("username");
    }
}
