package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

//Класс конкретного издателя. Реализует интерфейс Observable, хранит список всех подписчиков.
class NewsSite implements Observable {
    private List<Observer> listeners = new ArrayList<>();// Список всех подписчиков.
    private List<String> news = new ArrayList<>();// Список новостей, об изменении которого будут оповещаться подписчики.

    // Переопределяем методы подписки, отписки и извещения подписчиков.
    @Override
    public void addObserver(Observer observer) {
        listeners.add(observer);
    }// добавляет конкретного подписчика в список

    @Override
    public void removeObserver(Observer observer) {
        listeners.remove(observer);
    }// удаляет конкретного подписчика из списка

    @Override
    public void notifyObserver() {
        // оповещает каждого конкретного подписчика из списка о событии, используя цикл forEach
        for (Observer observer : listeners) {
            observer.handleEvent(news);
        }
    }

    // добавляем новость в список news
    public void addNews(String news) {
        this.news.add(news);// добавляем непосредственно новость
        this.notifyObserver();// извещаем всех подписчиков конкретного издателя
    }

    // удаляем новость из списка
    public void removeNews(String news) {
        this.news.remove(news);// удаляем новость
        this.notifyObserver();// извещаем подписчиков
    }
}
