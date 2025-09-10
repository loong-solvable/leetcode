package s0910;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));

        int t = -123;
        int p = t % 10;
        System.out.println(p);//负数取模出来的还是负数
    }

    public static int reverse(int x){
        if(x == 0){
            return 0;
        }
        if(x < 0){
            x = -x;
            while(x % 10 == 0) {
                x /= 10;
            }
            String Sresult1 = "-";

            int i;
            while(x > 0){
                i = x % 10;
                x /= 10;

                Sresult1  = Sresult1 + Integer.toString(i);
            }
//            int f;
//            f = Integer.parseInt(Sresult1);
//            return f;
            try{
                return Integer.parseInt(Sresult1);
            }catch (NumberFormatException e) {
                return 0;
            }

        }

        while(x % 10 == 0) {
            x /= 10;
        }
        String Sresult = "";
        while(x > 0){
            int i;
            i = x % 10;
            x /= 10;
            Sresult = Sresult + Integer.toString(i);
        }
//        int f;
//        f = Integer.parseInt(Sresult);
//        return f;
        try{
            return Integer.parseInt(Sresult);
        }catch (NumberFormatException e) {
            return 0;
        }
        //不妨试试StringBuilder

    }//未实现超过32位有符号整数范围的处理
}
