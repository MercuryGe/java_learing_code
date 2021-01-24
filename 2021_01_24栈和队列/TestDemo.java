import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-24
 * Time: 8:29
 */
public class TestDemo {


    public static void main(String[] args) {

    }


    public static void main1(String[] args) {
        //普通的队列
        Queue<Integer> queue = new LinkedList<>();
        //此时调用add方法  默认是从尾巴入队
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue.peek());
        System.out.println(queue);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("hello");
    }
}
