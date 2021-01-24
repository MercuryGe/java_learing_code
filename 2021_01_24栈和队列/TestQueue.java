package queuedemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-24
 * Time: 9:58
 */
public class TestQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        System.out.println(myQueue.poll());
        System.out.println("fasfdsafsa");
    }
}
