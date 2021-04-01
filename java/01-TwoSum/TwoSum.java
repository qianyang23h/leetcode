public class TwoSum{
    public static void main(String[] args) {
        
        int[] nums = {2, 7, 11, 5};
        int targe = 9;

        int[] output;
        output = twosum_01(nums, targe);
        for(int i =0; i < output.length; i++){
            System.out.print(output[i] + " ");
        }
    }

    // 第一种解法：暴力解法
    public static int[] twosum_01(int[] nums, int target ){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }


}