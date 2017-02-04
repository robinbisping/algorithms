public class MergeSort {
	
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
         * Return sorted array.
         */
		return data;
		
	}

	public static void sort(int[] data, int left, int right) {
		
		/*
         * Perform sort
         * This implementation of the merge sort algorithm is recursive. It divides
         * the array up into small subarrays with one element each and merges them
         * together afterwards to a new sorted subarray with two elements each. This
         * procedure is repeated until the array is fully sorted. 
         */
		if(left < right) {
			int middle = (left + right) / 2;
			sort(data, left, middle);
			sort(data, middle + 1, right);
			merge(data, left, middle, right);
		}    
		
	}
	
	public static void merge(int[] data, int left, int middle, int right) {
		
		/*
         * Initialise the variables
         */
		int[] temporaryArray;
		int j, // Pointer in the left subarray
			i, // Pointer in the right subarray
			k; // Pointer in the temporary array
		
		/*
         * Assign values to the variables
         */
		temporaryArray = new int[right - left + 1]; // Temporary Array where the two subarrays are merged into
		i = left; // Pointer in the left subarray, goes from left to right
		j = middle + 1; // Pointer in the right subarray, goes from left to right
		k = 0; // Pointer in the temporary array, goes from left to right
		
		// While the two subarray pointers are still their subarray
		while(i <= middle && j <= right) {
			// Choose the smaller element of the two subarrays
			if(data[i] <= data[j]) {
				// If the smaller element is in the left subarray, copy it to 
				// the temporary array and move the pointer to the next element
				temporaryArray[k] = data[i];
				i++;
			} else {
				// If the smaller element is in the right subarray, copy it to 
				// the temporary array and move the pointer to the next element
				temporaryArray[k] = data[j];
				j++;
			}
			// Increase the temporary array's pointer in both cases
			k++;
		}
		
		// If the left subarray is not finished yet, copy the rest to the end
		while(i <= middle) {
			temporaryArray[k] = data[i];
			i++;
			k++;
		}
		// If the right subarray is not finished yet, copy the rest to the end
		while(j <= right) {
			temporaryArray[k] = data[j];
			j++;
			k++;
		}
		
		// Copy the temporary array back to the initial array
		for(k = left; k <= right; k++) {
			data[k] = temporaryArray[k - left];
		}
		
	}
	
}