package BehavioralPatterns.Comand;

class SubstractionCommand implements CalculatorCommand {
    private Calculator calculator;

    // конструктор с параметром Calculator
    public SubstractionCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override //Переопределяем execute()
    public void execute(int a, int b) {
        calculator.substraction(a, b);// вызываем substraction() у калькулятора
    }
}
