package BehavioralPatterns.Observer;

// Интерфейс издателя
interface Observable {
    void addObserver(Observer observer);// Метод подписки на событие, в качестве аргумента принимает конкретного подписчика (слушателя) события.

    void removeObserver(Observer observer);// Метод отписки от события, в качестве аргумента принимает конкретного подписчика (слушателя) события.

    void notifyObserver();// метод оповещения всех подписчиков
}
