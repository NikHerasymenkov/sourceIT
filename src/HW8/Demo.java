package HW8;

import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		DefaultMyList con = new DefaultMyList();
		con.add("A");
		con.add("B");
		con.add("T");
		ListIterator iter = con.listIterator();
		iter.next();
		iter.set("J");
		iter.next();
		iter.set("P");
		System.out.println(con);
		System.out.println(iter.previous());
		iter.remove();
		System.out.println(iter.previous());
		iter.set("W");
		System.out.println(iter.previous());
		iter.remove();
		//iter.set("E");
		System.out.println(con);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		for (Object o : con) {
			System.out.println(o);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		Iterator<Object> it = con.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println(con);
	}
}
