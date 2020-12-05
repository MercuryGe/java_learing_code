import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 文档注释 一般用于 方法的注释和类的注释
 * User: GaoBo
 * Date: 2020-12-04
 * Time: 17:34
 */

public class TestDemo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(99999);
        //随机数是 伪随机数
        int randNum = random.nextInt(100)+1;//[1-101)
        while (true) {
            int inputNum = scanner.nextInt();
            if(inputNum < randNum  ) {
                System.out.println("小");
            }else if(inputNum > randNum) {
                System.out.println("大");
            }else {
                System.out.println("==");
                break;
            }
        }
    }

    public static void main11(String[] args) throws IOException {
        System.out.print("Enter a Char:");
        char i = (char) System.in.read();
        System.out.println("your char is :"+i);
    }

    public static void main10(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
            表达式2 没有写 默认为true
        }*/
       /* int i = 0;
        for (;  ;  i++) {
            System.out.println(i);
        }*/
        //增强for循环   foreach
        int[] array = {1,2,3,4,5,6,7};
        for (int x : array) {
            System.out.println(x);
        }

    }
    public static void main9(String[] args) {
        //break  : 结束所有循环  跳出循环
        //continue：结束本趟循环
        int i = 0;

        while (i <= 1000) {
            i++;
            if(i % 15 != 0) {
                break;
            }
            System.out.print(i +" ");
        }

    }

    public static void main8(String[] args) {
        int j = 1;
        int sum = 0;
        while (j <= 5) {
            int i = 1;
            int ret = 1;
            while (i <= j) {
                ret *= i;
                i++;
            }
            sum = sum+ret;
            j++;
        }
        System.out.println(sum);
    }

    public static void main7(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int sumEve = 0;
        i = 2;
        while (i <= 10) {
            sumEve += i;
            i+=2;
        }
        System.out.println(sumEve);


        /*while (true) {

        }*/

    }

    public static void main6(String[] args) {
        //面试问题：不能做switch参数的类型有哪些？
        //long   float   double   boolean
        //在JDK1.5的时候 引入了枚举这样的类型
        //枚举也是可以作为参数的
        //String a = "abcd";
        int a = 1;
       /* if(a >= 5 && a <= 10) {

        }*/
        //switch (a >= 5 && a <= 10) {
        switch (a) {
            default:
                System.out.println("输入有误");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }


    }

    //循环输入
    public static void main5(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println(a);
        }//ctr+d
        scanner.close();*/

     /*   int a = 10;
        System.out.println(a);//输出且换行
        System.out.print(a);//输出不换行
        System.out.printf("%d\n",a);//格式化输出
*/
       /* int x = 20;
        int y = 10;
        if (x == 10)
            if (y == 10)
                System.out.println("aaa");
            else
                System.out.println("bbb");*/

        int x = 10;
        int y = 10;
        if (x == 10){
            System.out.println("aaa");
        }
        System.out.println("bbb");
    }

    public static void main4(String[] args) {
        //System.in 键盘
        //System.out 屏幕
        //Scanner 工具
        Scanner scanner = new Scanner(System.in);
        //建议把nextLine 放到最前面
        String str = scanner.nextLine();
        int a = scanner.nextInt();
        double d = scanner.nextDouble();
        System.out.println(a);
        System.out.println(str);
        System.out.println(d);

    /*    int a = scanner.nextInt();
        System.out.println(a);
        double d = scanner.nextDouble();
        System.out.println(d);*/

        /*String str = scanner.nextLine();
        System.out.println(str);*/

        //遇到空格就结束了
        /*String str = scanner.next();
        System.out.println(str);*/

        /*if(a % 2 == 0) {
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }*/


    }

    public static void main3(String[] args) {
        int a = 10;
        if(a >= 5) {
            System.out.println("a >= 5");
        }else if(a < 3){
            System.out.println("a < e");
        }else {
            System.out.println("a > 3 && a < 5");
        }
    }
    /**
     * 这是一个主函数
     * @param args 命令行参数
     */
    public static void main2(String[] args)  {

        /*
        这是一个块注释，一般注释多行  注释+取消注释 ctr+shift+/
         */
        //这个是行注释  一般用于注释一行   注释+取消注释ctr+/
        boolean flg = true ? true==true ? true : true : false;
        System.out.println(flg);

      /*  try {
            System.out.println(10 < 20 && 10 / 0 == 0); // 打印 false
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("fafsdafafd");
*/


        //System.out.println(10 < 20 || 10 / 0 == 0);
        /**
         * int a = 1;
         * int c = 0;
         *
         * if(a++ && c++) {
         *      System.out.println("1");
         * }else {
         *      System.out.println("2");
         * }
         *
         */


        /*int a = 10;
        System.out.println(!!(a <= 5));*/
        // !true   !false
       /* int a = 1;
        int c = 0;
        if(a>=1 && c<=2) {
          System.out.println("1");
        }else {
         System.out.println("2");
        }*/



      /*  int a = 10;
        System.out.println( a <= 5);
        //Java 当中  所有的关系比较 其结果就是true 或者是
        //false
        */

       /* int a = 10;
        a = a++;
        System.out.println(a);//10
        */

        //javap -c

        /*System.out.println(1/10);

        System.out.println(11.5%2.0);

        byte b = 10;
        byte c = 20;
        //b = b+c;
        b += c;
        */
        /*System.out.print("Enter a Char:");
        char i = (char) System.in.read();
        System.out.println("your char is :"+i);*/
    }


    public static void main1(String[] args) {
        /*int a = 100;
        String ret = String.valueOf(a);
        System.out.println(ret);*/

        String str = "119";
        int a = Integer.valueOf(str);
        int b = a+1;
        System.out.println(b);

    }
}
