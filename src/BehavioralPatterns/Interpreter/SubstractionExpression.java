package BehavioralPatterns.Interpreter;

class SubstractionExpression implements Expression {
    private Expression leftOperand;// ����� ����� �� ����� "-" � ������
    private Expression rightOperand;// ����� ������ �� ����� "-" � ������

    public SubstractionExpression(Expression leftOperand, Expression rightOperand) {// �����������
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret() {// ���������� ����� ���� ����� �� ����� �� ����� "-" � ������
        return leftOperand.interpret() - rightOperand.interpret();
    }
}
