package r0909;

import java.util.ArrayList;
import java.util.List;


//没明白题是按什么规则，直接看答案



/*
行容器
特别适合需要频繁修改字符串的场景
String rowContent = rows.get(i).toString(); // 获取第i行的字符串 获取
*/

/*
* // 输入：s = "LEETCODE", numRows = 3
List<StringBuilder> rows = new ArrayList<>();
*
* 1. 面向接口编程
​**声明为 List**​：代码不依赖具体实现
​好处​：未来可轻松替换为其他 List 实现（如 LinkedList）
2. 泛型保证类型安全
​**<StringBuilder>**​：确保列表中只能存储 StringBuilder 对象
​好处​：避免类型错误，编译器会检查
3. 钻石操作符简化
​**<>**​：编译器自动推断泛型类型为 StringBuilder
​等价于​：new ArrayList<StringBuilder>()
*
* <>泛型 钻石运算符
*
*
rows.add(new StringBuilder()); // 行0
rows.add(new StringBuilder()); // 行1
rows.add(new StringBuilder()); // 行2

// 添加字符
rows.get(0).append('L'); // i=0
rows.get(1).append('E'); // i=1
rows.get(2).append('E'); // i=2
rows.get(1).append('T'); // i=1
rows.get(0).append('C'); // i=0
rows.get(1).append('O'); // i=1
rows.get(2).append('D'); // i=2
rows.get(1).append('E'); // i=1

// 各行内容：
// 行0: "LC"
// 行1: "ETOE"
// 行2: "ED"

// 拼接结果
StringBuilder res = new StringBuilder();
res.append(rows.get(0)); // "LC"
res.append(rows.get(1)); // "ETOE"
res.append(rows.get(2)); // "ED"
return res.toString(); // "LCETOEED"*/

public class Solution {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";//局部变量不用public声明，他们是私有的
        int numRows = 3;

        ;
    }

    public String convert(String s, int numRows) {
        if (numRows < 2) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }//行容器初始化

        int i = 0;
        int flag = -1;

        for (char c : s.toCharArray()) {
            rows.get(i).append(c);

            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }

            i += flag;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();


    }
}