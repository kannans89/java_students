package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.UserDAO;
import entities.User;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class LoginAction extends ActionSupport  
                            implements  SessionAware  {
    private String email, password, message;
    
    private Map<String,Object> sessionData;
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String execute() {
       User u = UserDAO.login(email, password);
       if ( u == null) {
           message = "Sorry! Invalid Login. Try again!";
           return "failure";
       }
       // put user object in http session 
       sessionData.put("user",u);
       return "success";
    }
    @Override
    public void setSession(Map<String, Object> map) {
           sessionData = map;
    }
}
