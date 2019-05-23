package trivera.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringArrayTest {

	@BeforeAll
	public static void log() {
		System.out.println("Exercise: GenericDynamicArray - StringArrayTest");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));
	}

	//CODE7:Implement Tests to test ObjectArray<String> array
	@Test
	public void testSize() {
		ObjectArray<String> array = new ObjectArray<>();
		int size = array.size();
		assertEquals(0, size);
	}

	@Test
	public void testSize1() {
		ObjectArray<String> array = new ObjectArray<>();
		array.add("A");
		int size = array.size();

		assertEquals(1, size);
	}

	@Test
	public void testSizeAfterRemove() {
		ObjectArray<String> array = new ObjectArray<>();
		array.add("A");
		array.remove("A");
		int size = array.size();

		assertEquals(0, size);
	}

	@Test
	public void testAdd() {
		ObjectArray<String> array = new ObjectArray<>();
		for (int i = 0; i < 100; i++) {
			array.add("A");
		}
		int size = array.size();
		assertEquals(100, size);
	}

	@Test
	public void testGet() {
		ObjectArray<String> array = new ObjectArray<>();
		array.add("A");
		array.add("B");
		Object object0 = array.get(0);
		Object object1 = array.get(1);
		assertEquals(object0, "A");
		assertEquals(object1, "B");
	}

	@Test
	public void testRemove() {
		ObjectArray<String> array = new ObjectArray<>();
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

	@Test
	public void testClear() {
		ObjectArray<String> array = new ObjectArray<>();
		array.add("A");
		array.add("B");
		array.clear();
		int size = array.size();
		assertEquals(0, size);
	}

	@Test
	public void testArrayReuse() {
		ObjectArray<String> array = new ObjectArray<>();
		array.add("A");
		array.add("B");
		array.clear();
		array.add("C");
		assertEquals("C", array.get(0));
	}
}
