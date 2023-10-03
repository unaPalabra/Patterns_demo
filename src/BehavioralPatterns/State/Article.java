package BehavioralPatterns.State;

// Класс статьи. Является контекстом состояния. Содержит ссылку на объект состояния.
class Article {
    private State state;// Ссылка на объект конкретного состояния

    // Сеттер состояния
    public void setState(State state) {
        this.state = state;
    }

    // конструктор статьи
    public Article() {
        this.state = new Draft();// При создании статьи устанавливает состояние в Черновик.
        System.out.println("Create Article...");// Сообщение о создании статьи для наглядности.
    }

    // Метод "опубликовать" в зависимости от текущего состояния статьи будет выполнять разный функционал.
    public void publish() {
        state.changeState(this);// В качестве аргумента принимает объект статьи.
    }
}
