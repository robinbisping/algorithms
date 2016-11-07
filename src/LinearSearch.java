public class LinearSearch {

    /*
     * Linear Search
     * Input: Searched Item (int), Potentially unsorted array of integers (int[])
     * Output: Index of the searched element in the array of integers (int)
     */
    public static int search(int searchedItem, int[] input) {

        /*
         * Initialise the variables
         */
        int n,
            lowerBound,
            upperBound;

        /*
         * Assign values to the variables
         */
        n = input.length; // length of the array
        lowerBound = 0; // default lower bound of the search field
        upperBound = n - 1; // default upper bound of the search field

        /*
         * Perform the actual search
         * Loop through each and every element and check whether it has the same value as
         * the searched item. If so, return its index.
         */
        // Loop through all elements
        for(int i = lowerBound; i <= upperBound; i++) {

            // Check whether the current element's value is equal to the searched item.
            // If that is the case, return the current index.
            if(input[i] == searchedItem) {
                return i;
            }

        }

        /*
         * Return false
         * If no element could be found, return -1, which is equal to false.
         */
        return -1;

    }


}
