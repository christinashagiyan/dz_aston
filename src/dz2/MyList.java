package dz2;

import java.util.Collection;
import java.util.Comparator;

public abstract class MyList<E> {

    abstract void add(E element);

    abstract void add(int index , E element);

    abstract void addAll(Collection<? extends E> c);

    abstract void addAll(int index, Collection<? extends E> c);

    abstract E get(int index);

    abstract void set (int index, E value);

    abstract void remove(int index);

    abstract void remove(E value);

    // Сортировка пузырьком
    static <E> void sort(MyList<E> myList, Comparator<? super E> comparator) {
        int count ; // счетчик перестановок в каждой итерации
        for (int i = 0; i < myList.size(); i++) {
            count = 0;
            for (int j = 0; j < myList.size()-1-i; j++) {
                if(comparator.compare(myList.get(j),myList.get(j+1)) >0){
                    E tmp = myList.get(j);
                    myList.set(j,myList.get(j+1));
                    myList.set(j+1,tmp);
                    count++;
                }
            }
            if(count==0)break; // останавливаемся, если в итерации не было перестановок
        }
    }

     void sort(Comparator<? super E> comparator) {
        sort(this, comparator);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            sb.append(this.get(i)).append(" ");
        }
        return sb.toString();
    }

   abstract int size();
}