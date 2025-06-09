package s10_DSA.MyArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    // Số lượng phần tử có trong MyArrayList
    public int size = 0;

    // Suc chua cua MyArrayList
    public static final int DEFAULT_CAPACITY = 10;

    //Mang chua cac phan tu
    Object elements[];

    // Suc chua mac dinh khi khoi tao bang constructor khong tham so
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    //Phuong thuc constructor voi suc chua duoc truyen vao param capacity
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity:" + capacity);
        }
    }

    // Phuong thuc tra ve so luong phan tu
    public int size(){
        return size;
    }

    //Phuong thuc clear arraylist
    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
    // Phuong thuc add 1 phan tu vao arraylist
    public boolean add(E element){
        if(elements.length == size()){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index){
        if(index >= elements.length){
            throw new IllegalArgumentException("index:" + index);
        }else if (elements.length == size){
            this.ensureCapacity(5);
        }

        if(elements[index] == null){
            elements[index] = element;
            size++;
        }else{
            for(int i = size + 1; i >= index; i--){
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public void ensureCapacity(int minCapacity){
        if (minCapacity >= 0) {
            int newsize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newsize);
        }else{
            throw new IllegalArgumentException("minCapacity:" + minCapacity);
        }
    }
}
