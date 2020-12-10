import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2020-12-09
 * Time: 16:46
 */
public class TestDemo {
    public static int[] twoSum(int[] nums, int target) {
        if(nums == null) {
            return null;
        }
        int[] ret = new int[2];
        for(int i = 0;i < nums.length;i++) {
            for(int j = i+1;j< nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                    //return i,j;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[] array2 = null;
        int[] ret = twoSum(array,3);
        System.out.println(Arrays.toString(ret));
        twoSum(new int[]{1,2,3,4,5},3);
        int len = new int[]{1,2,3,4,5}.length;
        int len2 = new int[]{1,2,3,4,5}.length+2;
        System.out.println(len);
        int a = 10;
    }



    /**
     * 将原来的数字  扩大了 2倍
     * @param array2
     * @return
     */
    public static int[] func1(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array2[i] * 2;
        }
        return array2;
    }

    public static int[] func(int[] array2) {
        int[] ret = new int[array2.length];
        for (int i = 0; i < array2.length; i++) {
            ret[i] = array2[i] * 2;
        }
        return ret;
    }

    public static void main8(String[] args) {
        int[] array = {1,2,3};
        int[] ret = func(array);
        System.out.println(Arrays.toString(ret));
        System.out.println(Arrays.toString(array));
    }

    public static void main7(String[] args) {
        int[] array = {1,2,3};
        System.out.println(array);
        float[] floats = {1.2f,3.3f};
        System.out.println(floats);
       /* int[] array2 = new int[]{1,2,3};
        //这句话代表什么？   引用指向了引用
        array = array2;*/
    }

    public static void main6(String[] args) {
        int[] array = {1,2,3};
        //array = {1,4,5,6,7,8,9};
        array = new int[]{1,2,3};
    }

    public static void swap(int[] array2) {
        int tmp = array2[0];
        array2[0] = array2[1];
        array2[1] = tmp;
    }
    public static void main5(String[] args) {
        int[] array = {10,30};
        System.out.println(array[0] +" " + array[1]);
        swap(array);
        System.out.println(array[0] +" " + array[1]);
    }

    /**
     * 使用数组的时候 经常会遇到的问题
     * @param args
     */
    public static void main4(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        System.out.println(array1[4]);
        //array2 这个引用  不指向任何对象
        int[] array2 = null;
        System.out.println(array2[0]);
    }

    public static void main3(String[] args) {
        int[] array1 = {1,2,3,4,5,6};

        //1.for    length:数组的属性
        for (int i = 0; i < array1.length;i++) {
            System.out.print(array1[i] +" ");
        }
        System.out.println();
        //2.for each
        for(int x : array1) {
            System.out.print(x +" ");
        }
        System.out.println();
        //3、使用操作数组的工具类
        //将数组 以字符串的形式 进行输出
        /*String ret = Arrays.toString(array1);
        System.out.println(ret);*/
        System.out.println(Arrays.toString(array1));
    }
    /*int a = 10;//实例成员变量   堆上的
    static int b = 20;//静态成员变量  方法区
    int[] array4 = {1,2,3,4,56};*/

    public static void main2(String[] args) {
        //1.定义且初始化一个数组(静态初始化)
        int[] array1 = {1,2,3,4,5,6};
        //2.定义了一个数组 但是没有初始化 new关键字
        int[] array2 = new int[10];
        //3.动态初始化数组
        int[] array3 = new int[]{1,2,3,4,5,6,7};
    }

    static boolean out(char c) {
        System.out.println(c);
        return true;
    }

    public static void main1(String[] argv) {
        int i = 0;
        for (out('A'); out('B') && (i < 2); out('C')) {
            i++;
            out('D');
        }
    }
}
