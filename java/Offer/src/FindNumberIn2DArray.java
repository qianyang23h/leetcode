
public class FindNumberIn2DArray {

    // 剑指Offer4：二维数组中查找
    // 方法一：暴力
    // 方法二：右上角 和 左下角 都可以，但是右上角需要判断矩阵是否为空
    //        以“右上角”为坐标原点
    //        当前数字 > target 向左找
    //        当前数字 < target 向下找
    //        以“左下角”为坐标原点
    //        当前数字 > target 向上找
    //        当前数字 < target 向右找

    // 方法一：
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            for(int j =0; j < matrix[i].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }


    // 方法二：
    public static boolean findNumberIn2DArray_2(int[][] matrix, int target){
        // 右上角需要判读二维数组是否为空， 而左下角不需要判断二维数组是否为空
        if(matrix==null||matrix.length==0||(matrix.length==1&&matrix[0].length==0)) return false;
        int i = 0;
        int j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] > target){
                j--;
            }
            else if(matrix[i][j] < target){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        boolean ret = findNumberIn2DArray_2(matrix, target);
        System.out.println("output: " + ret);
    }
}
