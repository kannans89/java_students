import java.util.ArrayList;
import java.util.List;


public abstract class Website {
	
	protected List<Page> pages=new ArrayList<Page>(); 
	
	public List<Page> getPage()
	{
		return pages;
	}
	
	public abstract void createWebsite(PageType type);
	
	

}
