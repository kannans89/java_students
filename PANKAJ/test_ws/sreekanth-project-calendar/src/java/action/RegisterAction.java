package action;

import dao.UserDAO;

public class RegisterAction {

    private String username, password, email, message;

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
        boolean done = UserDAO.register(username, password, email);
        if (done) {
            return "success";
        } else {
            message = "Registration Failed. Please try again!";
            return "error";
        }

    }
}
