package dao;

import entities.Event;
import entities.User;
import hb.HibernateUtil;
import java.sql.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EventsDAO {
 
    public static List<Event>  getUpcomingEvents(String username) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Event where user.username = :username and  date >=  current_date() order by date,time");
        query.setString("username",username);
        List<Event> events = query.list();
        System.out.printf("User %s and events %d\n", username, events.size());
        session.close();
        return events;
    }
    
    public static List<Event>  getPastEvents(String username) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Event where user.username = :username and  date <  current_date() order by date,time");
        query.setString("username",username);
        List<Event> events = query.list();
        session.close();
        return events;
    }
    
    public static boolean add(String title, String date, String time, String username) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        
        // Get user object 
        User user = (User) session.get(User.class,username);
        Event event = new Event();
        event.setTitle(title);
        event.setDate(Date.valueOf(date));
        event.setTime(time);
        event.setUser(user);
        
        session.save(event);
        
        trans.commit();
        session.close();
        return true;
    }
    
    public static boolean delete(int id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        
        Event event = (Event) session.get(Event.class,id);
        session.delete(event);
        
        trans.commit();
        session.close();
        return true;
    }
    
     public static Event get(int id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Event event = (Event) session.get(Event.class,id);
        session.close();
        return event;
    }
     
      public static boolean update(int id,String title, String date, String time) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
      
        Event event = (Event) session.get(Event.class,id);
        event.setTitle(title);
        event.setDate(Date.valueOf(date));
        event.setTime(time);
        
        trans.commit();
        session.close();
        return true;
    }
      
      
      public static List<Event>  search(String fromdate, String todate, String username) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Event where user.username = :username and  date >= :fromdate and date <= :todate");
        query.setString("username",username);
        query.setDate("fromdate", Date.valueOf(fromdate));
        query.setDate("todate", Date.valueOf(todate));
        List<Event> events = query.list();
        System.out.printf("User %s and events %d\n", username, events.size());
        session.close();
        return events;
    }
}
