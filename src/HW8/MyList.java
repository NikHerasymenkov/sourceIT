package HW8;

public interface MyList<E>extends Iterable<Object> {
	void add(Object e);

	void clear();

	boolean remove(Object o);

	Object[] toArray();

	int size();

	boolean contains(Object o);

	boolean containsAll(MyList c);

	Object get(int index);

}
