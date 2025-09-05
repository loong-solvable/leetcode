package s0905;

public class Solution {
    public static void main(String[] args) {
        int []num1;
        int []num2;
        num1 = new int[]{1,2};
        num2 = new int[]{3,4};

        double result = findMedianSortedArrays(num1,num2);
        var r = String.format("%.5f",result);
        System.out.println(r);
    }
    /*
    先合并两个数组，
    检测总个数为单数or双数
    idx走到中间，直接输出s[idx]
    找出中间的数;
    * */

    public static  double findMedianSortedArrays(int[] num1, int[] num2) {
        int l1 = num1.length;//数组使用length属性，字符串使用length方法length()
        int l2 = num2.length;
        int length = l1 + l2;
        int result1 =0;
        int result2 = 0;
        int[] s = new int[length];
        //1 3 4 6 9
        //2 5 9
        int p1 = 0;
        int p2 = 0;
        int p = 0;//s的index
        int idx;
        int idxx;

        while(p1 < l1 &&p2 < l2){
            if(num1[p1] < num2[p2]){
                s[p++] = num1[p1++];
            }else{
                s[p++] = num2[p2++];
            }
        }
        while (p1 < l1) {
            s[p++] = num1[p1++];
        }
        while (p2 < l2) {
            s[p++] = num2[p2++];
        }

        if(length % 2 == 1){
            //System.out.println("奇数");
            return (double)s[length / 2];
        }else{
            //System.out.println("oushuy0");
            return (double)(s[length/2] + s[length/2 - 1]) / 2;
        }
       /* if((length & 1) != 0 ){//判断length是不是奇数，！=0的作用是将结果转换为boolean类型
            System.out.println("总长度是奇数");
            idx = length / 2;



            while(p1 < l1 || p2 < l2){



                if(num1[p1] < num2[p2]){

                    s[p++] = num1[p1++];

                    ;

                }else{
                    s[p++] = num2[p2++];
                }
                System.out.print("s idx是");
                System.out.println(s[idx]);
                if((p-1) == idx) {
                    return (double) s[idx];
                }


            }

        }else{
            System.out.println("总长度是偶数");

            idx = length / 2;
            idxx = idx + 1;

            while(p1 < l1 || p2 < l2){



                if(num1[p1] < num2[p2]){

                    s[p++] = num1[p1++];

                    ;

                }else{
                    s[p++] = num2[p2++];
                }

                if(p - 1 == idx) {
                    return (double) s[idx] + s[idxx];
                }



            }
        }


        */



        //return (double) 66666;
    }





}
