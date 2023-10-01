package Composite;

class CompositeRunner {
    public static void main(String[] args) {
// создаем первую коробку и помещаем туда 3 простых элемента
        Box box1 = new Box();
        box1.addItem(new Item("pack1", 3));
        box1.addItem(new Item("pack2", 1));
        box1.addItem(new Item("pack3", 5));
// создаем вторую коробку и помещаем туда 3 простых элемента
        Box box2 = new Box();
        box2.addItem(new Item("pack4", 8));
        box2.addItem(new Item("pack5", 4));
        box2.addItem(new Item("pack6", 5));
// создаем третью коробку и помещаем туда 1 простой элемент и 2 коробки
        Box box3 = new Box();
        box3.addItem(new Item("pack7", 4));
        box3.addItem(box1);
        box3.addItem(box2);

        box3.printCost();//выводим стоимость всех элементов из третьей коробки


    }
}
