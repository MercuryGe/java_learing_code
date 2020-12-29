package introduction;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class MyArrayList {
    private int[] elem;
    private int usedSize;

    public MyArrayList(){
        this.elem = new int[10];
    }
    public MyArrayList(int capacity){
        this.elem = new int[capacity];
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(this.elem[i] + " ");
        }
    }

    public boolean isFull(){
        if(this.usedSize == this.elem.length){
            return true;
        }
        return false;

    }
    // 对数组进行扩容(2倍扩容)
    public void resize(){
        this.elem = Arrays.copyOf(this.elem, 2*this.elem.length);
    }

    // 在 pos 位置新增元素        //数据结构的逻辑十分严谨，不论是插数据还是删数据，都要对顺序表进行判断
    public void add(int pos, int data) {
        //顺序表是否满（满了可以使用resize()）
        if(isFull()){
            resize();
        }
        //pos是否合法
        if(pos < 0 || pos > this.usedSize){
            System.out.println("pos位置不合法！");
            return;
        }
        //移动元素
        for (int i = this.usedSize - 1; i >= pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;

    }
    // 默认插入到数组的最后
    public void add2(int data){
        //判断满
        if(isFull()){
            resize();
        }
        //末尾插入
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }


    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }
    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos < 0 || pos >= this.usedSize){
            return -1;
        }
        int ret = this.elem[pos];
        return ret;
    }
    // 给 pos 位置的元素修改为 value
    public void setPos(int pos, int value) {
        if(pos > 0 || pos < this.usedSize){
            this.elem[pos] = value;
        }
    }

    //删除第一次出现的关键字key
    public void remove(int key) {
        //1、查找是否有key      i
        //2、将后一位赋给前一位 [i] = [i+1]
        //3、i与useSize的关系  i < useSize - 1
        int index = search(key);
        if(index == -1){
            System.out.println("没有");
            return;
        }
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
//        for (int j = 0; j < this.usedSize; j++) {
//            if(this.elem[j] == key){
//                for (int i = index; i < usedSize - 1; index++) {
//                    this.elem[i] = this.elem[i + 1];
//                }
//            }
//        }
//        this.useSize--;
    }

    // 清空顺序表
    public void clear() {
        this.usedSize = 0;  //就算原本有元素，但下次再放的时候直接将原本的覆盖了
    }
}


























