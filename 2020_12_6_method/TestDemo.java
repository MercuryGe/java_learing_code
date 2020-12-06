import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2020-12-06
 * Time: 14:30
 */

/**
 * 易语言：
 * 中文编程
 */

public class TestDemo {

    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"->"+pos2);
    }

    public static void hanota(int n,char pos1,
                              char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
            return;
        }
        hanota(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanota(n-1,pos2,pos1,pos3);
    }

    public static void main(String[] args) {
        hanota(64,'A','B','C');//2^64 -1
        /*hanota(1,'A','B','C');
        //A ->C  1     2^1  -1
        System.out.println();
        hanota(2,'A','B','C');
        //A->b A->C  b->c    3  2^2 -1
        System.out.println();
        hanota(3,'A','B','C');
        //A->C  A->B C-> B A->C B-> A B->C A->C     7  2^3 - 1*/
    }

    //123
    public static void printf(int n) {
        if(n > 9) {
            printf(n/10);
        }
        System.out.println(n%10);
    }
    //1+...10
    public static int sumAdd(int num) {
        if(num == 1) {
            return 1;
        }
        return num + sumAdd(num-1);
    }
    //123
    public static int sumOR(int num) {
        if(num > 9) {
            return sumOR(num/10) + num % 10;
        }
        return num;
    }

    //循环  迭代
    public static int fib(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <= n ; i++) {
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main18(String[] args) {
        System.out.println(fib(40));
    }

    public static int fac2(int n) {
        if(n == 1) {
            return 1;
        }
        int tmp = n * fac2(n-1);
        return tmp;
    }

    public static void main17(String[] args) {
        System.out.println(fac2(5));
    }

    public static int sub(int a,int b) {
        return a-b;
    }
    public static int sub(int a,int b,int c) {
        return a-b-c;
    }
    public static float sub(float a,float b) {
        return a-b;
    }

    /**
     * 可变参数编程
     *          int... 变量
     * @param array
     * @return
     */
    public static int sub(int... array) {
        int sub = 0;
       /* for ( int x : array) {
            sub = sub-x;
        }*/
        for (int i = 0; i < array.length; i++) {
            sub = sub-array[i];
        }
        return sub;
    }

    public static void main16(String[] args) {
        System.out.println(sub(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(sub(1, 2, 3, 4, 5, 6));
        System.out.println(sub(1, 2));

        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(sub(array));
        //匿名数组
        System.out.println(sub(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));

        /*int a = 10;
        int b = 20;
        System.out.println(sub(b, a));

        float f = 19.5f;
        float f2 = 29.0f;
        System.out.println(sub(f2, f));*/
    }


    public static void swap(int[] array2) {
        int tmp = array2[0];
        array2[0] = array2[1];
        array2[1] = tmp;
    }

    public static void main14(String[] args) {
        //数组  是对象
        int[] array = {10,20};
        System.out.println(array[0] +" " + array[1]);
        swap(array);
        System.out.println(array[0] +" " + array[1]);
    }

    public static void swap1(int a,int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
    //栈上的内存  是不能拿到的
    public static void main13(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+" "+b);
        swap1(a,b);
        System.out.println(a+" "+b);
    }

    //n!
    public static int fac(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
    public static int facSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum += fac(i);
        }
        return sum;
    }

    public static void func2() {
        int a = 10;
        if(a == 10) {
            return;
        }
        System.out.println("fadsafsa");
    }

    public static void main12(String[] args) {
        int a = 2;
        int ret = facMul(a);
        System.out.println(ret);
    }

    public static int facMul(int num) {
        int sum = 1;
        for (int i = 1; i <= num ; i++) {
            sum *= fac(i);
        }
        return sum;
    }

    public static int add (int a,int b) {
        return a+b;
    }

    public static void main11(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(add(a, b));
    }

    /*int b = 10;//实例成员变量
    static int c = 90;//静态成员变量
*/
    public static void main10(String[] args) {
        int a = 10;//局部变量  栈
    }

    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            String str = scanner.nextLine();
            if(str.equals("123456")) {
                System.out.println("密码相同");
                break;
            }else {
                count--;
            }
        }
    }

    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++) {
            //123
            int count = 0;
            int tmp = i;
            while (tmp != 0) {
                count++;
                tmp /= 10;
            }
            //tmp == 0
            tmp = i;
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp%10,count);
                tmp = tmp / 10;//1/10
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }

    public static void main7(String[] args) {
        int count = 0;
        //9 19%10=9     90 91/10=9    99
        for (int i = 1; i <= 100; i++) {
            if(i / 10 == 9) {
                count++;
            }else if(i % 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static double func1(int i,int j) {
       return  1.0/i - 1.0/j;
    }

    public static void main6(String[] args) {
        double sum = 0;
        for (int i = 1; i < 100 ; i+=2) {
            sum = sum +  func1(i,i+1);
        }
        System.out.println(sum);
    }


    public static void main5(String[] args) {
        double sum = 0;
        int flg = 1;
        for (int i = 1; i <= 100 ; i++) {
            sum = sum + 1.0/i * flg;
            flg = -flg;
        }
        System.out.println(sum);
    }
    /**
     * 最小公倍数   最大公约数
     * @param args
     */
    public static void main4(String[] args) {
        int a = 18;
        int b = 12;
        int c = 0;
        while (a % b != 0) {
            c = a%b;//6
            a = b;//a = 12
            b = c;//c= 6
        }
        System.out.println(c);
    }
    public static void main3(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+"*"+j + "=" + i*j+" ");
            }
            System.out.println();
        }
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int j = 1;j <= n;j++){
            int i = 2;
            for (; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    System.out.println("不是素数");
                    break;
                }
            }
            if(i > Math.sqrt(n)) {
                System.out.println("是素数");
            }
        }
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int i = 2;
            for (; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    System.out.println("不是素数");
                    break;
                }
            }
            if(i > Math.sqrt(n)) {
                System.out.println("是素数");
            }
        }
    }
}


