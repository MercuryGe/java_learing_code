/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-19
 * Time: 8:32
 */
class Person implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
//运行时期异常
class MyException extends RuntimeException{

    public MyException(String message) {
        super(message);
    }

}
//编译时期异常
class MyException2 extends Exception{

    public MyException2(String message) {
        super(message);
    }
}

class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class TestDemo {
    private static String userName = "admin";
    private static String password = "admin";

    public static void login1(String userName, String password) {
        if (!TestDemo.userName.equals(userName)) {
            try {
                throw new UserException("用户名错误");
            } catch (UserException e) {
                e.printStackTrace();
            }
        }
        if (!TestDemo.password.equals(password)) {
            try {
                throw new PasswordException("密码错误");
            } catch (PasswordException e) {
                e.printStackTrace();
            }
        }
        System.out.println("登陆成功");
    }

    public static void login(String userName, String password) throws
            PasswordException, UserException {
        if (!TestDemo.userName.equals(userName)) {
            throw new UserException("用户名错误");
        }
        if (!TestDemo.password.equals(password)) {
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功");
    }

    public static void main(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserException userError) {
            userError.printStackTrace();
        } catch (PasswordException passwordError) {
            passwordError.printStackTrace();
        }
    }

    public static void main4(String[] args) {
        int a = 10;
        try {
            if(a == 10) {
                throw new MyException2("bit");
            }else {

            }
        }catch (MyException2 e) {
            e.printStackTrace();
        }
    }

    public static void main3(String[] args) {
        try {
            throw new MyException("bit");
        }catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void main2(String[] args) {
        try {
            //System.out.println(10/0);
            throw new ArithmeticException("bite");
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void main1(String[] args)throws CloneNotSupportedException {
        Person person = new Person();
        Person p1 = (Person) person.clone();
    }
}
