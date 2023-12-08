package tw.EEIT.tutor;

import java.util.HashSet;
import java.util.Iterator;

import tw.EEIT.classes.Bike;

public class Brad30 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Brad");
		set.add(new Bike());
		set.add(123); //auto-boxing <> auto-unboxing
		set.add(true);
		set.add(12.3);
		System.out.println(set.size());
		set.add(123);
		set.add("Brad");
		System.out.println(set.size());
		System.out.println(set);
		// Set 1.不重複 2.無順序性
		System.out.println("--------");
		Iterator it =  set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
