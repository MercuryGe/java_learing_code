import javax.swing.plaf.synth.SynthEditorPaneUI;

public class class_one_practice {

    public static void main1(String[] args) {
        System.out.println("Hello,Java");
    }

    public static void main2(String[] args) {
        int num = 10; //定义一个整型变量
        int a = Integer.MAX_VALUE+1;
        System.out.println(a);
        System.out.println(num);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }

    public static void main3(String[] args) {
        long num = 10L;
        System.out.println(num);
    }

    public static void main4(String[] args) {
        double num = 1.0;
        System.out.println(num);
        double num2 = 1.1;
        System.out.println(num2 * num2);
    }

    public static void main5(String[] args) {
        float num = 1.0f; //也可以写作1.0F
        System.out.println(num);
    }

    public static void main6(String[] args) {
        char ch = '周';
        System.out.println(ch);
        char ch1 = 6666;
        System.out.println(ch1);

    }

    public static void main7(String[] args) {
        byte value = 0;
        System.out.println(value);
    }

    public static void main8(String[] args) {
        short value = 0;
        System.out.println(value);
    }

    public static void main9(String[] args) {
        boolean value = true;
        System.out.println(value);
    }

    public static void main10(String[] args) {
        String name = "zhoucheng";
        System.out.println(name);
    }

    public static void main11(String[] args) {
        String a = "Hello";
        String b = "World";
        String c = a + b;
        System.out.println(c);
        int q = 10;
        int w = 20;
        System.out.println("a = " + q + ",b =" + w);

    }

    public static void main12(String[] args) {
        int a = 10;
        long b = 20;
        //int c = a + b;  //这样会编译出错，这里将long转换成int会丢失精度
        long d = a + b; //这样则编译通过
    }

    public static void main13(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = (a + b);       //编译不通过
        byte d = (byte)(a + b); //编译通过
        System.out.println(d);
    }

    public static void main14(String[] args) {
        int num = 10;
        String str1 = num + ""; //方法1
        String str2 = String.valueOf(num); //方法2
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main(String[] args) {
        String str = "100";
        int num = Integer.parseInt(str);
        System.out.println(str);
    }

//    public static void main(String[] args) {
//        //byte a1 =130;
//        //float b1 = 3.5;
//        int  a = 3;
//        //byte b = a;
//    }
}
