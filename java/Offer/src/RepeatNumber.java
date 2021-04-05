
public class RepeatNumber {
    
    // 找重复数字
    // 方法一：排序
    // 方法二：哈希表 遍历nums，当前数字存在于哈希表中，返回；当前数字不存在于哈希表，将其存入哈希表
    // 方法三：数组count[], 相应位置存相应数字，如果count[num[i]] > 1，即表示该数字重复
    // 方法四：原地置换 时间复杂度O(n) 空间复杂度O(1)


    // 方法三
    public static int findRepeatNumber(int[] nums){
        int[] count = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(++count[nums[i]] > 1){
                return nums[i];
            }
        }
        return 0;
    }

    // 方法四
    public static int findRepeateNumber_4(int[] nums){
        for(int i = 0; i < nums.length; i++){
            while(nums[i] != i){
                if(nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                else{
                    // 位置nums[i]和i的数字交换
                    int tmp = nums[i];
                    nums[i] = nums[tmp];
                    nums[tmp] = tmp;

                    // 这里有一种错误的写法: nums[i]已经改变，所以nums[nums[i]]也发生改变，应该直接写成nums[temp]
                    // int temp = nums[i];
                    // nums[i] = nums[nums[i]];
                    // nums[nums[i]] = temp;
                }
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        // 动态初始化方式（指定长度） 略
        // 静态初始化方式（指定内容）
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        int res = findRepeatNumber(nums);
        System.out.println("res:" + res);
    }
}
