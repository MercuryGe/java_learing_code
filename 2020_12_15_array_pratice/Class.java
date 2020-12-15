public class Class {
    //找到数组中的最大元素
//    public static int findMax(int[] array){
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if(max < array[i]){
//                max = array[i];
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args){
//        int[] array = {1,3,5,7,4,5,9,4,3,5};
//        int output = findMax(array);
//        System.out.println(output);
//    }
    //求数组中元素的平均值
//    public static double average(int[] array){
//        double sum = 0;
//        double len = array.length;
//        for (int i = 0; i < len; i++) {
//            sum = sum + array[i];
//        }
//        return sum/len;
//    }
//    public static void main(String[] args){
//        int[] array = {1,3,5,7,4,5,9,4,3,5};
//        double output = average(array);
//        System.out.println(output);
//    }
    //查找数组中指定元素（顺序查找）
//    public static int findIndex(int[] array, int target){
//        for (int i = 0; i < array.length; i++) {
//            if (target == array[i]){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        int[] array = {1,2,3,4,5,6,7,8,9};
//        int target = 11;
//        System.out.println(findIndex(array, target));
//    }
    //查找数组中指定元素（二分查找）
//    public static int binarySearch(int[] array, int target){
//        int left = 0;
//        int right = array.length - 1;
//        while(left < right){
//            int mid = (left + right) / 2;
//            if(array[mid] == target){
//                return mid;
//            }
//            else if(array[mid] > target){
//                right = mid - 1;
//            }
//            else{
//                left = mid -1;
//            }
//        }
//        return -1;
//    }
//        public static void main(String[] args){
//        int[] array = {1,2,3,4,5,6,7,8,9};
//        int target = 7;
//        System.out.println(binarySearch(array, target));
//    }
    //检擦数组有序性
    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] array1 = {1,3,5,6,8,10,12};
        int[] array2 = {1,4,6,2,7,6,2,3,9};
        System.out.println(isSorted(array1));
        System.out.println(isSorted(array2));
    }




}
