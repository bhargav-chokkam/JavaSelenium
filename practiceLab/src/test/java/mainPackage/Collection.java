package mainPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		Collection ob = new Collection();
		ob.listdemo();
		ob.hashDemo();

	}

	public void listdemo() {
		List<Integer> values = new ArrayList();
		values.add(1);
		values.add(2);
		values.add(1, 5);
		Iterator it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

	public void hashDemo() {
		HashSet<Integer> hs = new HashSet();
		hs.add(1);
		hs.add(2);
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}

}
