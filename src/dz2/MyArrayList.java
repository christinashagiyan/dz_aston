package dz2;

import java.util.Collection;

public class MyArrayList<E> extends MyList<E>{

    private E[] array ; // здесь хранятся элементы

    private int size; // размер

    private static final int DEFAULT_CAPACITY = 10; // вместимость по умолчанию

    private static final double LOAD_FACTOR = 1.5; // во сколько раз увеличивается массив при недостатке места

    public MyArrayList() {
        this.array = (E[])new Object[DEFAULT_CAPACITY];
    }

    public  MyArrayList(Collection<? extends E> c){
        this();
        addAll(c);
    }

    // метод увеличения списка
    private void enlarge(int add_capacity){
        E[] temp_array = (E[])new Object[(int) (array.length*LOAD_FACTOR +add_capacity)];
        System.arraycopy(array, 0, temp_array, 0 , size);
        array = temp_array;
    }

    public void add(E element){
        if(size == array.length)
            enlarge(1);
        array[size] = element;
        size++;
    }

    public void add(int index , E element){
        if(index > size || index<0) throw new IndexOutOfBoundsException();
        if(index == size)
            add(element);
        else{
            if(size == array.length)
                enlarge(1);
            System.arraycopy(array, index, array, index+1, size-index);
            array[index] = element;
            size++;
        }
    }

    public void addAll(Collection<? extends E> c){
        int c_size = c.size();
        E[] c_array = (E[]) c.toArray();
        if(array.length - size < c_size)
            enlarge(c_size);
        System.arraycopy(c_array, 0 , array, size, c_size);
        size+=c_size;
    }

    public void addAll(int index, Collection<? extends E> c){
        if(index > size || index<0) throw new IndexOutOfBoundsException();
        if(index == size)
            addAll(c);
        else {
            int c_size = c.size();
            E[] c_array = (E[]) c.toArray();
            if (array.length - size < c_size)
                enlarge(c_size);
            System.arraycopy(array, index, array, index + c_size, size - index);
            System.arraycopy(c_array, 0, array, index, c_size);
            size += c_size;
        }
    }

    public E get(int index){
        if(index >= size || index<0) throw new IndexOutOfBoundsException();
        return array[index];
    }

    public void set (int index, E value){
        if(index >= size || index<0) throw new IndexOutOfBoundsException();
        array[index] = value;
    }

    public void remove(int index){
        if(index >= size || index<0) throw new IndexOutOfBoundsException();
        array[index] = null;
        size--;
        System.arraycopy(array, index+1, array, index, size-index);
    }

    public void remove(E value){
        for (int i = 0; i < this.size(); i++) {
            if(value.equals(array[i])){
                this.remove(i);
                return;
            }
        }
    }

    public int size() {
        return size;
    }
}
