public class HeapSort {

	public static int[] sort(int[] data) {
		
		/*
         * Initialise the variables
         */
		int length;
		
		/*
         * Assign values to the variables
         */
		length = data.length;
		
		/*
         * Create a maximum heap
         * Restore for every subheap with at least one child the heap condition.
         * Begin with small heaps at the bottom and continue until the full heap
         * is in shape.
         */
		for(int i = (length-2)/2; i >= 0; i--) {
			restoreHeapCondition(data, i, length-1);
		}
		
		/*
         * Perform sort
         * Remove maximum from the heap and put it at the end. Restore the heap
         * condition for all elements except the ones at the end, which have been
         * removed.
         */
		for(int last = length-1; last>=1; last--) {
			// Swap maximum with the last element
			Utilities.swap(data, 0, last);
			// Restore heap for all elements except the one which have been removed
			restoreHeapCondition(data, 0, last-1);
		}
		
		/*
         * Return sorted array
         */
		return data;
		
	}
	
	public static void restoreHeapCondition(int[] data, int i, int last) {
		
		// While the current element has at least one child
		while(2*i <= last) {
			// Index for the child
			int j = 2*i;
			// Check whether the element has two child
			if(j+1 <= last) {
				// If the element has two children, find out which one is the bigger
				if(data[j] < data[j+1]) {
					// If the second child is bigger then the first child, put the
					// child's index variable on it
					j++;
				}
			}
			// If the bigger child is bigger than its parent, swap them and adjust its index
			// variable. If that is not the case, the element has reached its position. Exit loop.
			if(data[i] < data[j]) {
				Utilities.swap(data, i, j);
				i = j;
			} else {
				break;
			}
		}
		
	}
	
}