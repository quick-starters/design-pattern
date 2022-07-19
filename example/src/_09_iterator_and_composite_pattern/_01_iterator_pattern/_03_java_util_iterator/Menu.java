package _09_iterator_and_composite_pattern._01_iterator_pattern._03_java_util_iterator;

import _09_iterator_and_composite_pattern._01_iterator_pattern._01_before.MenuItem;
import java.util.Iterator;

public interface Menu {
  Iterator<MenuItem> createIterator();
}
