package BehavioralPatterns.Visitor;

// наши велосипеды, имеют одно поле - цена в долларах (конкретный элемент на схеме)
class Bike implements Product {
    private double usdPrice;// цена в долларах

    public Bike(double usdPrice) {
        this.usdPrice = usdPrice;
    }// конструктор, принимает цену

    public double getUsdPrice() {
        return usdPrice;
    }// геттер для цены

    @Override //переопределяем метод getCost() интерфейса для вызова конкретного посетителя
    public double getCost(Visitor visitor) {
        return visitor.bikePriceVisitor(this);// вызывает посещение конкретного посетителя, добавляет новое поведение
    }

}
