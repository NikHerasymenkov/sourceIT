package HW8;

import java.util.Iterator;

public class DefaultMyList<E> implements MyList<E>, ListIterable {
	private int arrSize = 2;
	private Object[] arr;
	private int size = 0;

	public DefaultMyList() {
		arr = new Object[arrSize];
		size = 0;

	}

	@Override
	public void add(Object e) {
		if (size == arr.length) {
			Object[] newArr = new Object[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		arr[size++] = e;

	}

	@Override
	public void clear() {
		arr = new Object[arrSize];

	}

	@Override
	public boolean remove(Object o) {
		boolean bool = false;
		for (int i = 0; i < arr.length; i++) {
			if (o.equals(arr[i])) {
				bool = true;
				deleteByIndex(i);
				break;
			}
		}
		return bool;

	}

	private void deleteByIndex(int indexDel) {
		--size;
		for (int i = indexDel; i < size; ++i) {
			arr[i] = arr[i + 1];

		}
	}

	@Override
	public Object[] toArray() {
		Object[] tmp = new Object[size];
		for (int i = 0; i < size; i++) {
			tmp[i] = arr[i];
		}
		return tmp;
	}

	@Override
	public int size() {
		return arr.length;

	}

	@Override
	public boolean contains(Object o) {
		boolean contains = false;
		Object[] tmp = arr;
		for (int i = 0; i < size; ++i) {
			if (o.equals(tmp[i])) {
				contains = true;
				break;
			}

		}
		return contains;
	}

	@Override
	public boolean containsAll(MyList c) {
		boolean containsAll = false;
		Object[] tmp = c.toArray();
		int countEquals = 0;
		int i = 0;
		while (i < tmp.length) {
			int j = 0;
			if (j < size) {
				if (!arr[j].equals(tmp[i])) {
					++j;
					continue;
				}
				++countEquals;
			}
			++i;
			break;
		}
		if (countEquals == tmp.length) {
			containsAll = true;
		}
		return containsAll;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("{");
		for (int i=0;i<size;++i) {
		sb.append("[");
		sb.append(arr[i]);
		sb.append("]");
		if(i<size-1) {
			sb.append(',');
		}
		}
		sb.append ("}");
		return sb.toString();
	}

	@Override
	public Object get(int index) {
		return arr[index];

	}

	@Override
	public Iterator<Object> iterator() {

		return new IteratorImpl();
	}
	@Override
	public ListIterator listIterator() {
		return new ListIteratorImpl();

	}

	private class IteratorImpl implements Iterator<Object> {
		int index;
		int count;

		@Override
		public boolean hasNext() {
			return (index < arr.length) ? true : false;

		}

		@Override
		public Object next() {
			count = 0;
			return (hasNext()) ? arr[index++] : null;

		}

		public void remove() {
			if (count == 0) {
				DefaultMyList.this.remove(arr[index]);
				count++;
			} else {
				throw new IllegalStateException();
			}

		}

	}


	private class ListIteratorImpl extends IteratorImpl implements ListIterator {

		@Override
		public boolean hasPrevious() {
			return (index > 0) ? true : false;
		}

		@Override
		public Object previous() {
			count = 0;
			return (hasPrevious()) ? arr[index--] : null;

		}

		@Override
		public void set(Object e) {
			if (count == 0) {
				arr[index] = e;
				count++;
				
			}else {
				throw new IllegalStateException();
				
			}

		}

	}
}
