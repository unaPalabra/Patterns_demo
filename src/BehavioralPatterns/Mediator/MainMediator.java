package BehavioralPatterns.Mediator;

// клиентская часть
public class MainMediator {
    public static void main(String[] args) {
        Admin admin = new Admin();// создаем конкретного коллегу admin
        Editor editor = new Editor();// создаем конкретного коллегу editor
        // создаем конкретного посредника и передаем в конструктор конкретных коллег
        ConcreteMediator mediator = new ConcreteMediator(admin, editor);

        System.out.println("\nAdmin send message: Hello");
        admin.send("Hello I'm admin");// admin отправляет сообщение посреднику
        System.out.println("\nEditor send message: Hello");
        editor.send("Hello I'm editor"); // editor отправляет сообщение посреднику
    }
}

