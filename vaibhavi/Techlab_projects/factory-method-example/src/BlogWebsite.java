
public class BlogWebsite extends Website{

	@Override
	public void createWebsite(PageType type) {
		// TODO Auto-generated method stub
		if(type==PageType.ABOUTPAGE)
		{
			pages.add(new AboutPage("About page"));
		}
		else if(type==PageType.CONTACTPAGE) 
		{
			pages.add(new ContactPage("contact page"));
		}
		else
		{
			pages.add(new PostPage("Post page"));
		}
		
		
	}

}
