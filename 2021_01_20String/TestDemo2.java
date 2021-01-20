/**
 * Created with IntelliJ IDEA.
 * Description:
 * String 和 StringBuilder StringBuffer 区别：
 * 1、后两者包含了一些String没有的方法 比如reverse方法
 * 2、后两者是可变的，String是不可变的。String的每次拼接，都会产生新的对象
 *    后两者每次的拼接都返回的是this
 * 3、StringBuilder 之间 StringBuffer 区别：
 *     StringBuilder和String 出现在单线程情况下
 *     StringBuffer因为有synchronized关键字 所以一般出现多线程情况下。
 *
 * 4、 StringBuilder和 String之间有啥区别！！！
 *    1、String的拼接 +   会被优化  优化为StringBuilder . append了 ！！！
 *    2、在循环当中 不可以使用String直接进行拼接  这样会产生大量的临时对象
 *       包括优化之后StringBuilder对象。
 *
 *
 * User: GaoBo
 * Date: 2021-01-20
 * Time: 10:39
 */
public class TestDemo2 {

    public static void main5(String[] args) {
        String str = "abc";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for(int i = 0;i < 10;i++) {
            str = sb.append(i).toString();
        }
        System.out.println(str);
    }

    public static void main4(String[] args) {
        String str = "abc";
        for(int i = 0;i < 10;i++) {
            StringBuilder sb = new StringBuilder();
            str = sb.append(str).append(i).toString();
            //str += i;
        }
        System.out.println(str);
    }

    public static void main3(String[] args) {
        String str = "abc";
        for(int i = 0;i < 10;i++) {
            str += i;
        }
        System.out.println(str);
    }

    public static void main2(String[] args) {
        String str = "abcdef";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("hello");
        str = sb.toString();
        System.out.println(str);
    }
    public static void main1(String[] args) {
        String str = "abcdef";
        str = str+"hello";
        System.out.println(str);
    }
}
