package listItemInGenericsAndCollectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import listItemInGenericsAndCollection.LineItem;

public class ListItemSet {

	public static void main(String[] args) {
		LineItem set1 = new LineItem(1, "Pratibha", 5, 500);
		LineItem set2 = new LineItem(2, "Shweta", 3, 400);
		LineItem set3 = new LineItem(3, "Akshay", 4, 350);
		LineItem set4 = new LineItem(4, "Pramod", 5, 520);
		Set<LineItem> set = new HashSet<LineItem>();
		set.add(set1);
		set.add(set2);
		set.add(set3);
		set.add(set4);
		Iterator<LineItem> itr = set.iterator();
		while (itr.hasNext()) {
			LineItem li = (LineItem) itr.next();
			if (li.getId() == 3)
				li.setQuantity(10);
			System.out.println(li.getId() + " " + li.getName() + "  "
					+ li.getQuantity() + "  " + li.getPrice() + "  "
					+ li.calculateTotalPrice());
		}

	}
}
