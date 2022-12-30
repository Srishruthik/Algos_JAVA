public class LinSearch {
    public static void linSearchForLoop(int[] nums, int target) {
        boolean found = false;
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                found = true;
                value = i;
                break;
            }
        }

        if (found) {
            System.out.println("Found at" + value);
        } else {
            System.out.println("Not found!");
        }

    }

    public static void linSearchForEach(int[] nums, int target) {
        boolean found = false;
        int value = 0;
        for (int num : nums) {
            if(num == target){
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found using for each loop");
        } else {
            System.out.println("Not found!");
        }

    }

    public static void linSearchWhileLoop(int[] nums, int target){
        boolean f = false;
        int i =0 ;
        while(i<nums.length){
            if(nums[i] == target){
                f= true;
                break;
            }
        }
        if(f){
            System.out.println("Found at"+i);
        }
        else{
            System.out.println("Not found");
        }
        

    }

}
