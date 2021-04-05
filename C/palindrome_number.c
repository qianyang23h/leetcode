#include <stdio.h>
#include <stdbool.h>
#include <limits.h>
#include <stdbool.h> // C语言中，布尔相关声明在头文件<stdbool.h>中

// 回文数
// 方法一：反转数字本身（但这样需要考虑整数溢出的问题）
// 方法二：反转一半数字


// 方法一：反转数字本身
bool isPalindrome_01(int x){
    int input = x;

    if(x <0){
        return false;
    }

    int rev = 0;
    int pop;
    while(x != 0){
        pop = x % 10;
        x = x /10;

        if(rev > INT_MAX / 10 || (rev == INT_MAX /10 && pop > INT_MAX % 10)) return false;
        if(rev < INT_MIN / 10 || (rev == INT_MIN / 10 && pop < INT_MIN % 10)) return false;

        rev = rev * 10 + pop;
    }

    if(rev == input){
        return true;
    }
    else{
        return false;
    }
}

// 方法二：反转一半数字
// 先剔除特例，负数不是回文，个位数为0的不是回文(0本身是回文)
// 难点：怎么判断已经反转了一半的数字？ x > rev

bool isPalindrome_02(int x){
    if(x < 0 || (x % 10 == 0 && x != 0)){
        return 0;
    }

    int rev = 0;
    int pop;
    while(x > rev){
        pop = x % 10;
        x = x / 10;
        rev = rev * 10 + pop;
    }

    printf("rev:%d\n",rev);
    printf("x:%d\n",x);
    return x == rev || x == rev / 10;
}


int main(){
    int x = 1221;
    bool res = isPalindrome_02(x);
    printf("output:%d", res);
}

