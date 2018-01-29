package listItemInGenericsAndCollectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import listItemInGenericsAndCollection.LineItem;

public class LineItemList {

	public static void main(String[] args) {
		LineItem li1 = new LineItem(1, "Pratibha", 5, 500);
		LineItem li2 = new LineItem(2, "Shweta", 3, 400);
		LineItem li3 = new LineItem(3, "Akshay", 4, 350);
		LineItem li4 = new LineItem(4, "Pramod", 5, 520);
		List<LineItem> list = new ArrayList<LineItem>();
		list.add(li1);
		list.add(li2);
		list.add(li3);
		list.add(li4);
		Iterator<LineItem> itr = list.iterator();
		while(itr.hasNext()){
			LineItem li=(LineItem) itr.next();
			System.out.println(li.getId()+" "+li.getName()+"  "
			+li.getQuantity()+"  "+li.getPrice()+"  "+li.calculateTotalPrice());
		}
	}
}
