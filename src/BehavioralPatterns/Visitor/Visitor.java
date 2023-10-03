package BehavioralPatterns.Visitor;

//интерфейс посетителя, добавляет новое поведение
interface Visitor {
    double bikePriceVisitor(Bike bike);// посетитель класса велосипедов, пересчитывает цену (обеспечивает новое поведение), метод visit на схеме

    double tvPriceVisitor(TV tv);// посетитель класса телевизоров, пересчитывает цену (обеспечивает новое поведение), метод visit на схеме
}
