package Composite;

// ����������� ���������
class Item implements CustomItem {
    private String name;//  ��������
    private int price;//    ����

    //  �����������
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //  ������������� ������ getPrice() � printCost() ��� �������� �������
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void printCost() {
        System.out.println(name + ": price - " + price);
    }
}
