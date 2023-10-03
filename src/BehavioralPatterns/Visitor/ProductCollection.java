package BehavioralPatterns.Visitor;

// корзина продуктов (коллекция на схеме)
class ProductCollection {
    Product[] products;// содержит массив конкретных продуктов

    // для упрощения примера наполним коллекцию товарами при создании
    public ProductCollection() {
        this.products = new Product[]{
                new Bike(128),
                new Bike(223),
                new TV(414),
                new TV(214),
                new TV(164),
                new Bike(1134)
        };
    }

    // переводим цену в российские или белорусские рубли и подсчитаем стоимость товаров в корзине
    public double getCost(Visitor visitor) {
        double price = 0;// стоимость товаров в пустой корзине
        for (Product product : products) {// перебираем все элементы корзины
            price += product.getCost(visitor); // переводим в российские или белорусские рубли и подсчитываем общую сумму товаров в корзине
        }
        return price;// возвращаем стоимость товаров в корзине в российских или белорусских рублях
    }
}
