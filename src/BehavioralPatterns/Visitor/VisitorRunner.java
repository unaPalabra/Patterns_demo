package BehavioralPatterns.Visitor;

public class VisitorRunner {
    public static void main(String[] args) {
        ProductCollection pc = new ProductCollection();// ������� ��������� �������
        RubPriceVisitor rubPriceVisitor = new RubPriceVisitor();// ������� ����������, ������� ��������� ���� � ���������� �����
        BynPriceVisitor bynPriceVisitor = new BynPriceVisitor();// ������� ����������, ������� ��������� ���� � ����������� �����

        System.out.println("RUB");
        System.out.println(pc.getCost(rubPriceVisitor));// ������������� ��������� ������� ������� � ���������� �����
        System.out.println("\n++++++++++++++++++++++++\n");
        System.out.println("BYN");
        System.out.println(pc.getCost(bynPriceVisitor));// ������������� ��������� ������� ������� � ����������� �����

    }
}

