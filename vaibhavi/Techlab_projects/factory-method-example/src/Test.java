

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Website website=new BlogWebsite();
		website.createWebsite(PageType.POSTPAGE);
		website.createWebsite(PageType.ABOUTPAGE);
		for(Page page:website.getPage())
		{
			System.out.println(page.getDescription());
		}

	}

}
