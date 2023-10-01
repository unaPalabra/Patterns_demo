package Composite;

// минимальный компонент
class Item implements CustomItem {
    private String name;//  название
    private int price;//    цена

    //  конструктор
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //  переопределим методы getPrice() и printCost() для простого объекта
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void printCost() {
        System.out.println(name + ": price - " + price);
    }
}
