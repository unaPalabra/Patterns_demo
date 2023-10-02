package BehavioralPatterns.Iterator;

// Создаем "коллекцию", которую нужно обойти итератором
// Коллекцию создадим в виде массива
// должна имплементировать интерфейс Aggregate
class ConcreteAggregate implements Aggregate {
    private String[] patterns = {"Singleton", "Factory", "Interpreter", "Decorator", "Facade", "Prototype"};

    @Override
    public Iterator getIterator() {// переопределяем метод getIterator() интерфейса Aggregate
        return new PatternsIterator(patterns);// вызываем конструктор итератора и передаем ссылку на массив
    }
}
