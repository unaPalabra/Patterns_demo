package BehavioralPatterns.Strategy;

//Класс контекста, работает со стратегиями через общий интерфейс
class Context {
    private Strategy strategy; // ссылка на общий интерфейс

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;// сеттер стратегии
    }

    void executeStrategy(String string) {
        strategy.run(string);// вызываем стратегию
    }
}
