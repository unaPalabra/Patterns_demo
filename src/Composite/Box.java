package Composite;

import java.util.ArrayList;
import java.util.List;


//  ���� ��� �������� ������� � ��������� ���������.
class Box implements CustomItem{
    // ��������� ������, �������������� ����������� CustomItem.
    // ��� �������� ������� � ����� ����� �������, ����������� ��������� CustomItem.
    List<CustomItem> items;
    // ������� �����������. �� ����� ������������� ������� Box ������� ArrayList.
    Box(){
        items = new ArrayList();
    }
    public void addItem(CustomItem customItem){// ����� ���������� ��������� � Box.
        items.add(customItem);
    }
    public void removeItem(CustomItem customItem){// ����� �������� ��������� �� Box.
        items.remove(customItem);
    }
    //  ������������� ������ getPrice() � printCost() ��� ��������� ��������� � �����
    @Override
    public int getPrice() {
        int cost = 0;
        for (CustomItem item : items) {//���������� ��� �������� �������
            cost += item.getPrice();
        }
        return cost;
    }
    @Override
    public void printCost() {
        int cost = 0;
        for (CustomItem item : items) {//���������� ��� �������� �������
            cost += item.getPrice();
        }
        System.out.println(cost);
    }

}
