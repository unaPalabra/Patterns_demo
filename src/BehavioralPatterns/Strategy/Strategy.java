package BehavioralPatterns.Strategy;

//Абстрактная стратегия
interface Strategy {
    void run(String string);// определяем метод, который будет вызывать конкретный алгоритм (стратегию)
}
