package BehavioralPatterns.Interpreter;

// ������� �������������� �����, ����������� �������������� ������� �������� �����
class AdditionExpression implements Expression {
    private Expression leftOperand;// ����� ����� �� ����� "+" � ������
    private Expression rightOperand;// ����� ������ �� ����� "+" � ������

    public AdditionExpression(Expression leftOperand, Expression rightOperand) {// �����������
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret() {// ���������� ����� ���� ����� �� ����� �� ����� "+" � ������
        return leftOperand.interpret() + rightOperand.interpret();
    }
}
