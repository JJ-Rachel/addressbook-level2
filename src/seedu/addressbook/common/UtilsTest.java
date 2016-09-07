package seedu.addressbook.common;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class UtilsTest {
	@Test
	public void isAnyNull_returnsTrue() {
		boolean ans = Utils.isAnyNull("hi", null);
		assertEquals(ans, true);
	}
	@Test
	public void elementsAreUnique_returnsTrue() {
		Object string1 = new String("hi");
		Object string2 = new String("hi2");
		Collection<Object> items = new ArrayList<Object>();
		items.add(string1);
		items.add(string2);
		boolean ans = Utils.elementsAreUnique(items);
		assertEquals(ans, true);
	}
	@Test
	public void elementsAreUnique_returnsFalse() {
		Object string1 = new String("hi");
		Object string2 = new String("hi");
		Collection<Object> items = new ArrayList<Object>();
		items.add(string1);
		items.add(string2);
		boolean ans = Utils.elementsAreUnique(items);
		assertEquals(ans, false);
	}
}
