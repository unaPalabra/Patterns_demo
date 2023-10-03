package BehavioralPatterns.TemplateMethode;

//Абстрактный  класс, который описывает шаблонный метод и атомарные операции, из которых он состоит
abstract class DocWork {
    // шаблонный метод состоит из последовательно исполняемых атомарных методов
    public void handleDoc() {
        loadDoc();
        rework();
        exit();
    }

    //Общий для всех классов метод реализуем сразу
    void loadDoc() {
        System.out.println("Document Loading");
    }

    //Изменяемые методы будем описывать в их классах
    abstract void rework();

    abstract void exit();
}
