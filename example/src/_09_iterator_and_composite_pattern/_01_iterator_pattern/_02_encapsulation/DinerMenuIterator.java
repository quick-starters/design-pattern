package _09_iterator_and_composite_pattern._01_iterator_pattern._02_encapsulation;

import _09_iterator_and_composite_pattern._01_iterator_pattern._01_before.MenuItem;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

	MenuItem[] list;
	int position = 0;

	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("메뉴 항목은 지우면 안 됩니다.");
	}
}
