package trivera.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringArrayTest {

	@BeforeAll
	public static void log() {
		System.out.println("Exercise: GenericDynamicArray - StringArrayTest");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));
	}

	//CODE7:Test empty object array of string
	@Test
	public void testSize() {
		ObjectArray<String> array = new ObjectArray<>();
		int size = array.size();
		assertEquals(0, size);
	}

	//CODE8:Test adding 1 string to object array of string
	@Test
	public void testSize1() {
		ObjectArray<String> array = new ObjectArray<>();
		array.add("A");
		int size = array.size();

		assertEquals(1, size);
	}

	//CODE9:Test adding and removing one string to object array of string
	@Test
	public void testSizeAfterRemove() {
		ObjectArray<String> array = new ObjectArray<>();
		array.add("A");
		array.remove("A");
		int size = array.size();

		assertEquals(0, size);
	}

	//CODE10:Test adding 100 strings to object array of string
	@Test
	public void testAdd() {
		ObjectArray<String> array = new ObjectArray<>();
		for (int i = 0; i < 100; i++) {
			array.add("A");
		}
		int size = array.size();
		assertEquals(100, size);
	}

	//CODE11:Test adding and getting string from object array of string
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

	//CODE12:Test removing string from object array of string by id
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

	//CODE13:Test clearing object array of string
	@Test
	public void testClear() {
		ObjectArray<String> array = new ObjectArray<>();
		array.add("A");
		array.add("B");
		array.clear();
		int size = array.size();
		assertEquals(0, size);
	}

	//CODE14:Test reusing an existing object array of string
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
