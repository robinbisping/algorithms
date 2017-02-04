public class InsertionSort {

    /*
     * Insertion Sort
     * Input: Potentially unsorted array of integers (int[])
     * Output: Sorted array of integers (int[])
     */
    public static int[] sort(int[] data) {

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
         * Move every element once at a time to its correct place by comparing it with the previous
         * element (and the previous element of the previous element, ...).
         */
        // Loop through each element.
        for(int i = lowerBound; i <= upperBound; i++) {

            // Find the element's right place.
            for(int j = i - 1; j >= lowerBound && data[j] > data[j+1]; j--) {
            	Utilities.swap(data, j, j+1);
            }

        }

        /*
         * Return sorted array.
         */
        return data;

    }

}