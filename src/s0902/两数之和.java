package s0902;
import java.util.Arrays;

/*

1.条件判断后不能缺少return，使用throw new IllegalArgumentException不失为一种选择
2.直接创建一个新数组返回：  return new int[] {1,2,3}
3.System.out.println()不能直接打印整数数组,应使用 Arrays.toSring()转换
    java中数组是“对象”，并不是基本类型
    虽说不能直接打印，事实上System.out.println()可以打印几乎所有类型

 */


class 两数之和 {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 22;
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0;i < nums.length ;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j}; //返回一个数组的写法.
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution"); //错误处理，不然还得再写个return
    }


}


















//package s0902;
//
//import java.util.HashMap;
//import java.util.Map;
//
//class 两数之和 {
//    public static void main(String[] args) {
//        // 测试用例
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//
//        int[] result = twoSum(nums, target);
//        System.out.println("[" + result[0] + ", " + result[1] + "]");
//    }
//
//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> idx = new HashMap<>();
//        for (int j = 0; j < nums.length; j++) {  // 添加循环终止条件
//            int x = nums[j];
//            int complement = target - x;
//
//            if (idx.containsKey(complement)) {
//                return new int[]{idx.get(complement), j};
//            }
//            idx.put(x, j);
//        }
//        throw new IllegalArgumentException("No two sum solution");  // 添加未找到的异常
//    }
//}