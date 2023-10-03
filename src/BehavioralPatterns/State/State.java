package BehavioralPatterns.State;

// Общий интерфейс всех состояний статьи
interface State {
    //Метод, который будет изменять состояние статьи (контекста) в зависимости от текущего состояния. В качестве аргумента принимает объект класса Article.
    void changeState(Article article);
}
