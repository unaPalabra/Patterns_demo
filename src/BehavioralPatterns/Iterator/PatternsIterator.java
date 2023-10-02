package BehavioralPatterns.Iterator;

// Описываем класс конкретного итератора
class PatternsIterator implements Iterator {// переопределяем методы интерфейса
    private final String[] patterns;// Ссылка на массив паттернов
    int index = 0;// Переменная index соответствует индексу элемента в массиве.

    PatternsIterator(String[] patterns) {
        this.patterns = patterns;
    }

    @Override
    public boolean hasNext() {
        if (index < patterns.length) {
            return true;// если index меньше длины массива - возвращает true
        } else {
            return false;// иначе возвращает false, т.е. коллекция закончилась
        }
    }

    @Override
    public Object next() {
        return patterns[index++];// возвращаем следующий элемент коллекции, после чего инкрементируем index
    }
}
