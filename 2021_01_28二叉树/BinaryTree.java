import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-26
 * Time: 9:43
 */
class BTNode {
    public char val;
    public BTNode left;//左子树的引用
    public BTNode right;//右子树的引用

    public BTNode(char val) {
        this.val = val;
    }
}
public class BinaryTree {

    /**
     * 我们要首先创建二叉树，但是为了好理解，我们先以穷举的方式
     * 创建二叉树
     * 后期我们会以遍历的方式 创建二叉树
     * 当前只是权宜之计
     * @return
     */
    public BTNode createTree() {
        BTNode A = new BTNode('A');
        BTNode B = new BTNode('B');
        BTNode C = new BTNode('C');
        BTNode D = new BTNode('D');
        BTNode E = new BTNode('E');
        BTNode F = new BTNode('F');
        BTNode G = new BTNode('G');
        BTNode H = new BTNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }

    public  int i = 0;
    public  BTNode createTree2(String str) {
        if(str == null || str.length()  <= 0) return null;
        BTNode root =  null;
        if(str.charAt(i) != '#') {
            root = new BTNode(str.charAt(i));
            i++;
            root.left = createTree2(str);
            root.right = createTree2(str);
        }else {
            i++;
        }
        return root;
    }
    // 前序遍历
    void preOrderTraversal(BTNode root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // 中序遍历
    void inOrderTraversal(BTNode root) {
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    // 后序遍历
    void postOrderTraversal(BTNode root) {
        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    // 遍历思路-求结点个数
    static int size = 0;
    void getSize1(BTNode root) {
        if(root == null) return;
        size++;
        getSize1(root.right);
        getSize1(root.left);
    }
    // 子问题思路-求结点个数
    int getSize2(BTNode root){
        if(root == null) return 0;
        return getSize2(root.left) + getSize2(root.right) + 1;
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(BTNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    // 子问题思路-求叶子结点个数
    int getLeafSize2(BTNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }
    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(BTNode root,int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1)+
                getKLevelSize(root.right,k-1);
    }
    // 获取二叉树的高度
    int getHeight(BTNode root) {
        if(root == null) return 0;

        return getHeight(root.left) > getHeight(root.right) ?
                getHeight(root.left)+1 : getHeight(root.right)+1;
    }

    //
    BTNode find(BTNode root, char val) {
        if(root == null) return null;
        if(root.val == val) {
            return root;
        }
        BTNode ret = find(root.left,val);
        if(ret != null) {
            return ret;
        }
        ret = find(root.right,val);
        if(ret != null) {
            return ret;
        }
        return null;
    }
    // 层序遍历
    void levelOrderTraversal(BTNode root) {
        if(root == null) return;
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BTNode cur = queue.poll();
            System.out.print(cur.val +" ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null){
                queue.offer(cur.right);
            }
        }
    }

    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(BTNode root) {
        if(root == null) return true;
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BTNode cur = queue.poll();
            if(cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else {
                break;
            }
        }
        while (!queue.isEmpty()) {
            //依次弹出队列元素
            BTNode cur = queue.peek();
            if(cur != null) {
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }
    // 前序遍历
    void preOrderTraversalNor(BTNode root) {
        if(root == null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.val + " ");
                cur = cur.left;
            }
            BTNode top = stack.pop();
            cur = top.right;
        }
        System.out.println();
    }
    // 中序遍历
    void inOrderTraversalNor(BTNode root) {
        if(root == null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            BTNode top = stack.pop();
            System.out.print(top.val + " ");
            cur = top.right;
        }
        System.out.println();
    }


    // 后序遍历
    void postOrderTraversalNor(BTNode root) {
        if(root == null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur = root;
        BTNode prev = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            BTNode top = stack.peek();
            if(top.right == null || top.right == prev) {
                stack.pop();
                System.out.print(top.val+" ");
                prev = top;
            }else {
                cur = top.right;
            }
        }
        System.out.println();
    }



}
