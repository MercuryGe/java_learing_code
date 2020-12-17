/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2020-12-13
 * Time: 17:25
 */
class Person {
    /**
     * name->age->a    叫做字段/属性/成员变量
     *
     * name->age：实例成员变量
     * public static int a = 10; 静态成员变量   方法区
     *
     * 访问修饰限定符：权限
     * public private protected 默认访问权限
     *
     * 成员变量：
     *   定义再类内部  方法的外部的
     *   如果没有初始化，那么他的值  就是一个默认值(默认的零值)
     *   如果是引用类型 那么值就是null
     *   如果是简单类型  那么值就是其这种类型所对应的默认值
     *   byte 0  short 0 int 0 long 0L
     *   float 0.0f;   double 0.0
     *   char '\u0000' 十六进制
     *   boolean  false
     */
    public String name;
    public int age;
    public char ch;
    public boolean flg;
    public static int a;

    /**
     * 行为-》方法
     * eat()-》sleep() 实例成员方法
     * 静态成员方法func()
     */
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
    public static void func() {
        System.out.println("静态成员方法func()");
    }
}


public class TestDemo2 {

    public static void main(String[] args) {
       /* TestDemo2 testDemo2 = new TestDemo2();
        String[] strings = {};
        testDemo2.main(strings);*/
    }


    public static void main3(String[] args) {
        //Person person = new Person();
        //System.out.println(person.a);
        //对于静态的成员变量和静态的成员方法 访问方式应该是这样的
        //总结：对于静态的属性或者方法 是不依赖于对象的
        System.out.println(Person.a);
        Person.func();
    }


    public static void main2(String[] args) {
        Person person = new Person();
        person.name = "bit";
        person.age = 10;
        System.out.println(person.name);
        System.out.println(person.age);

        person.eat();
        person.sleep();

    }
    public static void main1(String[] args) {
        //实例化对象  真正意义上有了一个实体
        //person是一个引用
        Person person = new Person();
        System.out.println(person.ch);
        System.out.println(person.flg);
    }
}
