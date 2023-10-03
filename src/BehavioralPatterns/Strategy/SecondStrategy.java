package BehavioralPatterns.Strategy;

//Вторая стратегия
class SecondStrategy implements Strategy {
    @Override
    public void run(String string) {
        // переопределяем метод run()
        System.out.println("Второй вариант решения " + string);
        // здесь ещё код с алгоритмом...
    }
}
