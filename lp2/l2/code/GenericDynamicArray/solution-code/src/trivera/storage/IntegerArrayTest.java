package trivera.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;	

class IntegerArrayTest {

	@BeforeAll
	public static void log() {
		System.out.println("Exercise: GenericDynamicArray - IntegerArrayTest");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));
	}

	//CODE8:Implement Tests to test ObjectArray<Integer> array
	@Test
	public void testSize() {
		ObjectArray<Integer> array = new ObjectArray<>();
		int size = array.size();
		assertEquals(0, size);
	}

	@Test
	public void testSize1() {
		ObjectArray<Integer> array = new ObjectArray<>();
		array.add(1);
		int size = array.size();

		assertEquals(1, size);
	}

	@Test
	public void testSizeAfterRemove() {
		ObjectArray<Integer> array = new ObjectArray<>();
		array.add(1);
		array.remove(1);
		int size = array.size();

		assertEquals(0, size);
	}

	@Test
	public void testAdd() {
		ObjectArray<Integer> array = new ObjectArray<>();
		for (int i = 0; i < 100; i++) {
			array.add(1);
		}
		int size = array.size();
		assertEquals(100, size);
	}

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

	@Test
	public void testClear() {
		ObjectArray<Integer> array = new ObjectArray<>();
		array.add(1);
		array.add(2);
		array.clear();
		int size = array.size();
		assertEquals(0, size);
	}

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
