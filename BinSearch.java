class BinSearch {

    public static void BinSearchWhileLoop(int nums[], int target) {
        /*
         * Binary search using while loop
         * Precondition: Make sure that the array is sorted
         */
        int front = 0, back = nums.length - 1, middle = 0;
        boolean isFound = false;

        while ((front <= back) && !isFound) {
            middle = (front + back) / 2;
            if (nums[middle] < target) {
                front = middle + 1;
            } else if (nums[middle] > target) {
                back = middle - 1;
            } else {
                isFound = true;
            }
        }

        if (isFound) {
            System.out.println("Found at " + middle);
        } else {
            System.out.println("Target not found");
        }

    }

    public static void BinSearchForLoop(int nums[], int target) {
        /*
         * Binary search using for loop
         * Precondition: Make sure that the array is sorted
         */

        int low = 0, high = nums.length, m = 0;

        for (int i = 0; i < high; i++) {
            m = (low + high) / 2;

            if (nums[m] < target) {
                low = m + 1;
            } else if (nums[m] > target) {
                high = m - 1;
            }
        }
        if (nums[m] == target)
            System.out.println("Found at " + m);
        else {
            System.out.println("Target not found");
        }
    }
}