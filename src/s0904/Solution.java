package s0904;
/*
substring左闭右开
初始化就是初始化，整成0，别从1开始初始化.
**/
public class Solution {
    public static void main(String[] args) {
        String s = "";
        int result = lengthOflengestSubstring(s);
        System.out.println(result);
    }
        /*
        一个son串，从一个字符开始，依次增加一个字符，每增加一个字符时查看son中有咩有这个字符，有则停止并>（更新length）。
        直到走到son.length=s.length
        然后从第二个字符开始，依次增加一个字符匹配，直到长度为length-1

        */
        public static int lengthOflengestSubstring(String s) {
            int length = 0;
            for(int i = 0;i < s.length();i++){

                int t = i;
                int now = t;
                //当 t = i 且 now = t 时，s.substring(t, now) 返回空字符串​
                //这意味着您从空子串开始检查，而不是从第一个字符开始
                //int length = 1;
                int plength = 0;
                String son = "";




                while(now < s.length()) {


                    if (son.contains(String.valueOf(s.charAt(now)))) {//第一次检查时总为false

                        break;

                        /*if (plength > length) {
                            length = plength;
                            System.out.print("plength>length ");
                            System.out.println("从" + (t+1) + "到" +( now+1));
                            System.out.print("son = ");
                            System.out.println(son);

                            break outerLoop;
                        }
                        System.out.print("plength<=length ");
                        System.out.println("从" + (t+1) + "到" + (now+1));
                        System.out.print("son = ");
                        System.out.println(son);
                        break outerLoop;
                        */
                    }


                    //add
                    //now++;
                    son = s.substring(t, now + 1);
                    //sunstring左闭右开
                    plength = son.length();
                    now++;

                    if(plength > length) {
                        length = plength;
                    }
                }

            }
            return length;
        }
}



/*
* class Solution {
    public int lengthOfLongestSubstring(String S) {
        char[] s = S.toCharArray(); // 转换成 char[] 加快效率（忽略带来的空间消耗）
        int n = s.length;
        int ans = 0;
        int left = 0;
        int[] cnt = new int[128]; // 也可以用 HashMap<Character, Integer>，这里为了效率用的数组
        for (int right = 0; right < n; right++) {
            char c = s[right];
            cnt[c]++; // 其实和hashmap的意思一样，这里是统计出现的次数，本质没有区别，无非hashmap使用的方式更简单点
            while (cnt[c] > 1) { // 窗口内有重复字母
                cnt[s[left]]--; // 移除窗口左端点字母，通过让其次数为0
                left++; // 缩小窗口
            }
            ans = Math.max(ans, right - left + 1); // 更新窗口长度最大值
        }
        return ans;
    }
}*/