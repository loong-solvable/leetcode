package s0911;

import java.util.Arrays;
import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        String s = "+";
        System.out.println(myAtoi(s));

    }

    public static int myAtoi(String s) {
        int result;
        int i = 0;
        if(s.length() == 0){
            return 0;
        }
        char n[] = s.toCharArray();
        if(!((n[i] <= '9' && n[i] >= '0') || n[i] == '+' || n[i] == '-' || n[i] == ' ')){//第一个字符非数字、kongge、+-，终止
            return 0;
        }
//        while(n[i] == ' '){
//            try {
//                i++;
//            }catch (ArrayIndexOutOfBoundsException e){
//                return 0;
//            }
//        }//去除前面的空格
        while(i < n.length && n[i] ==' '){
            i++;
        }
        if(i >= n.length) {
            return 0;
        }

        if(!((n[i] <= '9' && n[i] >= '0') || n[i] == '+' || n[i] == '-')){//第一个字符非数字，终止
            return 0;
        }
        int flag = 1;//设置符号位，默认和+号都是整数，flag=1

        if(n[i] < '0' || n[i] > '9' ) {
            flag = (n[i] == '-') ? 0 : 1;
            try {
                i++;
            }catch (ArrayIndexOutOfBoundsException e){
                return 0;
            }

        }
        if(i >= n.length) {
            return 0;
        }

            if(!((n[i] <= '9' && n[i] >= '0') )){//符号后字符非数字，终止
                return 0;
            }




        while(i < n.length && n[i] == '0'){
            i++;
        }
        if(i >= n.length) {
            return 0;
        }
        if(!Character.isDigit(n[i])){//0后字符非数字，终止
            return 0;
        }
//        if(! Character.isDigit(n[i])){
//            return 0;
//        }
        //现在肯定是数字
        int r;
        int l = i;//记录左边界
//

        while(i < n.length && n[i] <= '9' && n[i] >= '0'){
            i++;
        }

        r = i; //r是数组之外的最近一个

        if(l >= r)
            return 0;


        char[] p = Arrays.copyOfRange(n,l,r);

        try {
            result = Integer.parseInt(new String(p));
            if(flag == 0){
                result = -result;
            }
        }catch (NumberFormatException e){
            if(flag == 1)
                return Integer.MAX_VALUE;
                else{
                    return Integer.MIN_VALUE;
            }


        }

        return result;









    }
}
