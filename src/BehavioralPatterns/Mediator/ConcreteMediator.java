package BehavioralPatterns.Mediator;

// Создаем конкретного посредника, который содержит ссылки на конкретные объекты классов-коллег
class ConcreteMediator implements Mediator {
    private Admin admin;// ссылка на объект класса Admin
    private Editor editor;// Ссылка на объект класса Editor

    // Конструктор конкретного медиатора принимает конкретные объекты-коллеги
    // в ходе создания конкретного посредника объектам-коллегам устанавливаем посредника
    public ConcreteMediator(Admin admin, Editor editor) {
        this.admin = admin;
        this.editor = editor;
        editor.setMediator(this);
        admin.setMediator(this);
    }

    // Переопределяем метод отправки сообщения
    @Override
    public void sendMessage(String message, Collegue collegue) {
        if (collegue.equals(admin)) {// если сообщение отправляет admin, оно отправляется объекту editor
            editor.getMessage(message);
        } else if (collegue.equals(editor)) {// если сообщение отправляет editor, оно отправляется объекту admin
            admin.getMessage(message);
        }
    }
}
