public class BinarySearch {

    /*
     * Binary Search
     * Input: Searched Item (int), Sorted array of integers (int[])
     * Output: Index of the searched element in the array of integers (int)
     */
    public static int search(int searchedItem, int[] input) {

        /*
         * Initialise the variables
         */
        int n,
            lowerBound,
            upperBound,
            middle;

        /*
         * Assign values to the variables
         */
        n = input.length; // length of the array
        lowerBound = 0; // default lower bound of the search field
        upperBound = n - 1; // default upper bound of the search field

        /*
         * Perform the actual search
         * Divide the array into halves. If the searched element is in the middle, return its index.
         * Otherwise, limit the search area to one of the halves - based on whether the searched element
         * is lower or higher than the element in the middle. Split the new, limited area again into
         * halves and continue with this process until the searched element can be found in the middle.
         * Return its index.
         */
        while(lowerBound <= upperBound) {

            middle = (lowerBound + upperBound) / 2; // Determine the middle of the current search area.

            if(searchedItem == input[middle]) {
                // If the searched element is in the middle, return its index.
                return middle;
            } else if(searchedItem > input[middle]) {
                // If the searched element is bigger than the middle element, increase the lower bound.
                lowerBound = middle + 1;
            } else if(searchedItem < input[middle]) {
                // If the searched element is bigger than the middle element, decrease the upper bound.
                upperBound = middle - 1;
            }

        }

        /*
         * Return false
         * If no element could be found, return -1, which is equal to false.
         */
        return -1;

    }

}