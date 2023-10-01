package Composite;

import java.util.ArrayList;
import java.util.List;


//  ящик дл€ хранени€ простых и составных элементов.
class Box implements CustomItem{
    // ќбъ€вл€ем список, типизированный интерфейсом CustomItem.
    // Ёто позволит хранить в листе любые объекты, реализующие интерфейс CustomItem.
    List<CustomItem> items;
    // —оздаем конструктор. ¬о врем€ инициализации объекта Box создаем ArrayList.
    Box(){
        items = new ArrayList();
    }
    public void addItem(CustomItem customItem){// метод добавлени€ элементов в Box.
        items.add(customItem);
    }
    public void removeItem(CustomItem customItem){// метод удалени€ элементов из Box.
        items.remove(customItem);
    }
    //  переопределим методы getPrice() и printCost() дл€ составных элементов в €щике
    @Override
    public int getPrice() {
        int cost = 0;
        for (CustomItem item : items) {//перебираем все элементы массива
            cost += item.getPrice();
        }
        return cost;
    }
    @Override
    public void printCost() {
        int cost = 0;
        for (CustomItem item : items) {//перебираем все элементы массива
            cost += item.getPrice();
        }
        System.out.println(cost);
    }

}
