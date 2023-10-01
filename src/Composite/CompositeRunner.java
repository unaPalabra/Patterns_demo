package Composite;

class CompositeRunner {
    public static void main(String[] args) {
// ������� ������ ������� � �������� ���� 3 ������� ��������
        Box box1 = new Box();
        box1.addItem(new Item("pack1", 3));
        box1.addItem(new Item("pack2", 1));
        box1.addItem(new Item("pack3", 5));
// ������� ������ ������� � �������� ���� 3 ������� ��������
        Box box2 = new Box();
        box2.addItem(new Item("pack4", 8));
        box2.addItem(new Item("pack5", 4));
        box2.addItem(new Item("pack6", 5));
// ������� ������ ������� � �������� ���� 1 ������� ������� � 2 �������
        Box box3 = new Box();
        box3.addItem(new Item("pack7", 4));
        box3.addItem(box1);
        box3.addItem(box2);

        box3.printCost();//������� ��������� ���� ��������� �� ������� �������


    }
}
