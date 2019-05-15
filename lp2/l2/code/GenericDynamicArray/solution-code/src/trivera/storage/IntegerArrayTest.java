package trivera.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;	

class IntegerArrayTest {

	@BeforeAll
	public static void log() {
		System.out.println("Exercise: GenericDynamicArray - IntegerArrayTest");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));
	}

	//COD15:Test empty object array of integer
	@Test
	public void testSize() {
		ObjectArray<Integer> array = new ObjectArray<>();
		int size = array.size();
		assertEquals(0, size);
	}

	//CODE16:Test adding 1 integer to object array of integer
	@Test
	public void testSize1() {
		ObjectArray<Integer> array = new ObjectArray<>();
		array.add(1);
		int size = array.size();

		assertEquals(1, size);
	}

	//CODE17:Test adding and removing one integer to object array of integer
	@Test
	public void testSizeAfterRemove() {
		ObjectArray<Integer> array = new ObjectArray<>();
		array.add(1);
		array.remove(1);
		int size = array.size();

		assertEquals(0, size);
	}

	//CODE18:Test adding 100 integer to object array of integer
	@Test
	public void testAdd() {
		ObjectArray<Integer> array = new ObjectArray<>();
		for (int i = 0; i < 100; i++) {
			array.add(1);
		}
		int size = array.size();
		assertEquals(100, size);
	}

	//CODE19:Test adding and getting integer from object array of integer
	@Test
	public void testGet() {
		ObjectArray<Integer> array = new ObjectArray<>();
		array.add(1);
		array.add(2);
		Object object0 = array.get(0);
		Object object1 = array.get(1);
		assertEquals(object0, 1);
		assertEquals(object1, 2);
	}

	//CODE20:Test removing integer from object array of integer by id
	@Test
	public void testRemove() {
		ObjectArray<Integer> array = new ObjectArray<>();
		array.add(1);
		array.add(2);
		array.add(2);
		array.add(3);

		array.remove(2);

		int size = array.size();
		assertEquals(2, size);
	}

	//CODE21:Test clearing object array of integer
	@Test
	public void testClear() {
		ObjectArray<Integer> array = new ObjectArray<>();
		array.add(1);
		array.add(2);
		array.clear();
		int size = array.size();
		assertEquals(0, size);
	}

	//CODE22:Test reusing an existing object array of integer
	@Test
	public void testArrayReuse() {
		ObjectArray<Integer> array = new ObjectArray<>();
		array.add(1);
		array.add(2);
		array.clear();
		array.add(3);
		assertEquals(3, array.get(0));
	}	

}
