#include <stdio.h>
#include <string.h>


// 罗马数字转数字
// 思路：
// 当前数字 > 后一位数字, 当前数字为正数
// 当前数字 < 后以为数字，当前数字为负
// 最后一位数字必定是正数

int getValue(char s){
    switch (s){
    case 'I': return 1;
    case 'V': return 5;
    case 'X': return 10;
    case 'L': return 50;
    case 'C': return 100;
    case 'D': return 500;
    case 'M': return 1000;
    default: return 0;
    }
}

int romanToInt(char * s){
    int output = 0;
    int len = strlen(s);
    for(int i = 0; i < len - 1; i++){
        // 这里调用两次getValue()所以比较耗费时间
        int currentNum = getValue(s[i]);
        int nextNum = getValue(s[i+1]);
        if(currentNum >= nextNum){
            output = output + currentNum;
        }
        else{
            output = output - currentNum;
        }
    }
    // 最后一位必定是正数
    output = output + getValue(s[len-1]);
    return output;
}



int main(){
    char *s = "LVIII";
    int output = romanToInt(s);
    printf("output:%d", output);
}



