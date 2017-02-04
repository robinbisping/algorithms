public class BubbleSort {

    /*
     * Bubble Sort
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
        n = data.length; // length of the array
        lowerBound = 0; // default lower bound of the search field
        upperBound = n - 1; // default upper bound of the search field

        /*
         * Perform sort
         * Check for each element whether it is bigger than the following one. If this is the case,
         * change them. Loop with this procedure as many times as there are elements through the array.
         */
        // Perform the sort n-1 times so that even the potential smallest element at the end can reach
        // its right place at the beginning.
        for(int i = lowerBound; i < upperBound; i++) {

            // Loop through each element.
            for(int j = lowerBound; j < upperBound; j++) {

                // If the element is bigger than the following one, swap them around.
                if(data[j] > data[j+1]) {
                	Utilities.swap(data, j, j+1);
                }

            }

        }

        /*
         * Return sorted array.
         */
        return data;

    }

}
