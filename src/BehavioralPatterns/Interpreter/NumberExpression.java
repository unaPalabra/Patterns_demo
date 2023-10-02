package BehavioralPatterns.Interpreter;

//Создаем терминальное выражение для чисел
class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {// конструктор
        this.number = number;
    }

    @Override
    public int interpret() {// возвращает число
        return number;
    }
}
