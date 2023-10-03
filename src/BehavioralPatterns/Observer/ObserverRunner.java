package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverRunner {
    public static void main(String[] args) {
        NewsSite newsSite = new NewsSite();// создаем сайт новостей
        NewsListener listenerOne = new NewsListener("firstListener");//создаем подписчика
        NewsListener listenerTwo = new NewsListener("secondListener");//создаем подписчика
        newsSite.addObserver(listenerOne);//добавляем подписчика в список
        newsSite.addObserver(listenerTwo);//добавляем подписчика в список
        //добавляем две новости
        newsSite.addNews("First news");
        newsSite.addNews("Second news");
        //удаляем новость
        newsSite.removeNews("First news");
    }
}

