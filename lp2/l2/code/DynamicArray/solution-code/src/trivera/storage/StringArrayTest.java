package trivera.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringArrayTest {

	@BeforeAll
	public static void log() {
		System.out.println("Exercise: DynamicArray");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));
	}

	//CODE7:Test empty string array
	@Test
	public void testSize() {
		StringArray array = new StringArray();
		int size = array.size();
		assertEquals(0, size);
	}

	//CODE8:Test adding 1 string to string array
	@Test
	public void testSize1() {
		StringArray array = new StringArray();
		array.add("A");
		int size = array.size();

		assertEquals(1, size);
	}

	//CODE9:Test adding and removing one string to string array
	@Test
	public void testSizeAfterRemove() {
		StringArray array = new StringArray();
		array.add("A");
		array.remove("A");
		int size = array.size();

		assertEquals(0, size);
	}

	//CODE10:Test adding 100 strings to string array
	@Test
	public void testAdd() {
		StringArray array = new StringArray();
		for (int i = 0; i < 100; i++) {
			array.add("A");
		}
		int size = array.size();
		assertEquals(100, size);
	}

	//CODE11:Test adding and getting string from string array
	@Test
	public void testGet() {
		StringArray array = new StringArray();
		array.add("A");
		array.add("B");
		Object object0 = array.get(0);
		Object object1 = array.get(1);
		assertEquals(object0, "A");
		assertEquals(object1, "B");
	}

	//CODE12:Test removing string from string array by id
	@Test
	public void testRemove() {
		StringArray array = new StringArray();
		array.add("A");
		array.add("B");
		array.add("B");
		array.add("C");

		array.remove("B");

		int size = array.size();
		assertEquals(2, size);
		assertEquals("A", array.get(0));
		assertEquals("C", array.get(1));
	}

	//CODE13:Test clearing string array
	@Test
	public void testClear() {
		StringArray array = new StringArray();
		array.add("A");
		array.add("B");
		array.clear();
		int size = array.size();
		assertEquals(0, size);
	}

	//CODE14:Test reusing an existing string array
	@Test
	public void testArrayReuse() {
		StringArray array = new StringArray();
		array.add("A");
		array.add("B");
		array.clear();
		array.add("C");
		assertEquals("C", array.get(0));
	}
}
