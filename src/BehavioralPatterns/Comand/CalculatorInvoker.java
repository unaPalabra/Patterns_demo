package BehavioralPatterns.Comand;

// Создаем приемник команд
class CalculatorInvoker {
    private CalculatorCommand addition; // Ссылка на интерфейс CalculatorCommand
    private CalculatorCommand substraction; // Ссылка на интерфейс CalculatorCommand

    // конструктор с параметрами
    public CalculatorInvoker(CalculatorCommand addition, CalculatorCommand substraction) {
        this.addition = addition;
        this.substraction = substraction;
    }

    // считаем сумму
    public void getSum(int a, int b) {
        addition.execute(a, b);// Вызываем execute(a, b) у реализации интерфейса CalculatorCommand
    }

    ;

    // считаем разность
    public void getDifference(int a, int b) {
        substraction.execute(a, b);// Вызываем execute(a, b) у реализации интерфейса CalculatorCommand
    }
}
