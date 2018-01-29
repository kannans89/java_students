package listItemInGenericsAndCollectionTest;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import listItemInGenericsAndCollection.LineItem;

public class ListItemMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		LineItem map1 = new LineItem(1, "Pratibha", 5, 500);
		LineItem map2 = new LineItem(2, "Shweta", 3, 400);
		LineItem map3 = new LineItem(3, "Akshay", 4, 350);
		LineItem map4 = new LineItem(4, "Pramod", 5, 520);
		Map<Integer, LineItem> map = new TreeMap<Integer, LineItem>();
		map.put(1, map1);
		map.put(2, map2);
		map.put(3, map3);
		map.put(4, map4);
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " Details");
			LineItem li = (LineItem) entry.getValue();
			System.out.println(li.getId() + " " + li.getName() + "  "
					+ li.getQuantity() + "  " + li.getPrice() + "  "
					+ li.calculateTotalPrice());
			System.out.println();
		}
	}
}
