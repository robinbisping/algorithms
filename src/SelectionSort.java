public class SelectionSort {

    /*
     * Selection Sort
     * Input: Potentially unsorted array of integers (int[])
     * Output: Sorted array of integers (int[])
     */
    public static int[] sort(int[] data) {

        /*
         * Initialise the variables
         */
        int n,
            lowerBound,
            upperBound,
            pivot;

        /*
         * Assign values to the variables
         */
        n = data.length;  // length of the array
        lowerBound = 0; // default lower bound of the search field
        upperBound = n - 1; // default upper bound of the search field

        /*
         * Perform sort
         * Find for each position the right element by searching all remaining elements on the
         * left side and selecting the smallest one.
         */
        // Loop through all positions
        for(int i = lowerBound; i < upperBound; i++) {

            // Select the position
            pivot = i;

            // Loop through all remaining elements on the right side and save the smallest element's
            // index in the variable pivot
            for(int j = i + 1; j <= upperBound; j++) {
                if(data[j] < data[pivot]) {
                    pivot = j;
                }
            }

            // If a smaller element than the element on the current position could have been found, swap them.
            if(pivot != i) {
                int temp = data[i];
                data[i] = data[pivot];
                data[pivot] = temp;
            }

        }

        /*
         * Return sorted array.
         */
        return data;

    }

}
