package s0915;



public class Solution {
    public static void main(String[] args) {
        int x = 1;
        if(x == 0){
            System.out.println("true");
            return ;
        }
        if(isPalindrome(x))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static boolean isPalindrome(int x) {

        String s = Integer.toString(x);
        if(s.length() == 1){
            //System.out.println("true");
            return true;
        }
        int l,r;
        l = 0;
        r = s.length() - 1;
        while(s.charAt(l) == s.charAt(r)){
            if(l > r)
                return true;
            l++;
            r--;
        }
        return false;
    }

}


/*class Solution {
    public boolean isPalindrome(int x) {
     if(x<0 || (x % 10 == 0 && x != 0)){
        return false;
     }
     int number = 0;
     while(x > number){
        number = number * 10 +x % 10;
        x /=10;
     }
     return x == number || x == number /10;
    }
}*/