public class BinaryHeap {
	
	private Object[] array;
	private int heapSize;
	
	public BinaryHeap() {
		this.array = new Object[10];
		this.heapSize = 0;
	}

	public void add(int val) {
		// TODO Auto-generated method stub
		if (heapSize == array.length) {
			grow();
			this.add(val);
		} else {
			this.heapSize++;
//			array[heapSize - 1] = val;
			shiftUp(heapSize - 1);
		}
	}
	
	public int remove() {
		// TODO Auto-generated method stub
		
		this.heapSize--;
		if (heapSize < 0) {
			throw null;
		}
		return 1;
	}

	private void shiftUp(int i) {
		// TODO Auto-generated method stub
		int index, temp;
		
		
	}
	
	private void grow() {
		Object[] temp = new Object[this.array.length*2];
		
		//TODO Not sure if there's a specific order here
		for (int x = 0; x < this.array.length; x++) {
			temp[x] = array[x];
		}
		
		this.array = temp;
	}
	
	/**
	 * Debug Methods
	 */
	public void size() {
		System.out.println(this.heapSize);
	}
	
	public void print() {
		for (int x = 0; x < this.heapSize; x++) {
			System.out.print(this.array[x] + " ");
		}
	}
	
	public static void main(String[] args) {
		BinaryHeap heap = new BinaryHeap();
		heap.add(1);
		System.out.println(heap.heapSize);
		heap.print();
	}
}