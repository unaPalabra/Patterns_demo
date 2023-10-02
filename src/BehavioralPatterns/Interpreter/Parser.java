package BehavioralPatterns.Interpreter;

// Служебный класс для обхода абстрактного дерева рекурсивным методом
// Конкретная реализация зависит от сложности и условия задачи
class Parser {
    Expression evaluate(String str) {
        int position = str.length() - 1;// определяем позицию последнего символа в строке
        while (position > 0) {// циклом двигаемся в начало строки
            if (Character.isDigit(str.charAt(position))) {// пока символ является числом - двигаемся влево
                position--;// счетчик позиции уменьшаем на 1
            } else {// когда доходим до знаков "+" или "-", создаем левый и правый операнды
                // в строке "5+36-32" правый операнд "32", а левый - "5+36"
                // для обработки левого операнда рекурсивно вызываем метод evaluate()
                Expression leftOperand = evaluate(str.substring(0, position));
                // правый операнд создаем через вызов конструктора NumberExpression
                Expression rightOperand = new NumberExpression(Integer.parseInt(str.substring(position + 1)));

                // по знакам "+" или "-" определяем какое нетерминальное правило выбрать
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
