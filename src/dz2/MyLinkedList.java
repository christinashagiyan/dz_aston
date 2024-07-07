package dz2;

import java.util.Collection;

public class MyLinkedList<E> extends MyList<E>{

    private int size; // размер

    private Node<E> first; // узел, содержащий значение первого элемента

    private Node<E> last; // узел, содержащий значение последнего элемента

    MyLinkedList(){
    }

    MyLinkedList(Collection<? extends  E> c ){
        addAll(c);
    }

    // вложенный класс, представляющий узел
    private static class Node<E> {
        E value; // значение элемента
        Node<E> prev; // ссылка на предыдущий узел
        Node<E> next; // ссылка на следующий узел

        Node(E value, Node<E> prev, Node<E> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }


    // метод для поиска узла, соответствущего индексу
    private Node<E> find_node(int index){
        Node<E> result;
        if(index <= size/2){
            result = first;
            for (int i = 0; i < index; i++)
                result = result.next;
        }
        else{
            result = last;
            for (int i = size -1; i > index; i--)
                result = result.prev;
        }
        return result;
    }

    @Override
    public void add(E element) {
        addLast(element);
    }

    @Override
    public void add(int index, E element) {
        if(index > size || index<0) throw new IndexOutOfBoundsException();
        if(index == size)
            this.addLast(element);
        else if (index == 0)
            this.addFirst(element);
        else{
            Node<E> index_node = find_node(index);
            Node<E> new_index_node = new Node<>(element, index_node.prev, index_node);
            if(index_node.prev == null)
                first = new_index_node;
            else
                index_node.prev.next = new_index_node;
            index_node.prev = new_index_node;
            size++;
        }
    }

    @Override
    public void addAll(Collection<? extends E> c) {
        for(E e : c)
            add(e);
    }

    @Override
    public void addAll(int index, Collection<? extends E> c) {
        if(index > size || index<0) throw new IndexOutOfBoundsException();
        if(index == size)
            this.addAll(c);
        else
            for(E e : c)
                add(index++, e);
    }

    public void addFirst(E element){
        Node<E> first_node = first;
        Node<E> new_first_node = new Node<>(element, null, first_node);
        if(first_node == null)
            last = new_first_node;
        else
            first_node.prev = new_first_node;
        first = new_first_node;
        size++;
    }

    public void addLast(E element){
        Node<E> last_node = last;
        Node<E> new_last_node = new Node<>(element, last_node, null);
        if(last_node == null)
            first = new_last_node;
        else
            last_node.next = new_last_node;
        last = new_last_node;
        size++;
    }

    @Override
    public E get(int index) {
        if(index >= size || index<0) throw new IndexOutOfBoundsException();
        return find_node(index).value;
    }

    public E getFirst(){
        return first.value;
    }

    public E getLast(){
        return last.value;
    }

    @Override
    public void set(int index, E value) {
        if(index >= size || index<0) throw new IndexOutOfBoundsException();
        find_node(index).value = value;
    }

    @Override
    public void remove(int index) {
        if(index >= size || index<0) throw new IndexOutOfBoundsException();
        Node<E> index_node = find_node(index);
        if(index_node.prev == null && index_node.next == null){
            first.value = null; last.value = null;
        } else if (index_node.prev == null) {
            first = index_node.next;
        } else if (index_node.next == null) {
            last = index_node.prev;
        } else {
            index_node.prev.next = index_node.next;
            index_node.next.prev = index_node.prev;
        }
        size--;
    }

    @Override
    public void remove(E value) {
        Node<E> value_node = first;
        for (int i = 0; i < size(); i++) {
            if(value_node.value.equals(value)){
                remove(i); break;
            }
            value_node = value_node.next;
        }
    }

    @Override
    public int size() {
        return size;
    }
}
