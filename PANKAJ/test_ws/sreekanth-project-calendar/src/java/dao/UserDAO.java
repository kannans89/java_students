
package dao;

import entities.User;
import hb.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UserDAO {

     public static boolean login(String username, String password) {
         
         boolean found = true; 
         SessionFactory sf = HibernateUtil.getSessionFactory();
         Session session = sf.openSession();
         User  user = (User) session.get(User.class,username);
         if ( user == null)
             found = false; 
         else
         {
             if ( user.getPassword().equals(password) )
                  found = true;
             else
                  found = false; 
         }
         
         session.close();
         return found;
         
     }
     
    
     public static boolean register(String username, String password, String email) {
         
         boolean done = true; 
         SessionFactory sf = HibernateUtil.getSessionFactory();
         Session session = sf.openSession();
         Transaction t = session.beginTransaction();
         User  user = new User();
         user.setUsername(username);
         user.setPassword(password);
         user.setEmail(email);
         
         try {
             session.save(user);
             t.commit();
             done = true;
         }         
         catch(Exception ex) {
             System.out.println("UserDAO.register() -- >  " + ex.getMessage());
             t.rollback();
             done = false;
         }
         
         session.close();
         return done;
         
     }
     
      public static boolean changePassword(String username, String oldpassword, String password) {
         
         boolean done = true; 
         SessionFactory sf = HibernateUtil.getSessionFactory();
         Session session = sf.openSession();
         Transaction t  = session.beginTransaction();
         User  user = (User) session.get(User.class,username);
         if ( user == null)
             done = false; 
         else
         {
             if (user.getPassword().equals(oldpassword) )
             {
                 user.setPassword(password);
                 t.commit();
             }
             else
                 done = false; 
         }
         
         session.close();
         return done;
         
     }
}
