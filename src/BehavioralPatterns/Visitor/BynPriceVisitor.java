package BehavioralPatterns.Visitor;

// Конкретные посетители обычно реализует одну операцию для всей иерархии элементов.Каждая новая операция это новый посетитель.
// Посетителя выгодно применять, когда новые элементы добавляются очень редко, а новые операции - часто.
// переводит цену в белорусские рубли
class BynPriceVisitor implements Visitor {
    // для велосипедов
    @Override
    public double bikePriceVisitor(Bike bike) {
        double price = bike.getUsdPrice() * 2.53;// переводим цену в белорусские рубли
        System.out.println("Bike costs: " + price + "BYN");//выводим цену на экран
        return price;// возвращаем новую цену
    }

    // для телевизоров
    @Override
    public double tvPriceVisitor(TV tv) {
        double price = tv.getUsdPrice() * 2.53;// переводим цену в белорусские рубли
        System.out.println("TV costs: " + price + "BYN");//выводим цену на экран
        return price;// возвращаем новую цену
    }
}
