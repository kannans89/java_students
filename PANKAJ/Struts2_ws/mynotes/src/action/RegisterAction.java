package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.UserDAO;
import entities.User;
import java.util.Date;

public class RegisterAction extends ActionSupport {
    private String email, password, password2,message , fullname;

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
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
    public void validate() {
        super.validate(); 
        if (! password.equals(password2))
             addFieldError("password", "Password and Confirm password do not match!");
    }
    
    
    @Override
    public String execute() {

        User u = new User();
        u.setEmail(email);
        u.setPassword(password);
        u.setFullname(fullname);
        u.setDj ( new Date());

       boolean done  = UserDAO.register(u);
       if ( !done) {
           message = "Sorry! Registration Failed. Please try again!";
           return "failure";
       }
       message = "Registration has been successful. Please <a href='loginOpt'>Login</a>";
       return "success";
       
    }
    
}
