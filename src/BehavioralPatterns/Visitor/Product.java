package BehavioralPatterns.Visitor;

// Интерфейс Product описывает метод getCost() для всех товаров. Соответствует Element на диаграмме классов.
interface Product {
    // добавляем новое поведение поведение всем товарам
    // соответствует методу accept() на диаграмме, принимает интерфейс посетителя в качестве аргумента
    double getCost(Visitor visitor);
}
