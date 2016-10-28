public class BubbleSort {

    /*
     * Bubble Sort
     * Input: Potentially unsorted array of integers (int[])
     * Output: Sorted array of integers (int[])
     */
    public static int[] sort(int[] input) {

        /*
         * Initialise the variables
         */
        int n;

        /*
         * Assign values to the variables
         */
        n = input.length;

        /*
         * Perform sort
         * Check for each element whether it is bigger than the following one. If this is the case,
         * change them. Repeat this process as many times as there are elements in the array.
         */
        // Perform the sort n-1 times so that even the potential smallest element at the end can reach
        // its right place at the beginning.
        for(int i = 0; i < n - 1; i++) {

            // Loop through each element.
            for(int j = 0; j < n - 1; j++) {

                // If the element is bigger than the following one, swap them around.
                if(input[j] > input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }

            }

        }

        /*
         * Return sorted array.
         */
        return input;

    }

}
