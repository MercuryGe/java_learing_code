import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2020-12-13
 * Time: 12:23
 */
public class TestDemo {

    public static void main(String[] args) {
        int[][] array3 = new int[2][];
        array3[0] = new int[2];
        array3[1] = new int[4];
    }

    public static void main10(String[] args) {
        int[][] array1 = {{1,2,3},{4,5,6}};
        for(int i = 0;i < array1.length;i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("====================");
        for (int[] arr : array1) {
            for (int x : arr) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println("=====================");
        String ret = Arrays.deepToString(array1);
        System.out.println(ret);
    }

    public static void main9(String[] args) {

        int[][] array1 = {{1,2,3},{4,5,6}};
        //默认值是0
        int[][] array2 = new int[2][3];
        //可以不给列 但是行必须要   不规则的二维数组
        int[][] array3 = new int[2][];

        int[][] array4 = new int[][]{{1,2,3},{4,5,6}};

    }

    public static void func1(int[] array) {
        int i = 0;
        int j = array.length-1;

        while (i < j) {
            while (i < j && array[i] % 2 == 0) {
                i++;//找奇数
            }
            if(i >= j) {
                return;
            }else {
                while (i < j && array[j] % 2 != 0) {
                    j--;
                }
                if(i >= j) {
                    return;
                }else {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }

        }
    }
    public static void func(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            while (i < j && array[i] % 2 == 0) {
                i++;//找奇数
            }
            //i == j
            while (i < j && array[j] % 2 != 0) {
                j--;
            }
            int tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
    }
    public static void main8(String[] args) {
        int[] array = {1,2,3,4,5,6};
        func(array);
        System.out.println(Arrays.toString(array));

    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length ; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double findAvg(int[] array) {
        double avg = 0.0;
        double sum = 0.0;
        for (int i = 1; i < array.length ; i++) {
                sum  += array[i];
        }
        avg = sum/array.length;
        return avg;
    }

    public static int findNum(int[] array,int num) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 就地逆置
     * @param array
     */
    public static void reverse(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
    }

    /**
     * 数组必须是有序的
     *     递增
     * @param array
     * @param key
     * @return
     */
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if(array[mid] == key) {
                return mid;
            }else if(array[mid] > key) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;//没找到
    }

    public static boolean isUp(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(int[] array) {
        boolean flg = false;
        //i趟数
        for(int i = 0;i < array.length-1;i++) {
            flg = false;
            //每一趟j 都是从0下标开始比较
            for(int j = 0;j < array.length-1-i;j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                return;
            }
        }
    }
    //sort底层不是冒泡排序 底层是多个排序联合完成的
    public static void main7(String[] args) {
        int[] array = {1,12,3,14,5,16};
        //System.out.println(isUp(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.binarySearch(array, 12));
    }

    public static void main6(String[] args) {
        int[] array1 = new int[10];
        Arrays.fill(array1,3,6,88);
        System.out.println(Arrays.toString(array1));
        /*int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,2,3,4,5,6,7};
        System.out.println(Arrays.equals(array1, array2));*/
        /*int[] ret = Arrays.copyOfRange(array1,2,1);
        System.out.println(Arrays.toString(ret));*/
    }

    /**
     * 引用.clone()  :
     *    克隆这个引用 所指向的那个对象。
     *    这个引用  所指向的对象   就会生成一个副本
     * @param args
     */
    public static void main5(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        //array2指向了 刚刚生成的那个副本
        System.out.println(Arrays.toString(array1));//1
        int[] array2 = array1.clone();
        System.out.println("==================");
        array2[0] = 99;
        System.out.println(Arrays.toString(array1));//1
        System.out.println(Arrays.toString(array2));//99
    }

    /**
     * System.arraycopy()
     * 深拷贝
     * 面试问题：
     * 这几个拷贝方式中  谁的速度最快
     * @param args
     */
    public static void main4(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = new int[array1.length];
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.arraycopy(array1,0,array2,
                0,array1.length);

        System.out.println("==================");
        array2[0] = 99;
        System.out.println(Arrays.toString(array1));//1
        System.out.println(Arrays.toString(array2));//99
    }

    /**
     * 深拷贝:Arrays.copyOf(original, newLength);
     * @param args
     */
    public static void main3(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array1));
        //System.out.println(Arrays.toString(array2));
        int[] array2 = Arrays.copyOf(array1,array1.length);
        System.out.println("==================");
        array2[0] = 99;
        System.out.println(Arrays.toString(array1));//1
        System.out.println(Arrays.toString(array2));//99
    }

    /**
     * for
     * @param args
     */
    public static void main2(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = new int[array1.length];
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println("==================");
        array2[0] = 99;
        System.out.println(Arrays.toString(array1));//1
        System.out.println(Arrays.toString(array2));//99
    }




    public static String myToString(int[] array) {
        if(array == null) {
            return null;
        }
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret = ret + array[i];
            if(i != array.length-1) {
                //ret = ret + array[i] + ", ";
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main1(String[] args) {
        //int[] array = {1,2,3,4,5};
        int[] array = null;
        System.out.println(Arrays.toString(array));
        System.out.println(myToString(null));
    }
}
