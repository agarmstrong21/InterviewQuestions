public class TwoSum {
    public static int[] twoSum(int[]nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static void main (String[] args){
        int[] input = {2,7,11,15};
        int target = 9;
        for(int i = 0; i < 2; i++){
            System.out.println(twoSum(input,target)[i] + ", ");
        }
    }
}
