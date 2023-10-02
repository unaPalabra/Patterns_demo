package BehavioralPatterns.Comand;

// AdditionCommand и SubstractionCommand конкретные реализации интерфейса CalculatorCommand.
class AdditionCommand implements CalculatorCommand {
    private Calculator calculator;// Ссылка на класс калькулятора

    // конструктор с параметром Calculator
    public AdditionCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override //Переопределяем execute()
    public void execute(int a, int b) {
        calculator.addition(a, b);// вызываем addition() у калькулятора
    }
}
