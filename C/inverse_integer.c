#include <stdio.h>
#include <limits.h>

// 整数反转
// 考点：弹出推入数字 & 溢出检查
// 小知识：INT_MAX是在头文件<limits.h>中声明的

int reverse(int x){
    int rev = 0;
    int pop;

        while(x != 0){
            pop = x % 10;
            x = x / 10;

            // 溢出检查
            if(rev > INT_MAX / 10 || (rev == INT_MAX / 10 && pop > INT_MAX % 10)){
                return 0;
            }
            if(rev < INT_MIN / 10 || (rev == INT_MIN / 10 && pop < INT_MIN % 10)){
                return 0;
            }

            rev = rev * 10 + pop;
        }
    return rev;
}


int main(){

    // int a = 16666469;
    // int output = reverse(a);
    // printf("output: %d", output);

    return 0;
}
