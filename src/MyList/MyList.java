package MyList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
    public boolean add(int index,E element){
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements,newSize);
        elements[elements.length-1] = element;
        return true;
    }
    public E remove(int index){
        if (index < elements.length){
            int index1 = 0;
            Object[] newElement = new Object[elements.length-1];
            for (int i = 0; i < newElement.length; i++) {
                if (i == index){
                    continue;
                }
                newElement[index1] = elements[i];
                index1++;
            }
            setElements(newElement);
            return (E) elements;
        }
        return (E) elements;
    }
    public int size(){
        return size;
    }
    public E clone(){
        Object[] newElement= new Object[elements.length];
        for (int i = 0; i < elements.length; i++) {
            newElement[i] = elements[i];
        }
        return (E) newElement;
    }
//    public boolean contains(E o){};
//    public int indexOf(E o){};
    public void clear(){
         elements =  new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
