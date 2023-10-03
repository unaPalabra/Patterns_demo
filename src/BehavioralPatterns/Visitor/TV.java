package BehavioralPatterns.Visitor;

// телевизоры с ценой в долларах (конкретный элемент на схеме)
class TV implements Product {
    private double usdPrice;// цена

    public TV(double usdPrice) {
        this.usdPrice = usdPrice;
    }// конструктор

    public double getUsdPrice() {
        return usdPrice;
    }// геттер для цены

    @Override //переопределяем метод getCost() интерфейса для вызова конкретного посетителя
    public double getCost(Visitor visitor) {
        return visitor.tvPriceVisitor(this);// вызывает посещение конкретного посетителя, добавляет новое поведение
    }
}
