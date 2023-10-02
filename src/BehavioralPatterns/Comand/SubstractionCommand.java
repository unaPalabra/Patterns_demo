package BehavioralPatterns.Comand;

class SubstractionCommand implements CalculatorCommand {
    private Calculator calculator;

    // ����������� � ���������� Calculator
    public SubstractionCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override //�������������� execute()
    public void execute(int a, int b) {
        calculator.substraction(a, b);// �������� substraction() � ������������
    }
}
