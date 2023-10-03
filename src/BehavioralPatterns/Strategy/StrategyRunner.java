package BehavioralPatterns.Strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        // создаем контекст
        Context context = new Context();

        context.setStrategy(new FirstStrategy());//назначаем контексту конкретную стратегию
        context.executeStrategy("Запускаем стратегию");// запускам стратегию

        context.setStrategy(new SecondStrategy());//назначаем контексту другую конкретную стратегию
        context.executeStrategy("Запускаем стратегию");// запускам стратегию
    }
}

