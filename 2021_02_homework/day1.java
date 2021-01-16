package homework;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

public class day1 {
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Q-2
    // 解法一：重新赋值时保证每个元素往后移k位，如果超过数组长度就从头开始，(i+k)%length可以重新计算下标
    public static void rotate(int[] nums, int k){
        int len = nums.length;
        int[] ret = new int[len];
        for (int i = 0; i < len; i++) {
            ret[i] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[((i + k) % len)] = ret[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        rotate(arr,3);
        printArray(arr);
    }

    // 解法二：翻转数组
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate2(int[] nums, int k){
        k %= nums.length;
        reverse(nums, 0, nums.length-1); //首先将整个数组翻转
        reverse(nums, 0, k-1); //将要移动的k位进行翻转
        reverse(nums, k, nums.length-1); //将剩下的位置复原
    }




    // Q-1
//    public static String ToLowerCase(String str){
//        if(str == null || str.length() == 0){
//            return str;
//        }
//        char[] ch = str.toCharArray();
//        // a-z：97-122  A-Z：65-90  0-9：48-57
//        for (int i = 0; i < str.length(); i++) {
//            if(ch[i] >= 'A' && ch[i] <= 'Z'){
//                ch[i] += 32;
//            }
//
//        }
//        return String.valueOf(ch);
//    }
//    public static void main(String[] args) {
//        String str = "HeLlo";
//        System.out.println(str);
//        String ret = ToLowerCase(str);
//        System.out.println(ret);
//
//    }
}
