package BehavioralPatterns.Comand;

// клиент, который будет работать с калькулятором через объекты команд
class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();// создаем калькулятор
        // создаем приемник команд
        //в качестве параметров передаем новые объекты-команды
        CalculatorInvoker calculatorInvoker = new CalculatorInvoker(
                new AdditionCommand(calculator),// в качестве параметра передаем объект калькулятора
                new SubstractionCommand(calculator)// в качестве параметра передаем объект калькулятора
        );

        calculatorInvoker.getSum(20, 30);// выводим сумму чисел
        calculatorInvoker.getDifference(10, 20);// выводим разность чисел
    }
}
