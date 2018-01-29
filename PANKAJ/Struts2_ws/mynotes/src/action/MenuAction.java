package action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class MenuAction extends ActionSupport {
    public String login() {
        return "login";
    }

    public String register() {
        return "register";
    }

    public String forgot() {
        return "forgot";
    }

    public String home() {
        return "home";
    }

   
    
    public String add() {
        return "add";
    }
     
    
    public String search() {
        return "search";
    }
     
    
    public String changePassword() {
        return "changePassword";
    }
    
}
