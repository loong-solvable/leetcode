
//窗口的思想?
package r0908;

//把字符串转化为字符数组
//
//int l = i / 2;
//int r = (i + 1) / 2;
//
//2n-1个回文中心

/*
* class Solution {
    public String longestPalindrome(String S) {
        char[] s = S.toCharArray();
        int n = s.length;
        int ansLeft = 0;
        int ansRight = 0;

        // 奇回文串
        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < n && s[l] == s[r]) {
                l--;
                r++;
            }
            // 循环结束后，s[l+1] 到 s[r-1] 是回文串
            if (r - l - 1 > ansRight - ansLeft) {
                ansLeft = l + 1;
                ansRight = r; // 左闭右开区间
            }
        }

        // 偶回文串
        for (int i = 0; i < n - 1; i++) {
            int l = i;
            int r = i + 1;
            while (l >= 0 && r < n && s[l] == s[r]) {
                l--;
                r++;
            }
            if (r - l - 1 > ansRight - ansLeft) {
                ansLeft = l + 1;
                ansRight = r; // 左闭右开区间
            }
        }

        return S.substring(ansLeft, ansRight);
    }
}

作者：灵茶山艾府
链接：https://leetcode.cn/problems/longest-palindromic-substring/solutions/2958179/mo-ban-on-manacher-suan-fa-pythonjavacgo-t6cx/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
*
*
* class Solution {
    public String longestPalindrome(String S) {
        char[] s = S.toCharArray();
        int n = s.length;
        int ansLeft = 0;
        int ansRight = 0;

        for (int i = 0; i < 2 * n - 1; i++) {
            int l = i / 2;
            int r = (i + 1) / 2;
            while (l >= 0 && r < n && s[l] == s[r]) {
                l--;
                r++;
            }
            // 循环结束后，s[l+1] 到 s[r-1] 是回文串
            if (r - l - 1 > ansRight - ansLeft) {
                ansLeft = l + 1;
                ansRight = r; // 左闭右开区间
            }
        }

        return S.substring(ansLeft, ansRight);
    }
}

作者：灵茶山艾府
链接：https://leetcode.cn/problems/longest-palindromic-substring/solutions/2958179/mo-ban-on-manacher-suan-fa-pythonjavacgo-t6cx/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/



public class Solution {
    public static String longestPalindrome(String s) { // 修复方法名拼写
        if (s.length() == 0) {
            return "";
        }

        String longest = ""; // 记录最长回文子串
        int maxLen = 0; // 记录最长回文子串的长度

        for (int i = 0; i < s.length(); i++) { // 修复循环条件
            int j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) == s.charAt(j)) {
                    int p1 = i;
                    int p2 = j;
                    // 检查i到j之间是否是回文
                    while (p1 < p2 && s.charAt(p1) == s.charAt(p2)) {
                        p1++;
                        p2--;
                    }
                    // 如果是回文
                    if (p1 >= p2) {
                        String candidate = s.substring(i, j + 1);
                        // 更新最长回文子串
                        if (candidate.length() > maxLen) {
                            maxLen = candidate.length();
                            longest = candidate;
                        }
                    }
                }
                j--; // 继续检查更小的j
            }
        }

        // 如果没有找到回文子串，返回第一个字符
        if (longest.isEmpty()) {
            return s.substring(0, 1);
        }
        return longest;
    }

    public static void main(String[] args) {
        String s = "aacabdkacaa";
        String result = longestPalindrome(s);
        System.out.println(result); // 输出 "aca"
    }
}
/*public class Solution {
    public static String longestPalidrome(String s) {
        int i ,j;
        if(s.length() == 0){
            return "";
        }
        for(i = 0,j = s.length() - 1; i != j;i++,j = s.length() - 1){
            int p1 ;
            int p2 ;
            while(i < j && s.charAt(i) != s.charAt(j)){
                j--;
            }
            if(i==j){
                continue;
            }
            p1 = i;
            p2 = j;
            while(p1 < p2 && s.charAt(p1) == s.charAt(p2)){

                p1++;
                p2--;


            }
            if(p1 == p2){
                return s.substring(i,j+1);
            }


        }

        return String.valueOf(s.charAt(0));

    }

    public static void main(String[] args) {
        String s = "cbbd";
        String result = longestPalidrome(s);
        System.out.println(result);
    }

}*//*
package r0908;

public class Solution {
    public static String longestPalindrome(String s) { // 修复方法名拼写
        int i, j;
        if (s.length() == 0) {
            return "";
        }
        for (i = 0; i < s.length(); i++) { // 修复循环条件
            j = s.length() - 1; // 每次循环重置j
            while (i < j && s.charAt(i) != s.charAt(j)) {
                j--;
            }
            if (i == j) {
                continue;
            }
            int p1 = i;
            int p2 = j;
            while (p1 < p2 && s.charAt(p1) == s.charAt(p2)) {
                p1++;
                p2--;
            }
            if (p1 >= p2) { // 修复判断条件（包含p1>p2的情况）
                return s.substring(i, j + 1);
            }
        }
        return String.valueOf(s.charAt(0));
    }

    public static void main(String[] args) {
        String s = "cbbd";
        String result = longestPalindrome(s); // 修复方法名匹配
        System.out.println(result);
    }
}*/
