package BehavioralPatterns.Comand;

// Создадим общий интерфейс для команд. Содержит единственный метод execute().
interface CalculatorCommand {
    void execute(int a, int b);
}
