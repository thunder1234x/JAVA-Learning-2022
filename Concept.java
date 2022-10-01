import java.util.ArrayList;

class Concept{
    public static void helper(int[] nums, int index , int target , ArrayList<Integer> result){
        if(target == 0){
            System.out.println("\nSolution index " + result);
            return;
        }
        if (index == nums.length || target < 0) {
            // System.out.println();
            return;
        }
        int current = nums[index];
        // System.out.print(index + " ading / ");
        result.add(index);
        helper(nums, index+1, target-current, result);
        // System.out.print(index + " removing / ");
        result.remove(result.size()-1);
        helper(nums, index+1, target , result);
    }
    public static void main(String[] args) {
        int nums[]  = {2,7,11,15,5,1};
        ArrayList<Integer> list = new ArrayList<>();
        helper(nums, 0,21, list);

    }

}