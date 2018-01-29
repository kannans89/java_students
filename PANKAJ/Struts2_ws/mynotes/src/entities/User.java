
package entities;

import java.util.Date;


public class User {
   private String email, password, fullname;
   private java.util.Date dj;

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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDj() {
        return dj;
    }

    public void setDj(Date dj) {
        this.dj = dj;
    }
   
   
   
}
