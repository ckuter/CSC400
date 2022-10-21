public class ShoppingCart<T> implements BagInterface<T> {
	private final T[] bag;
	private int numberOfProducts;
	private static final int DEFAULT_CAPACITY = 25;
	
	public ShoppingCart() {
		this(DEFAULT_CAPACITY);
	}
	
	public ShoppingCart(int capacity) {
		@SuppressWarnings("unchecked")
		T[] tempBag = (T[]) new Object[DEFAULT_CAPACITY];
		bag = tempBag;
		numberOfProducts = 0;
	}
	
	@Override
	public boolean add(T newEntry) {
		boolean result = true;
		if (isArrayFull()) {
			result = false;
		}
		else {
			bag[numberOfProducts] = newEntry;
			numberOfProducts++;
		}
		return result;
	}
	
	@Override
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[numberOfProducts];
		for (int i = 0; i < numberOfProducts; i++) {
			result[i] = bag[i];
		}
		return result;
	}
	
	@Override
	public int getCurrentSize() {
		return 0;
	}
	
	private boolean isArrayFull() {
		return numberOfProducts >= bag.length;
	}
}