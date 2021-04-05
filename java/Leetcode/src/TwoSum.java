import java.util.HashMap;
import java.util.Map;

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

    // 解法一：暴力解法
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

    // 解法二：哈希表(用空间换时间)
    // 哈希查找的复杂度为O(1)，所以用哈希容器Map降低时间复杂度
    // 将查找 target - x的复杂度从O(n)降到O(1)
    // 步骤：创建一个map，对于每个x，看是否能在map中找到target-x。
    // 如果不能，将x存入map
    // 如果能，返回

    public static int[] twosum_02(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}