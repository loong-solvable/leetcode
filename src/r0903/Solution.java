package r0903;
//递归

/*
为什么这个解决方法要特意再写一个addTwo函数在addTwoNumbers里?
    解决 递归需要额外状态（进位）的问题，同时保持公共接口的简洁性
使用private修饰，对外部函数隐藏信息。防止外部代码错误滴直接调用他。强制使外部函数只能通过设计好的入口addtwonumbers来使用，确保初始化正确。

哑节点（Dummy Node）
不存储有效数据
值通常是任意值（如 -1、0 等），不会被实际使用
位于真实链表头部之前
 */

public class Solution {

    static class Listnode {
        int val;  // 一个val 一个 next
        Listnode next;
        Listnode() {}
        Listnode(int val) {this.val = val;}   //下面是构造方法
        Listnode(int val, Listnode next){
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        Listnode l1 = new Listnode(2, new Listnode(4, new Listnode(2)));  //创建链表，那么
                                                                                        //如果一串很长的数字该怎么办呢？
        Listnode l2 = new Listnode(1,new Listnode(6,new Listnode(4)));

        Listnode result = new Solution().addTwoNumbers(l1,l2);

//        int length = 0;   242 461
//        Listnode t = result;
//        while(t != null) {
//           // System.out.print(result.val);
//            length++;
//            t = t.next;
//        }

            prl(result);


        //System.out.println(length);

    }


    public  Listnode addTwoNumbers(Listnode l1, Listnode l2) {
        return addTwo(l1, l2, 0);
    }

    //递归逆序打印链表
    public static void prl(Listnode head){
        if(head == null)
            return ;
        prl(head.next);
        System.out.print(head.val);
    }

    private Listnode addTwo(Listnode l1, Listnode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int s = carry;
        if (l1 != null) {
            s += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            s += l2.val;
            l2 = l2.next;
        }

        return new Listnode(s % 10, addTwo(l1, l2, s / 10));

    }
}


/*
2. 两数相加
尝试过
中等
相关标签
premium lock icon
相关企业
给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

你可以假设除了数字 0 之外，这两个数都不会以 0 开头。


输入：l1 = [2,4,3], l2 = [5,6,4]
输出：[7,0,8]
解释：342 + 465 = 807.
示例 2：

输入：l1 = [0], l2 = [0]
输出：[0]
示例 3：

输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
输出：[8,9,9,9,0,0,0,1]

 */