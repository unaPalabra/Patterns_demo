package BehavioralPatterns.Mediator;

// конкретный класс-коллега, наследует метод отправки сообщений от абстрактного класса
class Editor extends Collegue {
    @Override
        // переопределяем метод получения сообщения для наглядности работы
    void getMessage(String message) {
        System.out.println("Editor get message: " + message);
    }
}
