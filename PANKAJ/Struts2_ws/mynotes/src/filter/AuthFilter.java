package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    private boolean isAllowedAction(String uri, String actions[]) {
        for (String action : actions) {
            if (uri.contains(action)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            // check whether session variable is set
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response;
            HttpSession ses = req.getSession(false);
            String reqURI = req.getRequestURI();
            // System.out.println(reqURI);
            if ((ses != null && ses.getAttribute("user") != null) 
            		|| isAllowedAction(reqURI, new String[]{"login", "register", "forgot", "styles"})) {
                chain.doFilter(request, response);
            } else // user didn't log in but asking for a page that is not allowed, so take user to login page
            {
                res.sendRedirect(req.getContextPath() + "/loginOpt");  // Anonymous user. Redirect to login page
            }
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
    }

    @Override
    public void destroy() {
    }
}
