import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class class_two_practice {


    //循环求N的阶乘
    public static int FAC(int n){
        int fac = 1;
        for (int i = 1; i <= n ; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) {
        System.out.println(FAC(5));
    }



    //递归求N的阶乘
//    public static int Fac(int n){
//        if(n == 1){
//            return 1;
//        }
//        else{
//            return n * Fac(n - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Fac(5));
//    }




    //递归求和
//    public static int dAdd(int num){
//        if(num == 1){
//            return 1;
//        }
//        else {
//            return num + dAdd(num - 1);
//        }
//    }
//    public static void main(String[] args){
//        System.out.println(dAdd(10));
//    }
//




    //递归的方法打印数字的每一位
//    public static void dPrint(int n){
//        if(n < 10){
//            System.out.println(n % 10);
//        }
//        else{
//            dPrint(n / 10);
//            System.out.println(n % 10);
//        }
//
//    }
//    public static void main(String[] args){
//        dPrint(1234);
//    }





    //返回的数字之和
    //写一个递归方法，输入一个非负整数，返回组成他的数字之和
//    public static int cAdd(int n){
//        if (n > 9){
//            return n % 10 + cAdd(n / 10);
//        }
//        else{
//            return n;
//        }
//    }
//
//    public static void main(String[] args){
//        System.out.println(cAdd(123456789));
//    }




    //求解斐波那契数列第N项
//    public static int fib(int n){
//        if(n == 1 || n == 2){
//            return 1;
//        }
//        return fib(n-1) + fib(n-2);
//    }
//    public static void main(String[] args){
//        System.out.println(fib(7));
//    }





    //递归求解汉诺塔
//    public static void move (char pos1, char pos2){
//        System.out.println(pos1 + "->" + pos2);
//    }
//    public static void hanota(int n, char pos1, char pos2, char pos3){
//        if(n == 1){
//            move(pos1, pos3);
//            return;
//        }
//        hanota(n - 1, pos1, pos3, pos2);
//        move(pos1, pos3);
//        hanota(n -1, pos2, pos1, pos3);
//    }
//    public static void main(String[] args){
//        hanota(10, 'A','B','C');
//    }









//    //青蛙跳台阶问题
//    public static int numWays(int n){
//        if(n == 0 || n == 1){
//            return 1;
//        }
//        return numWays(n - 1) + numWays(n - 2);
//
//    }
//    public static void main (String[] args){
//        System.out.println(numWays(10));
//    }






    //求和的重载
//    public static int ADD(int a, int b){
//        return a + b;
//    }
//    public static double ADD(double a, double b, double c){
//        return a + b + c;
//    }
//    public static void main(String[] arg){
//        System.out.println(ADD(1,2,3));
//    }






//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入一个数字：");
//        int n = sc.nextInt();
//        if(n<1){
//            System.out.println("请重新输入");
//        }
//        else{
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if(i == j){
//                        System.out.print("*");
//                    }
//                    else if (j == n-i-1){
//                        System.out.print("*");
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }







    //求最大值方法的重载
//    public static int Max(int a, int b){
//        int max;
//        if(a > b){
//            max = a;
//        }
//        else{
//            max = b;
//        }
//        return max;
//    }
//    public static double Max(double a, double b){
//        double max;
//        if(a > b){
//            max = a;
//        }
//        else{
//            max = b;
//        }
//        return max;
//    }
//    public static double Max(double a, double b, double c){
//        double max;
//        if(a > b){
//            max = a;
//        }
//        else{
//            max = b;
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Max(2.0,3.5,4.0));
//    }







    //求最大值
    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3
    //要求：在max3这个函数中，调用max2函数
//    public static int max2(int a, int b){
//        int max;
//        if(a > b){
//            max = a;
//        }
//        else{
//            max = b;
//        }
//        return max;
//    }
//    public static int max3(int a, int b, int c){
//        int max;
//        if(max2(a , b) > c){
//            max = max2(a,b);
//        }
//        else{
//            max = c;
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//         int c = max3(2,8, 5);
//        System.out.println(c);
//    }





    //奇数位于偶数之前
    //调整数组顺序，是的奇数位于都偶数之前
//    public static void swap(int[] arr){
//        int left = 0;
//        int right = arr.length - 1;
//        int tmp = 0;
//        while (left < right){
//            //从前往后找，找到一个偶数，找到后停止
//            while((left < right) && (arr[left] % 2 == 0)){
//                left++;
//            }
//            //从后往前找，找到一个奇数，找到后停止
//            while ((left < right) && (arr[right] % 2 == 1)){
//                right--;
//            }
//            //找到之后交换两个数据位置
//            if(left < right){
//                tmp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = tmp;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        swap(arr);
//    }



//    //求N的阶乘
//    public static int fac(int n){
//        if(n == 1){
//            return 1;
//        }
//        return n * fac(n-1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fac(5));
//    }






//    //阶乘求和
//    //先求阶乘
//    public static int Fac(int n){
//        if (n == 1){
//            return 1;
//        }
//        int tmp = n * Fac(n - 1);
//        return tmp;
//    }
//    public static int sum(int num){
//        if (num == 1){
//            return 1;
//        }
//        return Fac(num) + Fac(num - 1);
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum(5));
//    }




//    //斐波那契数列
//    public static int fib(int n){
//        int f1 = 1;
//        int f2 = 1;
//        int f3 = 1;
//        for(int i = 3; i <= n; i++){
//            f3 = f1 + f2;
//            f1 = f2;
//            f2 = f3;
//        }
//        return f3;
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fib(10));
//    }






//    //找出出现一次的数字
//    //有一组数据，只有一个数字是出现一次，其他是出现两次，请找出这个数字
//    public static int singleNumber(int[] nums){
//        int result = 0;
//        for (int i = 0; i < nums.length; i++){
//            result = result ^ nums[i];
//        }
//        System.out.println(result);
//        return result;
//
//    }
//
//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 2, 1};
//        singleNumber(a);
//    }




}
