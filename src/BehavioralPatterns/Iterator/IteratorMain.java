package BehavioralPatterns.Iterator;

// клиент дл€ проверки кода
public class IteratorMain {
    public static void main(String[] args) {
        ConcreteAggregate ca = new ConcreteAggregate();// —оздаем коллекцию
        // создаем итератор, вызвав метод getIterator() у нашей коллекции
        Iterator iterator = ca.getIterator();
        // теперь через цикл while "заставим" наш итератор работать
        while (iterator.hasNext()){// пока в коллекции есть следующие элементы...
            System.out.println(iterator.next());//выводим их на экран, использу€ метод next() итератора
        }
    }
}

