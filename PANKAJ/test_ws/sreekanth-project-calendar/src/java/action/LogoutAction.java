
package action;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;


public class LogoutAction  implements SessionAware {
    SessionMap<String,String> session;
    public String execute() {
        session.invalidate();
        return "success";
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = (SessionMap) map;
    }
}
