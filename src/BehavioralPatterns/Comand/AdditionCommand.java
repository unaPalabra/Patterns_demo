package BehavioralPatterns.Comand;

// AdditionCommand � SubstractionCommand ���������� ���������� ���������� CalculatorCommand.
class AdditionCommand implements CalculatorCommand {
    private Calculator calculator;// ������ �� ����� ������������

    // ����������� � ���������� Calculator
    public AdditionCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override //�������������� execute()
    public void execute(int a, int b) {
        calculator.addition(a, b);// �������� addition() � ������������
    }
}
