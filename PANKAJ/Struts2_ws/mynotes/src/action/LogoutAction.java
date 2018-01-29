package action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class LogoutAction extends ActionSupport  implements  SessionAware  {
   
    SessionMap<String, Object> session;
    
    @Override
    public String execute() {
        session.invalidate();
        return "success";
    }

    @Override
    public void setSession(Map<String, Object> map) {
           session = (SessionMap) map;
    }
}
