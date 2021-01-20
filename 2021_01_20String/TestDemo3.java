import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 泛型：
 * 详细讲解
 * User: GaoBo
 * Date: 2021-01-20
 * Time: 11:45
 */
class MyArrayList {
    public int[] elem;
    public int usedSize;


}
public class TestDemo3 {
    public static void main(String[] args) {
        //Map<K,V>
        Map<String,String> map = new HashMap<>();
        map.put("玄奘","唐僧");
        map.put("及时雨","宋江");
        map.put("国民女神","高圆圆");
        map.put("及时雨","宋江2");
        //存放的顺序  不一定就是打印的顺序 因为在往map当中存储元素的时候。不是按照顺序方
        //他有一定的方式去存放，这个方式就是使用哈希函数进行映射
        System.out.println(map);


        String ret = map.get("玄奘");
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("fsaf");
        collection.add("abcdef");
        System.out.println(collection);
        collection.clear();
        System.out.println("==========");
        System.out.println(collection);
    }
}
