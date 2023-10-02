package BehavioralPatterns.Interpreter;

// ��������� ����� ��� ������ ������������ ������ ����������� �������
// ���������� ���������� ������� �� ��������� � ������� ������
class Parser {
    Expression evaluate(String str) {
        int position = str.length() - 1;// ���������� ������� ���������� ������� � ������
        while (position > 0) {// ������ ��������� � ������ ������
            if (Character.isDigit(str.charAt(position))) {// ���� ������ �������� ������ - ��������� �����
                position--;// ������� ������� ��������� �� 1
            } else {// ����� ������� �� ������ "+" ��� "-", ������� ����� � ������ ��������
                // � ������ "5+36-32" ������ ������� "32", � ����� - "5+36"
                // ��� ��������� ������ �������� ���������� �������� ����� evaluate()
                Expression leftOperand = evaluate(str.substring(0, position));
                // ������ ������� ������� ����� ����� ������������ NumberExpression
                Expression rightOperand = new NumberExpression(Integer.parseInt(str.substring(position + 1)));

                // �� ������ "+" ��� "-" ���������� ����� �������������� ������� �������
                char operator = str.charAt(position);
                switch (operator) {
                    case '+':
                        return new AdditionExpression(leftOperand, rightOperand);
                    case '-':
                        return new SubstractionExpression(leftOperand, rightOperand);
                }
            }
        }
        int result = Integer.parseInt(str);
        return new NumberExpression(result);
    }
}
