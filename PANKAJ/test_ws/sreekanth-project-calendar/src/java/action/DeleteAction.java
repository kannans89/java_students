package action;

import dao.EventsDAO;

public class DeleteAction {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String execute() {
        EventsDAO.delete(id);
        return "success";
    }

    
}
