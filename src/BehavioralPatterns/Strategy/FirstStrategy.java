package BehavioralPatterns.Strategy;

//Первая стратегия
class FirstStrategy implements Strategy {
    @Override
    public void run(String string) {
        // переопределяем метод run()
        System.out.println("Первый вариант решения " + string);
        // здесь ещё код с алгоритмом...
    }
}
