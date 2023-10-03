package BehavioralPatterns.State;

// Клиентский класс
public class StateRunner {
    public static void main(String[] args) {
        Article article = new Article();// Создаем новую статью.
        article.publish(); //вызываем метод опубликовать
        article.publish(); //вызываем метод опубликовать
        article.publish(); //вызываем метод опубликовать
    }
}

