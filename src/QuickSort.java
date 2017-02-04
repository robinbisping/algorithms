public class QuickSort {
	
	public static int[] initialise(int[] data) {
		
		/*
         * Initialise the variables
         */
        int n,
            lowerBound,
            upperBound;
        
        /*
         * Assign values to the variables
         */
        n = data.length;  // length of the array
        lowerBound = 0; // default lower bound of the search field
        upperBound = n - 1; // default upper bound of the search field
        
        /*
         * Perform sort
         */
        sort(data, lowerBound, upperBound);
        
        /*
         * Return sorted array
         */
        return data;
		
	}

	public static void sort(int[] data, int left, int right) {
		
        /*
         * Perform sort
         * Quick sort is a recursive algorithm. It divides the array into two partitions,
         * where all elements to the left of a chosen pivot are smaller than the pivot
         * and all elements to right are bigger. After dividing the array into subarrays,
         * these subarrays are sorted in the same way recursively.
         * The pivot element can be chosen in a couple of ways, the easiest is to take the last
         * element. Other strategies, for example the so called 3-Median-Strategy, try to find
         * an element that is more likely in the middle so that the partitions are equally large,
         * which would result in a better performance of the algorithm.
         * 
         */
        if(left < right) {
        	// Partition the array so that all elements left of the pivot are smaller
        	// and the elements on the right hand side are bigger than the pivot
        	int middle = partition(data, left, right);
        	// Sort the subarray left of the pivot recursively
        	sort(data, left, middle - 1);
        	// Sort the subarray right of the pivot recursively
        	sort(data, middle + 1, right);
        }
		
	}
	
	public static int partition(int[] data, int left, int right) {
		
		/*
         * Initialise the variables
         */
		int pivot, // Pivot element
			i, // Left pointer
			j; // Right pointer
		
		/*
         * Assign values to the variables
         */
		pivot = data[right]; // Choose the last element as the pivot
		i = left; // Pointer that travels from left to right
		j = right - 1; // Pointer that travels from right to left
		
		// While the left pointer is smaller than right pointer
		while(i < j) {
			// If the element at the left pointer is smaller than
			// the pivot, the pointer moves one to the right
			while(i < right && data[i] < pivot)
				i++;
			// If the element at the right pointer is bigger than
			// the pivot, the pointer moves one to the left
			while(j > left && data[j] > pivot)
				j--;
			// Make sure that the pointers have not crossed each other
			if(i < j) {
				// Elements have been found that are, compared to the pivot, 
				// not in order. Swap them so that they are in order.
				Utilities.swap(data, i, j);
			}
		}
		
		// If the partition is already sorted according to
		// the pivot, the pivot stays where it is
		if(data[i] < data[right])
			return right;
		
		// Swap the pivot into the middle of the two parts
		Utilities.swap(data, i, right);
		// Return the position of the pivot
		return i;
		
	}
	
}