package BehavioralPatterns.Interpreter;

// Создаем нетерминальный класс, описывающий синтаксическое правило сложения чисел
class AdditionExpression implements Expression {
    private Expression leftOperand;// число слева от знака "+" в строке
    private Expression rightOperand;// число справа от знака "+" в строке

    public AdditionExpression(Expression leftOperand, Expression rightOperand) {// конструктор
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret() {// возвращает сумму двух чисел по бокам от знака "+" в строке
        return leftOperand.interpret() + rightOperand.interpret();
    }
}
