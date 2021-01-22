import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-22
 * Time: 8:27
 */
class Card {
    public String suit;
    public int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        /*return "Card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                '}';*/
        return  "["+suit+","+rank+"]";
    }
}

class DeckCard {
    public static final String[] suits = {"♥","♠","♦","♣"};

    public List<Card> buyCard() {
        List<Card> cardList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13 ; j++) {
                String suit = suits[i];
                int rank = j;
                Card card = new Card(suit,rank);
                cardList.add(card);
            }
        }
        return cardList;
    }

    public void swap(List<Card> cardList,int i,int j) {
        Card tmp = cardList.get(i);
        cardList.set(i,cardList.get(j));
        cardList.set(j,tmp);
    }
    public void washCard(List<Card> cardList) {
        for (int i = cardList.size()-1; i > 0 ; i--) {
            Random random = new Random();
            int rand = random.nextInt(i);
            swap(cardList,i,rand);
        }
    }

    public void game() {

    }
}


public class TestDemo {


    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //stack.peek() 拿到栈顶元素，但是不是删除
        System.out.println(stack.peek());//3
        //弹出栈顶元素 3
        System.out.println(stack.pop());//3
        System.out.println(stack.peek());//2
        System.out.println(stack.pop());//2
        System.out.println(stack.pop());//1
        System.out.println(stack.empty());
        System.out.println(stack.pop());//3
    }

    public static void main3(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //stack.peek() 拿到栈顶元素，但是不是删除
        System.out.println(stack.peek());//3
        //弹出栈顶元素 3
        System.out.println(stack.pop());//3
        System.out.println(stack.peek());//2
        System.out.println(stack.pop());//2
        System.out.println(stack.pop());//1
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
    }


    public static void main2(String[] args) {
        DeckCard deckCard = new DeckCard();
        List<Card> cardList = deckCard.buyCard();
        System.out.println("============买牌=========");
        System.out.println(cardList);
        deckCard.washCard(cardList);
        System.out.println("============洗牌=========");
        System.out.println(cardList);
        System.out.println("=============发牌=========");

        //3个人   每个人5张牌
        List<Card> hands1 = new ArrayList<>();
        List<Card> hands2 = new ArrayList<>();
        List<Card> hands3 = new ArrayList<>();

        List<List<Card>> hands = new ArrayList<>();
        hands.add(hands1);
        hands.add(hands2);
        hands.add(hands3);

        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                //揭牌
                Card card = cardList.remove(0);
                hands.get(i).add(card);
            }
        }*/
        //轮流揭牌
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                //揭牌
                Card card = cardList.remove(0);
                hands.get(j).add(card);
            }
        }
        System.out.println("第一个人：");
        System.out.println(hands1);
        System.out.println("第二个人：");
        System.out.println(hands2);
        System.out.println("第三个人：");
        System.out.println(hands3);
        System.out.println("剩余的牌：");
        System.out.println(cardList);
    }

    public static List<Character> func1(String str1,String str2) {
        List<Character> ret = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);//w
            if(!str2.contains(ch+"")) {
                ret.add(ch);
            }
        }
        return ret;
    }

    public static String func(String str1,String str2) {
        //List<Character> ret = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);//w
            if(!str2.contains(ch+"")) {
                //ret.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main1(String[] args) {
        String ret = func("welcome to bit","come");
        System.out.println(ret);
        List<Character> ret1 = new ArrayList<>();
        ArrayList<Character> ret2 = new ArrayList<>();
        /*List<Character> list = func("welcome to bit","come");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }*/
        //System.out.println(list);
    }
}
