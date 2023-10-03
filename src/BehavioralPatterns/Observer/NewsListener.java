package BehavioralPatterns.Observer;

import java.util.List;

// Конкретный класс подписчика. Реализует интерфейс Observer.
class NewsListener implements Observer {
    private String name;// имя подписчика для наглядности

    public NewsListener(String name) {
        this.name = name;
    }// конструктор подписчика

    // переопределяем метод обработки подписчиком события
    @Override
    public void handleEvent(List<String> news) {
        System.out.println("I'm " + name + " I get news");
        System.out.println(news);// выводим новости
    }
}
