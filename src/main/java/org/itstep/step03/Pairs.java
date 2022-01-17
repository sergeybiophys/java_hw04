package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

///**
// * Итерируемая коллекция объектов Pair.
// *
// * @author Michael S. Kirkpatrick and Nathan Sprague
// * @version V1, 8/2017
// */
public class Pairs<K, V> implements Iterable<Pair<K, V>> {
//
//    /* TODO: Объявить массив фиксированного размера (максимум 10 элементов) объектов Pair */

     ArrayList<Pair> pairs = new ArrayList<>(Arrays.asList(new Pair[10]));
     private int capacity = 0;
//    /**
//     * Создайте коллекцию, в которой будут храниться элементы, добавленные парами.
//     */
    public Pairs() {

    }
//
//    /**
//     * TODO: Создайте новую пару и добавьте ее в коллекцию, если есть место.
//     *
//     * @param first  Первый объект
//     * @param second Второй объект
//     * @return true - если пара была добавлена, false - в противном случае
//     */
    public boolean addPair(K first, V second) {
        boolean key = false;

        if(capacity<pairs.size())
        {
            pairs.set(capacity, new Pair(first,second));
            capacity++;
            key = true;
        }
        return key;
    }


//
    @Override
    public Iterator<Pair<K, V>> iterator() {
        return new PairIterator();
    }
//
//    /*
//     * TODO: Реализуйте итератор здесь на основе документации API по адресу
//     * https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html Throw the exceptions as
//     * specified
//     */
    private class PairIterator implements Iterator<Pair<K, V>> {
//
//        /**
//         * TODO: Проверить наличие следующего элемента в итераторе
//         */
        private int position = 0;

        @Override
        public boolean hasNext() {
            if(position<pairs.size())
                return true;
            else
                return false;
        }

//
//        /**
//         * TODO: Вернуть следующую пару в итератор.
//         * @throws NoSuchElementException - если больше нет элементов для итерации
//         */
        @Override
        public Pair<K, V> next() throws NoSuchElementException {


            if(position<pairs.size())
                return pairs.get(position++);
            else
               throw new NoSuchElementException("throws NoSuchElementException");
        }
//
//        /**
//         * TODO: Удалите предыдущую пару, возвращенную функцией next()
//         */
       @Override
        public void remove() throws IndexOutOfBoundsException {
            if(position < pairs.size())
                pairs.remove(--position);
            else
               throw new IndexOutOfBoundsException();
       }
   }
}
