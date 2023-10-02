package BehavioralPatterns.Comand;

// ������� �������� ������
class CalculatorInvoker {
    private CalculatorCommand addition; // ������ �� ��������� CalculatorCommand
    private CalculatorCommand substraction; // ������ �� ��������� CalculatorCommand

    // ����������� � �����������
    public CalculatorInvoker(CalculatorCommand addition, CalculatorCommand substraction) {
        this.addition = addition;
        this.substraction = substraction;
    }

    // ������� �����
    public void getSum(int a, int b) {
        addition.execute(a, b);// �������� execute(a, b) � ���������� ���������� CalculatorCommand
    }

    ;

    // ������� ��������
    public void getDifference(int a, int b) {
        substraction.execute(a, b);// �������� execute(a, b) � ���������� ���������� CalculatorCommand
    }
}
