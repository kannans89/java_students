package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.UserDAO;
import entities.User;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ForgotAction extends ActionSupport  {
    private String email, message;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String execute() {
       User u = UserDAO.getUser(email);
       if ( u == null) {
           message = "Sorry! Could not find given email in our database! Please try again!";
           return "failure";
       }
       // send mail
       
        // send mail to user
        try {
            Properties props = System.getProperties();
            Session session = Session.getDefaultInstance(props, null);
            // construct the message
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("admin@mynotes.com"));
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(u.getEmail()));
            msg.setDataHandler(new DataHandler(
                     String.format("<html><body>Dear %s,<p/>Use the following password to login. <p/>Password: %s <p/>Webmaster,<br>mynotes.com<body></html>", u.getFullname(), u.getPassword()),
                     "text/html"));
            msg.setSubject("Password Recovery");
            // send message
            Transport.send(msg);
        } catch (Exception ex) {
            System.out.println("Error sending mail : " + ex.getMessage());
            message = "Sorry! Could not send mail. Please try again!";
            return "error";
        }
        message = "A mail was sent with your details. Please use those details to login!";
        return "success";
    }

}
