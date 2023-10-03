package BehavioralPatterns.Visitor;

// переводит цену в российские рубли
class RubPriceVisitor implements Visitor {
    // для велосипедов
    @Override
    public double bikePriceVisitor(Bike bike) {
        double price = bike.getUsdPrice() * 72.17;// переводим цену в российские рубли
        System.out.println("Bike costs: " + price + "RUB");//выводим цену на экран
        return price;// возвращаем новую цену
    }

    // для телевизоров
    @Override
    public double tvPriceVisitor(TV tv) {
        double price = tv.getUsdPrice() * 72.17;// переводим цену в российские рубли
        System.out.println("TV costs: " + price + "RUB");//выводим цену на экран
        return price;// возвращаем новую цену
    }
}
