package s0916;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {99,7,-1,10,8};
        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
/*
    public static void bubble(int[] arr){
        int temp = 0;
        boolean swapped = false;
        int n = arr.length;
        for(int i = 0;i < n - 1;i++){
            //System.out.println(i+1 + Arrays.toString(arr));

            swapped = false;
            for(int j = 0;j < n - i - 1;j++){//每次循环把大的放到后面
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                   // System.out.println("    " + Arrays.toString(arr));
                }
            }

            if(swapped == false)//当遍历一次后没有发生任何交换，说明数组有序，可以提前结束
                break;

        }
    }
}

*/



/*
* public static void b(int[] arr){
*
* boolean flag = false;
* int n = arr.length;
* for(int i = 0;i < n;i++){
*   flag = false;
*   for(int j = 0;j < n - i - 1;j++){
*       if(arr[j] > arr[j + 1]){
*               int temp;
*           temp = arr[j];
*       arr[j] = arr[j +  1];
*       arr[j + 1] = temp;
*
* flag = true;
* }
* }
*
*       if(flag == false){
*           break;
* }
* }
* }
* */

//public static void BubbleSort(int[] a) {
//    int temp;
//    boolean swapped = false;
//    int n;
//    n = a.length;
//
//    for (int i = 0; i < n - 1; i++) {
//        swapped = false;
//        for (int j = 0; j < n - i - 1; j++) {
//            if (a[j] > a[j + 1]) {
//                temp = a[j];
//                a[j] = a[j + 1];
//                a[j + 1] = temp;
//                swapped = true;
//            }
//            if (swapped == false) {
//                break;
//            }
//        }
//    }
//}



    public static void BubbleSort(int[] a){
        int temp;
        boolean swapped = false;
        int n;

        n = a.length;

        for(int i = 0;i < n - 1;i++){
            swapped = false;

            for(int j = 0;j < n - i - 1;j++){
                if(a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }

    }

}
