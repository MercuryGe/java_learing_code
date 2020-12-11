import java.util.ArrayList;

public class String_array {

    //转圈打印矩阵
    public static ArrayList<Integer> rotationMatrix(int[][] matrix){
        //第一步：new一个新的数组对象
        ArrayList<Integer> rec = new ArrayList<Integer>();
        //第二步：判空
        if(matrix.length == 0){
            return rec;
        }
        if(matrix[0].length == 0){
            return rec;
        }
        //第三步：定义边界
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        //第四步：循环赋值
        while(true){
            //进行边界判别,//从左到右
            if(left > right){
                return rec;
            }
            for (int i = left; i <= right; i++) {
                rec.add(matrix[top][i]);
            }
            top++;
            //判断边界,//从上到下
            if(top > bottom){
                return rec;
            }
            for(int i = top; i <= bottom; i++){
                rec.add(matrix[i][right]);
            }
            right--;
            //判断边界，//从右到左
            if(right < left){
                return rec;
            }
            for (int i = right; i >= left ; i--) { //从右往左
                rec.add(matrix[bottom][i]);
            }
            bottom--;
            //判断边界，//从下到上
            if(bottom < top){
                return rec;
            }
            for (int i = bottom; i >= top; i--) { //从下往上   都要用 --
                rec.add(matrix[i][left]);
            }
            left++;
        }

    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}};
        System.out.println(rotationMatrix(matrix));
    }





//    //寻找峰值
//    public static int solve (int[] a) {
//        // write code here
//        int index=0;
//        for(int i=1;i<a.length;i++){
//            if(a[i-1]<a[i]){
//                index=i;
//            }
//
//        }
//        return index;
//
//    }
//
//    public static void main(String[] args) {
//        int[] b = {1,2,4,5,3,7,9,11,2,33,43,9};
//        int m = solve(b);
//        System.out.println(m);
//    }



    //螺旋矩阵
//    public static ArrayList<Integer> spiralOrders1(int[][] matrix) {
//        ArrayList<Integer> res = new ArrayList<Integer>();
//        if(matrix.length==0)
//            return res;
//        if(matrix[0].length==0)
//            return res;
//        int up = 0;
//        int down = matrix.length-1;
//        int left = 0;
//        int right = matrix[0].length-1;
//        int i=0;
//        while(true){
//            if(left>right){
//                return res;
//            }
//            //向右
//            for(int k=left;k<=right;k++)
//                res.add(matrix[up][k]);
//            up++;
//            if(up>down){
//                return res;
//            }
//            //向下
//            for(int k=up;k<=down;k++)
//                res.add(matrix[k][right]);
//            right--;
//            if(left>right){
//                return res;
//            }
//            //向左
//            for(int k=right;k>=left;k--)
//                res.add(matrix[down][k]);
//            down--;
//            if(up>down) {
//                return res;
//            }
//            //向上
//            for(int k=down;k>=up;k--)
//                res.add(matrix[k][left]);
//            left++;
//        }
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> n = new ArrayList<Integer>();
//        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        System.out.println(spiralOrders1(matrix));
//    }









    //输出斐波那契数列的第n项
//    public static int fibD(int n){
//        if(n == 1 || n == 2){
//            return 1;
//        }
//        else{
//            return fibD(n-1) + fibD(n - 2);
//        }
//    }
//    public static int fibX(int n){
//        if(n < 0){
//            return -1;
//        }
//        int f1 = 1;
//        int f2 = 1;
//        int f3 = 1;
//        for (int i = 2; i < n; i++) {
//            f3 = f1 + f2;
//            f1 = f2;
//            f2 = f3;
//        }
//        return f3;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fibD(10));
//        System.out.println(fibX(10));
//    }
}
