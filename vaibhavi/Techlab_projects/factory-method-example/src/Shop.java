
public class Shop extends Website {

	@Override
	public void createWebsite(PageType type) {
		// TODO Auto-generated method stub
		if(type.equals(PageType.LINEITEMPAGE))
		{
			pages.add(new LineItemPage("Line Item"));
		}
		else
		{
			pages.add(new CartPage("Cart page"));
		}
		
	}

	

}
