package BehavioralPatterns.Mediator;

// абстрактный класс дл€ всех коллег, содержит ссылку на посредника
abstract class Collegue {
    private Mediator mediator;// ссылка на посредника

    public void setMediator(Mediator mediator) {//устанавливаем посредника коллеге
        this.mediator = mediator;
    }

    //ћетод отправки сообщени€. —ообщение отправл€етс€ посреднику, а он определ€ет дальнейшего получател€.
    // ќтправитель не имеет представлени€ кто получит сообщение.
    void send(String message) {
        mediator.sendMessage(message, this);
    }

    abstract void getMessage(String message);// метод получени€ сообщени€ дл€ нагл€дности работы примера
}
