package BehavioralPatterns.Comand;

// ������, ������� ����� �������� � ������������� ����� ������� ������
class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();// ������� �����������
        // ������� �������� ������
        //� �������� ���������� �������� ����� �������-�������
        CalculatorInvoker calculatorInvoker = new CalculatorInvoker(
                new AdditionCommand(calculator),// � �������� ��������� �������� ������ ������������
                new SubstractionCommand(calculator)// � �������� ��������� �������� ������ ������������
        );

        calculatorInvoker.getSum(20, 30);// ������� ����� �����
        calculatorInvoker.getDifference(10, 20);// ������� �������� �����
    }
}
