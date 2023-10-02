package BehavioralPatterns.Interpreter;

//���������� ����� �������� ������� ����������� ������
public class Interpreter {
    public static void main(String[] args) {
        Parser parser = new Parser();

        Expression expression = parser.evaluate("-25+43-34");
        System.out.println(expression.interpret());
    }
}

